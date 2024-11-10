/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package za.co.fnb.cish.fid.kafka.reader.util.avroaccess.registry;

import com.hortonworks.registries.schemaregistry.SchemaMetadata;
import com.hortonworks.registries.schemaregistry.SchemaMetadataInfo;
import com.hortonworks.registries.schemaregistry.SchemaVersionInfo;
import com.hortonworks.registries.schemaregistry.SchemaVersionKey;
import org.apache.avro.Schema;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.avro.AvroTypeUtil;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access.SchemaField;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access.SchemaNotFoundException;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.RecordSchema;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.SchemaIdentifier;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.utils.InitializationException;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.utils.Tuple;

import java.io.IOException;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HortonworksSchemaRegistry implements SchemaRegistry {
    private static final Set<SchemaField> schemaFields = EnumSet.of(SchemaField.SCHEMA_NAME, SchemaField.SCHEMA_TEXT,
            SchemaField.SCHEMA_TEXT_FORMAT, SchemaField.SCHEMA_IDENTIFIER, SchemaField.SCHEMA_VERSION);

    private final ConcurrentMap<Tuple<SchemaIdentifier, String>, RecordSchema> schemaNameToSchemaMap = new ConcurrentHashMap<>();
    private final ConcurrentMap<String, Tuple<SchemaVersionInfo, Long>> schemaVersionByNameCache = new ConcurrentHashMap<>();
    private final ConcurrentMap<SchemaVersionKey, Tuple<SchemaVersionInfo, Long>> schemaVersionByKeyCache = new ConcurrentHashMap<>();

    private volatile long versionInfoCacheNanos;

    private volatile SchemaRegistryClient schemaRegistryClient;
    private volatile boolean initialized;
    private volatile Map<String, Object> schemaRegistryConfig;

    public void enable() throws InitializationException {
        schemaRegistryConfig = new HashMap<>();

        versionInfoCacheNanos = 3600000000000L;

        // The below properties may or may not need to be exposed to the end
        // user. We just need to watch usage patterns to see if sensible default
        // can satisfy NiFi requirements
        String urlValue = "http://dna-rbsamnode03.fnb.co.za:7788/api/v1";
        if (urlValue == null || urlValue.trim().isEmpty()) {
            throw new IllegalArgumentException("'Schema Registry URL' must not be null or empty.");
        }

        schemaRegistryConfig.put(SchemaRegistryClient.Configuration.SCHEMA_REGISTRY_URL.name(), urlValue);
        schemaRegistryConfig.put(SchemaRegistryClient.Configuration.CLASSLOADER_CACHE_SIZE.name(), 10L);
        schemaRegistryConfig.put(SchemaRegistryClient.Configuration.CLASSLOADER_CACHE_EXPIRY_INTERVAL_SECS.name(), 3600);
        schemaRegistryConfig.put(SchemaRegistryClient.Configuration.SCHEMA_VERSION_CACHE_SIZE.name(), 1000);
        schemaRegistryConfig.put(SchemaRegistryClient.Configuration.SCHEMA_VERSION_CACHE_EXPIRY_INTERVAL_SECS.name(), 3600);
    }

    public void close() {
        if (schemaRegistryClient != null) {
            //schemaRegistryClient.close();
        }

        initialized = false;
    }

    protected synchronized SchemaRegistryClient getClient() {
        if (!initialized) {
            schemaRegistryClient = new SchemaRegistryClient(schemaRegistryConfig);
            initialized = true;
        }

        return schemaRegistryClient;
    }

    public synchronized SchemaRegistryClient getClient(String httpProtocol, String host, int port,
                                                       String keytabLocation, String userPrincipal) {
        if (!initialized) {
            schemaRegistryConfig.put(SchemaRegistryClient.Configuration.HTTP_PROTOCOL.name(), httpProtocol);
            schemaRegistryConfig.put(SchemaRegistryClient.Configuration.SCHEMA_REGISTRY_HOST.name(), host);
            schemaRegistryConfig.put(SchemaRegistryClient.Configuration.SCHEMA_REGISTRY_PORT.name(), port);
            schemaRegistryConfig.put(SchemaRegistryClient.Configuration.KEYTAB_LOCATION.name(), keytabLocation);
            schemaRegistryConfig.put(SchemaRegistryClient.Configuration.USER_PRINCIPAL.name(), userPrincipal);
            schemaRegistryClient = new SchemaRegistryClient(schemaRegistryConfig);
            initialized = true;
        }

        return schemaRegistryClient;
    }

    private SchemaVersionInfo getLatestSchemaVersionInfo(final SchemaRegistryClient client, final String schemaName) throws SchemaNotFoundException {
        try {
            // Try to fetch the SchemaVersionInfo from the cache.
            final Tuple<SchemaVersionInfo, Long> timestampedVersionInfo = schemaVersionByNameCache.get(schemaName);

            // Determine if the timestampedVersionInfo is expired
            boolean fetch = false;
            if (timestampedVersionInfo == null) {
                fetch = true;
            } else {
                final long minTimestamp = System.nanoTime() - versionInfoCacheNanos;
                fetch = timestampedVersionInfo.getValue() < minTimestamp;
            }

            // If not expired, use what we got from the cache
            if (!fetch) {
                return timestampedVersionInfo.getKey();
            }

            // schema version info was expired or not found in cache. Fetch from schema registry
            final SchemaVersionInfo versionInfo = client.getLatestSchemaVersionInfo(schemaName);
            if (versionInfo == null) {
                throw new SchemaNotFoundException("Could not find schema with name '" + schemaName + "'");
            }

            // Store new version in cache.
            final Tuple<SchemaVersionInfo, Long> tuple = new Tuple<>(versionInfo, System.nanoTime());
            schemaVersionByNameCache.put(schemaName, tuple);
            return versionInfo;
        } catch (final Exception e) {
            throw new SchemaNotFoundException(e);
        }
    }

    private SchemaVersionInfo getSchemaVersionInfo(final SchemaRegistryClient client, final SchemaVersionKey key) throws SchemaNotFoundException {
        try {
            // Try to fetch the SchemaVersionInfo from the cache.
            final Tuple<SchemaVersionInfo, Long> timestampedVersionInfo = schemaVersionByKeyCache.get(key);

            // Determine if the timestampedVersionInfo is expired
            boolean fetch = false;
            if (timestampedVersionInfo == null) {
                fetch = true;
            } else {
                final long minTimestamp = System.nanoTime() - versionInfoCacheNanos;
                fetch = timestampedVersionInfo.getValue() < minTimestamp;
            }

            // If not expired, use what we got from the cache
            if (!fetch) {
                return timestampedVersionInfo.getKey();
            }

            // schema version info was expired or not found in cache. Fetch from schema registry
            final SchemaVersionInfo versionInfo = client.getSchemaVersionInfo(key);
            if (versionInfo == null) {
                throw new SchemaNotFoundException("Could not find schema with name '" + key.getSchemaName() + "' and version " + key.getVersion());
            }

            // Store new version in cache.
            final Tuple<SchemaVersionInfo, Long> tuple = new Tuple<>(versionInfo, System.nanoTime());
            schemaVersionByKeyCache.put(key, tuple);
            return versionInfo;
        } catch (final Exception e) {
            throw new SchemaNotFoundException(e);
        }
    }

    @Override
    public String retrieveSchemaText(final String schemaName) throws SchemaNotFoundException {
        final SchemaVersionInfo latest = getLatestSchemaVersionInfo(getClient(), schemaName);
        return latest.getSchemaText();
    }


    @Override
    public RecordSchema retrieveSchema(final String schemaName) throws SchemaNotFoundException, IOException {
        final SchemaRegistryClient client = getClient();

        final SchemaVersionInfo versionInfo;
        final Long schemaId;
        final Integer version;

        try {
            final SchemaMetadataInfo metadataInfo = client.getSchemaMetadataInfo(schemaName);
            if (metadataInfo == null) {
                throw new SchemaNotFoundException("Could not find schema with name '" + schemaName + "'");
            }

            schemaId = metadataInfo.getId();
            if (schemaId == null) {
                throw new SchemaNotFoundException("Could not find schema with name '" + schemaName + "'");
            }

            versionInfo = getLatestSchemaVersionInfo(client, schemaName);
            version = versionInfo.getVersion();
            if (version == null) {
                throw new SchemaNotFoundException("Could not find schema with name '" + schemaName + "'");
            }
        } catch (final Exception e) {
            handleException("Failed to retrieve schema with name '" + schemaName + "'", e);
            return null;
        }

        final String schemaText = versionInfo.getSchemaText();
        final SchemaIdentifier schemaIdentifier = (schemaId == null || version == null) ? SchemaIdentifier.ofName(schemaName) : SchemaIdentifier.of(schemaName, schemaId, version);

        final Tuple<SchemaIdentifier, String> tuple = new Tuple<>(schemaIdentifier, schemaText);
        return schemaNameToSchemaMap.computeIfAbsent(tuple, t -> {
            final Schema schema = new Schema.Parser().parse(schemaText);
            return AvroTypeUtil.createSchema(schema, schemaText, schemaIdentifier);
        });
    }

    public RecordSchema retrieveSchema(final String schemaName, final int version, final String host, final int port,
                                       final String httpProtocol, final String keytabLocation,
                                       final String userPrincipal) throws SchemaNotFoundException, IOException {

        final SchemaRegistryClient client = getClient(httpProtocol, host, port, keytabLocation, userPrincipal);

        final SchemaVersionInfo versionInfo;
        final Long schemaId;

        try {
            final SchemaMetadataInfo metadataInfo = client.getSchemaMetadataInfo(schemaName);
            if (metadataInfo == null) {
                throw new SchemaNotFoundException("Could not find schema with name '" + schemaName + "'");
            }

            schemaId = metadataInfo.getId();
            if (schemaId == null) {
                throw new SchemaNotFoundException("Could not find schema with name '" + schemaName + "'");
            }

            final SchemaVersionKey schemaVersionKey = new SchemaVersionKey(schemaName, version);
            versionInfo = getSchemaVersionInfo(client, schemaVersionKey);
            if (versionInfo == null) {
                throw new SchemaNotFoundException("Could not find schema with ID '" + schemaId + "' and version '" + version + "'");
            }
        } catch (final Exception e) {
            handleException("Failed to retrieve schema with name '" + schemaName + "'", e);
            return null;
        }

        final String schemaText = versionInfo.getSchemaText();
        final SchemaIdentifier schemaIdentifier = (schemaId == null) ? SchemaIdentifier.ofName(schemaName) : SchemaIdentifier.of(schemaName, schemaId, version);

        final Tuple<SchemaIdentifier, String> tuple = new Tuple<>(schemaIdentifier, schemaText);
        return schemaNameToSchemaMap.computeIfAbsent(tuple, t -> {
            final Schema schema = new Schema.Parser().parse(schemaText);
            return AvroTypeUtil.createSchema(schema, schemaText, schemaIdentifier);
        });
    }


    @Override
    public String retrieveSchemaText(final long schemaId, final int version) throws SchemaNotFoundException, IOException {
        final SchemaRegistryClient client = getClient();

        try {
            final SchemaMetadataInfo info = client.getSchemaMetadataInfo(schemaId);
            if (info == null) {
                throw new SchemaNotFoundException("Could not find schema with ID '" + schemaId + "' and version '" + version + "'");
            }

            final SchemaMetadata metadata = info.getSchemaMetadata();
            final String schemaName = metadata.getName();

            final SchemaVersionKey schemaVersionKey = new SchemaVersionKey(schemaName, version);
            final SchemaVersionInfo versionInfo = getSchemaVersionInfo(client, schemaVersionKey);
            if (versionInfo == null) {
                throw new SchemaNotFoundException("Could not find schema with ID '" + schemaId + "' and version '" + version + "'");
            }

            return versionInfo.getSchemaText();
        } catch (final Exception e) {
            handleException("Failed to retrieve schema with ID '" + schemaId + "' and version '" + version + "'", e);
            return null;
        }
    }

    @Override
    public RecordSchema retrieveSchema(final long schemaId, final int version) throws SchemaNotFoundException, IOException {
        final SchemaRegistryClient client = getClient();

        final String schemaName;
        final SchemaVersionInfo versionInfo;
        try {
            final SchemaMetadataInfo info = client.getSchemaMetadataInfo(schemaId);
            if (info == null) {
                throw new SchemaNotFoundException("Could not find schema with ID '" + schemaId + "' and version '" + version + "'");
            }

            final SchemaMetadata metadata = info.getSchemaMetadata();
            schemaName = metadata.getName();

            final SchemaVersionKey schemaVersionKey = new SchemaVersionKey(schemaName, version);
            versionInfo = getSchemaVersionInfo(client, schemaVersionKey);
            if (versionInfo == null) {
                throw new SchemaNotFoundException("Could not find schema with ID '" + schemaId + "' and version '" + version + "'");
            }
        } catch (final Exception e) {
            handleException("Failed to retrieve schema with ID '" + schemaId + "' and version '" + version + "'", e);
            return null;
        }

        final String schemaText = versionInfo.getSchemaText();

        final SchemaIdentifier schemaIdentifier = SchemaIdentifier.of(schemaName, schemaId, version);
        final Tuple<SchemaIdentifier, String> tuple = new Tuple<>(schemaIdentifier, schemaText);
        return schemaNameToSchemaMap.computeIfAbsent(tuple, t -> {
            final Schema schema = new Schema.Parser().parse(schemaText);
            return AvroTypeUtil.createSchema(schema, schemaText, schemaIdentifier);
        });
    }

    // The schema registry client wraps all IOExceptions in RuntimeException. So if an IOException occurs, we don't know
    // that it was an IO problem. So we will look through the Exception's cause chain to see if there is an IOException present.
    private void handleException(final String message, final Exception e) throws IOException, SchemaNotFoundException {
        if (containsIOException(e)) {
            throw new IOException(message, e);
        }

        throw new SchemaNotFoundException(message, e);
    }

    private boolean containsIOException(final Throwable t) {
        if (t == null) {
            return false;
        }

        if (t instanceof IOException) {
            return true;
        }

        final Throwable cause = t.getCause();
        if (cause == null) {
            return false;
        }

        return containsIOException(cause);
    }

    @Override
    public Set<SchemaField> getSuppliedSchemaFields() {
        return schemaFields;
    }
}