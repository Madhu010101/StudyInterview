package za.co.fnb.cish.fid.kafka.reader.util.avroaccess.registry;

/**
 * Copyright 2016 Hortonworks.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Preconditions;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.gson.Gson;
import com.hortonworks.registries.schemaregistry.*;
import com.hortonworks.registries.schemaregistry.cache.SchemaVersionInfoCache;
import com.hortonworks.registries.schemaregistry.client.*;
import com.hortonworks.registries.schemaregistry.errors.*;
import com.hortonworks.registries.schemaregistry.serde.SerDesException;
import com.hortonworks.registries.schemaregistry.state.SchemaLifecycleException;
import com.hortonworks.registries.schemaregistry.state.SchemaVersionLifecycleStateMachineInfo;
import org.apache.commons.io.IOUtils;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.params.AuthPolicy;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.glassfish.jersey.client.ClientProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.kerberos.client.KerberosRestTemplate;
import org.yaml.snakeyaml.Yaml;

import javax.security.auth.Subject;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.PrivilegedAction;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import static com.hortonworks.registries.schemaregistry.client.SchemaRegistryClient.Configuration.SCHEMA_REGISTRY_URL;

/**
 * This is the default implementation of {@link ISchemaRegistryClient} which connects to the given {@code rootCatalogURL}.
 * <p>
 * An instance of SchemaRegistryClient can be instantiated by passing configuration properties like below.
 * <pre>
 *     SchemaRegistryClient schemaRegistryClient = new SchemaRegistryClient(config);
 * </pre>
 * <p>
 * There are different options available as mentioned in {@link Configuration} like
 * <pre>
 * - {@link Configuration#SCHEMA_REGISTRY_URL}.
 * - {@link Configuration#SCHEMA_METADATA_CACHE_SIZE}.
 * - {@link Configuration#SCHEMA_METADATA_CACHE_EXPIRY_INTERVAL_SECS}.
 * - {@link Configuration#SCHEMA_VERSION_CACHE_SIZE}.
 * - {@link Configuration#SCHEMA_VERSION_CACHE_EXPIRY_INTERVAL_SECS}.
 * - {@link Configuration#SCHEMA_TEXT_CACHE_SIZE}.
 * - {@link Configuration#SCHEMA_TEXT_CACHE_EXPIRY_INTERVAL_SECS}.
 *
 * and many other properties like {@link ClientProperties}
 * </pre>
 * <pre>
 * This can be used to
 *      - register schema metadata
 *      - add new versions of a schema
 *      - fetch different versions of schema
 *      - fetch latest version of a schema
 *      - check whether the given schema text is compatible with a latest version of the schema
 *      - register serializer/deserializer for a schema
 *      - fetch serializer/deserializer for a schema
 * </pre>
 */
public class SchemaRegistryClient implements ISchemaRegistryClient {
    private static final Logger LOG = LoggerFactory.getLogger(SchemaRegistryClient.class);

    private static final String SCHEMA_REGISTRY_PATH = "/schemaregistry";
    private static final String SCHEMAS_PATH = "/schemas";
    private static final String SCHEMA_PROVIDERS_PATH = "/schemaproviders";
    private static final String SCHEMAS_BY_ID_PATH = "/schemasById";
    private static final String SCHEMA_VERSIONS_PATH = "versions";
    private static Subject subject;

    //public static final MediaType MediaTypeJSON = MediaType.parse("application/json; charset=utf-8");

    private final DefaultHttpClient client;
    private final Gson gson;
    private final UrlSelector urlSelector;
    private final Map<String, SchemaRegistryTargets> urlWithTargets;

    private final Configuration configuration;
    private final KerberosRestTemplate restTemplate;
    private final ClassLoaderCache classLoaderCache;
    private final SchemaVersionInfoCache schemaVersionInfoCache;
    private final SchemaMetadataCache schemaMetadataCache;
    private final Cache<SchemaDigestEntry, SchemaIdVersion> schemaTextCache;

    /**
     * Creates {@link SchemaRegistryClient} instance with the given yaml config.
     *
     * @param confFile config file which contains the configuration entries.
     *
     * @throws IOException when any IOException occurs while reading the given confFile
     */

    private static Map<String, ?> buildConfFromFile(File confFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(confFile)) {
            return (Map<String, Object>) new Yaml().load(IOUtils.toString(fis, "UTF-8"));
        }
    }

    @Override
    public SchemaIdVersion uploadSchemaVersion(String s, String s1, InputStream inputStream) throws InvalidSchemaException, IncompatibleSchemaException, SchemaNotFoundException, SchemaBranchNotFoundException {
        return null;
    }

    @Override
    public SchemaIdVersion uploadSchemaVersion(String s, String s1, String s2, InputStream inputStream) throws InvalidSchemaException, IncompatibleSchemaException, SchemaNotFoundException, SchemaBranchNotFoundException {
        return null;
    }

    @Override
    public boolean isCompatibleWithAllVersions(String s, String s1) throws SchemaNotFoundException, SchemaBranchNotFoundException {
        return false;
    }

    @Override
    public boolean isCompatibleWithAllVersions(String s, String s1, String s2) throws SchemaNotFoundException, SchemaBranchNotFoundException {
        return false;
    }

    @Override
    public <T> T getDefaultSerializer(String s) throws SerDesException {
        return null;
    }

    @Override
    public <T> T getDefaultDeserializer(String s) throws SerDesException {
        return null;
    }

    @Override
    public <T> T createSerializerInstance(SerDesInfo serDesInfo) {
        return null;
    }

    @Override
    public <T> T createDeserializerInstance(SerDesInfo serDesInfo) {
        return null;
    }

    private SchemaDigestEntry buildSchemaTextEntry(SchemaVersion schemaVersion, String name) {
        byte[] digest;
        try {
            digest = MessageDigest.getInstance("MD5").digest(schemaVersion.getSchemaText().getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }

        // storing schema text string is expensive, so storing digest in cache's key.
        return new SchemaDigestEntry(name, digest);
    }

    private SchemaIdVersion handleSchemaIdVersionResponse(SchemaMetadataInfo schemaMetadataInfo,
                                                          String msg) throws IncompatibleSchemaException, InvalidSchemaException {

        Integer version = readEntity(msg, Integer.class);

        SchemaVersionInfo schemaVersionInfo = doGetSchemaVersionInfo(new SchemaVersionKey(schemaMetadataInfo.getSchemaMetadata()
                .getName(), version));

        return new SchemaIdVersion(schemaMetadataInfo.getId(), version, schemaVersionInfo.getId());
    }

    private SchemaIdVersion doAddSchemaVersion(String schemaBranchName, String schemaName,
                                               SchemaVersion schemaVersion) throws IncompatibleSchemaException, InvalidSchemaException, SchemaNotFoundException {
        SchemaMetadataInfo schemaMetadataInfo = getSchemaMetadataInfo(schemaName);
        if (schemaMetadataInfo == null) {
            throw new SchemaNotFoundException("Schema with name " + schemaName + " not found");
        }

        URIBuilder uriBuilder = currentSchemaRegistryTargets().getSchemasTarget();
        uriBuilder.setPath(uriBuilder.getPath() + "/" + schemaName + "/versions").addParameter("branch", schemaBranchName);
        String msg = postEntity(uriBuilder,schemaVersion,String.class);
        return handleSchemaIdVersionResponse(schemaMetadataInfo, msg);
    }

    @Override
    public SchemaIdVersion addSchemaVersion(SchemaMetadata schemaMetadata, SchemaVersion schemaVersion) throws
            InvalidSchemaException, IncompatibleSchemaException, SchemaNotFoundException, SchemaBranchNotFoundException {
        return addSchemaVersion(SchemaBranch.MASTER_BRANCH, schemaMetadata, schemaVersion);
    }

    @Override
    public SchemaIdVersion addSchemaVersion(String schemaBranchName, SchemaMetadata schemaMetadata, SchemaVersion schemaVersion) throws
            InvalidSchemaException, IncompatibleSchemaException, SchemaNotFoundException, SchemaBranchNotFoundException {
        // get it, if it exists in cache
        SchemaDigestEntry schemaDigestEntry = buildSchemaTextEntry(schemaVersion, schemaMetadata.getName());
        SchemaIdVersion schemaIdVersion = schemaTextCache.getIfPresent(schemaDigestEntry);

        if (schemaIdVersion == null) {
            //register schema metadata if it does not exist
            Long metadataId = registerSchemaMetadata(schemaMetadata);
            if (metadataId == null) {
                LOG.error("Schema Metadata [{}] is not registered successfully", schemaMetadata);
                throw new RuntimeException("Given SchemaMetadata could not be registered: " + schemaMetadata);
            }

            // add schemaIdVersion
            schemaIdVersion = addSchemaVersion(schemaBranchName, schemaMetadata.getName(), schemaVersion);
        }

        return schemaIdVersion;
    }


    @Override
    public SchemaIdVersion addSchemaVersion(final String schemaName, final SchemaVersion schemaVersion)
            throws InvalidSchemaException, IncompatibleSchemaException, SchemaNotFoundException, SchemaBranchNotFoundException {
        return addSchemaVersion(SchemaBranch.MASTER_BRANCH, schemaName, schemaVersion);
    }

    @Override
    public SchemaIdVersion addSchemaVersion(final String schemaBranchName, final String schemaName, final SchemaVersion schemaVersion)
            throws InvalidSchemaException, IncompatibleSchemaException, SchemaNotFoundException, SchemaBranchNotFoundException {

        try {
            return schemaTextCache.get(buildSchemaTextEntry(schemaVersion, schemaName),
                    () -> doAddSchemaVersion(schemaBranchName, schemaName, schemaVersion));
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            LOG.error("Encountered error while adding new version [{}] of schema [{}] and error [{}]", schemaVersion, schemaName, e);
            if (cause != null) {
                if (cause instanceof InvalidSchemaException)
                    throw (InvalidSchemaException) cause;
                else if (cause instanceof IncompatibleSchemaException) {
                    throw (IncompatibleSchemaException) cause;
                } else if (cause instanceof SchemaNotFoundException) {
                    throw (SchemaNotFoundException) cause;
                } else {
                    throw new RuntimeException(cause.getMessage(), cause);
                }
            } else {
                throw new RuntimeException(e.getMessage(), e);
            }
        }
    }

    @Override
    public void deleteSchemaVersion(SchemaVersionKey schemaVersionKey) throws SchemaNotFoundException, SchemaLifecycleException {

    }

    @Override
    public CompatibilityResult checkCompatibility(String s, String s1) throws SchemaNotFoundException, SchemaBranchNotFoundException {
        return null;
    }

    @Override
    public CompatibilityResult checkCompatibility(String s, String s1, String s2) throws SchemaNotFoundException, SchemaBranchNotFoundException {
        return null;
    }

    @Override
    public Collection<SchemaVersionKey> findSchemasByFields(SchemaFieldQuery schemaFieldQuery) throws SchemaBranchNotFoundException, SchemaNotFoundException {
        return null;
    }

    @Override
    public String uploadFile(InputStream inputStream) throws SerDesException {
        return null;
    }

    @Override
    public InputStream downloadFile(String s) throws IOException {
        return null;
    }

    @Override
    public Long addSerDes(SerDesPair serDesPair) {
        return null;
    }

    @Override
    public void mapSchemaWithSerDes(String s, Long aLong) {

    }

    @Override
    public Collection<SerDesInfo> getSerDes(String s) {
        return null;
    }

    @Override
    public void transitionState(Long aLong, Byte aByte, byte[] bytes) throws SchemaNotFoundException, SchemaLifecycleException {

    }

    @Override
    public SchemaVersionLifecycleStateMachineInfo getSchemaVersionLifecycleStateMachineInfo() {
        return null;
    }

    @Override
    public SchemaBranch createSchemaBranch(Long aLong, SchemaBranch schemaBranch) throws SchemaBranchAlreadyExistsException, SchemaNotFoundException {
        return null;
    }

    @Override
    public Collection<SchemaBranch> getSchemaBranches(String s) throws SchemaNotFoundException {
        return null;
    }

    @Override
    public void deleteSchemaBranch(Long aLong) throws SchemaBranchNotFoundException, InvalidSchemaBranchDeletionException {

    }

    @Override
    public Long addSchemaMetadata(SchemaMetadata schemaMetadata) {
        SchemaMetadataInfo schemaMetadataInfo = schemaMetadataCache.getIfPresent(SchemaMetadataCache.Key.of(schemaMetadata
                .getName()));
        if (schemaMetadataInfo == null) {
            return postEntity(currentSchemaRegistryTargets().getSchemasTarget(), schemaMetadata, Long.class);
        }

        return schemaMetadataInfo.getId();
    }

    @Override
    public SchemaMetadataInfo updateSchemaMetadata(String s, SchemaMetadata schemaMetadata) {
        return null;
    }

    @Override
    public void close() throws Exception {

    }

    public SchemaRegistryClient(Map<String, ?> conf) {
        configuration = new Configuration(conf);

        String keytabLocation = configuration.getValue(Configuration.KEYTAB_LOCATION.name());
        String userPricipal = configuration.getValue(Configuration.USER_PRINCIPAL.name());
        restTemplate = new KerberosRestTemplate(keytabLocation, userPricipal);

        client = new DefaultHttpClient();
        try {
            client.getAuthSchemes().register(AuthPolicy.SPNEGO, new SPNegoSchemeFactory());
            Credentials use_jaas_creds = new Credentials() {
                public String getPassword() {
                    return null;
                }

                public Principal getUserPrincipal() {
                    return null;
                }
            };
            client.getCredentialsProvider().setCredentials(
                    new AuthScope(null, -1, null),
                    use_jaas_creds);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        gson = new Gson();

        // get list of urls and create given or default UrlSelector.
        urlSelector = createUrlSelector();
        urlWithTargets = new ConcurrentHashMap<>();

        classLoaderCache = new ClassLoaderCache(this);

        schemaVersionInfoCache = new SchemaVersionInfoCache(
                new SchemaVersionRetriever() {
                    @Override
                    public SchemaVersionInfo retrieveSchemaVersion(SchemaVersionKey key) throws SchemaNotFoundException {
                        return doGetSchemaVersionInfo(key);
                    }

                    @Override
                    public SchemaVersionInfo retrieveSchemaVersion(SchemaIdVersion key) throws SchemaNotFoundException {
                        return doGetSchemaVersionInfo(key);
                    }
                },
                ((Number) configuration.getValue(Configuration.SCHEMA_VERSION_CACHE_SIZE.name())).intValue(),
                ((Number) configuration.getValue(Configuration.SCHEMA_VERSION_CACHE_EXPIRY_INTERVAL_SECS.name())).longValue() * 1000L
        );

        SchemaMetadataCache.SchemaMetadataFetcher schemaMetadataFetcher = createSchemaMetadataFetcher();
        schemaMetadataCache = new SchemaMetadataCache(((Number) configuration.getValue(Configuration.SCHEMA_METADATA_CACHE_SIZE
                .name())).longValue(),
                ((Number) configuration.getValue(Configuration.SCHEMA_METADATA_CACHE_EXPIRY_INTERVAL_SECS
                        .name())).longValue(),
                schemaMetadataFetcher);

        schemaTextCache = CacheBuilder.newBuilder()
                .maximumSize(((Number) configuration.getValue(Configuration.SCHEMA_TEXT_CACHE_SIZE
                        .name())).longValue())
                .expireAfterAccess(((Number) configuration.getValue(Configuration.SCHEMA_TEXT_CACHE_EXPIRY_INTERVAL_SECS
                                .name())).longValue(),
                        TimeUnit.SECONDS)
                .build();
    }

    private SchemaRegistryTargets currentSchemaRegistryTargets() {
        String url = urlSelector.select();
        urlWithTargets.computeIfAbsent(url, s -> new SchemaRegistryTargets(configuration));
        return urlWithTargets.get(url);
    }

    private static class SchemaRegistryTargets {
        private Configuration configuration;

        SchemaRegistryTargets(Configuration configuration) {
            this.configuration = configuration;
        }

        private URIBuilder getSchemaProvidersTarget() {
            URIBuilder builder = new URIBuilder();
            builder.setScheme(configuration.getValue(Configuration.HTTP_PROTOCOL.name()))
                    .setHost(configuration.getValue(Configuration.SCHEMA_REGISTRY_HOST.name()))
                    .setPort(configuration.getValue(Configuration.SCHEMA_REGISTRY_PORT.name()))
                    .setPath("api/v1" + SCHEMA_REGISTRY_PATH + SCHEMA_PROVIDERS_PATH);
            return builder;
        }

        private URIBuilder getSchemasTarget() {
            URIBuilder builder = new URIBuilder();
            builder.setScheme(configuration.getValue(Configuration.HTTP_PROTOCOL.name()))
                    .setHost(configuration.getValue(Configuration.SCHEMA_REGISTRY_HOST.name()))
                    .setPort(configuration.getValue(Configuration.SCHEMA_REGISTRY_PORT.name()))
                    .setPath("api/v1" + SCHEMA_REGISTRY_PATH + SCHEMAS_PATH);
            return builder;
        }

        private URIBuilder getSchemasByIdTarget() {
            URIBuilder builder = new URIBuilder();
            builder.setScheme(configuration.getValue(Configuration.HTTP_PROTOCOL.name()))
                    .setHost(configuration.getValue(Configuration.SCHEMA_REGISTRY_HOST.name()))
                    .setPort(configuration.getValue(Configuration.SCHEMA_REGISTRY_PORT.name()))
                    .setPath("api/v1" + SCHEMA_REGISTRY_PATH + SCHEMAS_BY_ID_PATH);
            return builder;
        }

        private URIBuilder getSchemaVersionsByIdTarget() {
            URIBuilder builder = new URIBuilder();
            builder.setScheme(configuration.getValue(Configuration.HTTP_PROTOCOL.name()))
                    .setHost(configuration.getValue(Configuration.SCHEMA_REGISTRY_HOST.name()))
                    .setPort(configuration.getValue(Configuration.SCHEMA_REGISTRY_PORT.name()))
                    .setPath("api/v1" + SCHEMA_REGISTRY_PATH + SCHEMAS_PATH + "/versionsById");
            return builder;
        }
    }

    private UrlSelector createUrlSelector() {
        UrlSelector urlSelector = null;
        String rootCatalogURL = configuration.getValue(SCHEMA_REGISTRY_URL.name());
        String urlSelectorClass = configuration.getValue(Configuration.URL_SELECTOR_CLASS.name());
        if (urlSelectorClass == null) {
            urlSelector = new LoadBalancedFailoverUrlSelector(rootCatalogURL);
        } else {
            try {
                urlSelector = (UrlSelector) Class.forName(urlSelectorClass)
                        .getConstructor(String.class)
                        .newInstance(rootCatalogURL);
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException
                    | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        urlSelector.init(configuration.getConfig());

        return urlSelector;
    }

    private SchemaMetadataCache.SchemaMetadataFetcher createSchemaMetadataFetcher() {
        return new SchemaMetadataCache.SchemaMetadataFetcher() {
            @Override
            public SchemaMetadataInfo fetch(String name) throws SchemaNotFoundException {
                try {
                    URIBuilder uriBuilder = currentSchemaRegistryTargets().getSchemasTarget();
                    return getEntity(uriBuilder.setPath(uriBuilder.getPath() + "/" + name), SchemaMetadataInfo.class);
                } catch (Exception e) {
                    LOG.info("throwing");
                    throw new SchemaNotFoundException(e);
                }
            }

            @Override
            public SchemaMetadataInfo fetch(Long id) throws SchemaNotFoundException {
                try {
                    URIBuilder uriBuilder = currentSchemaRegistryTargets().getSchemasByIdTarget();
                    return getEntity(uriBuilder.setPath(uriBuilder.getPath() + "/" + id.toString()), SchemaMetadataInfo.class);
                } catch (Exception e) {
                    throw new SchemaNotFoundException(e);
                }
            }
        };
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    @Override
    public Collection<SchemaProviderInfo> getSupportedSchemaProviders() {
        return getEntities(currentSchemaRegistryTargets().getSchemaProvidersTarget(), SchemaProviderInfo.class);
    }

    @Override
    public Long registerSchemaMetadata(SchemaMetadata schemaMetadata) {
        return addSchemaMetadata(schemaMetadata);
    }

    @Override
    public SchemaMetadataInfo getSchemaMetadataInfo(String schemaName) {
        return schemaMetadataCache.get(SchemaMetadataCache.Key.of(schemaName));
    }

    @Override
    public SchemaMetadataInfo getSchemaMetadataInfo(Long schemaMetadataId) {
        return schemaMetadataCache.get(SchemaMetadataCache.Key.of(schemaMetadataId));
    }

    public SchemaVersionInfo getSchemaVersionInfo(SchemaIdVersion schemaIdVersion) throws SchemaNotFoundException {
        try {
            return schemaVersionInfoCache.getSchema(SchemaVersionInfoCache.Key.of(schemaIdVersion));
        } catch (SchemaNotFoundException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public SchemaVersionInfo getLatestSchemaVersionInfo(String schemaName) throws SchemaNotFoundException {
        return getLatestSchemaVersionInfo(SchemaBranch.MASTER_BRANCH, schemaName);
    }

    @Override
    public SchemaVersionInfo getSchemaVersionInfo(SchemaVersionKey schemaVersionKey) throws SchemaNotFoundException {
        try {
            return schemaVersionInfoCache.getSchema(SchemaVersionInfoCache.Key.of(schemaVersionKey));
        } catch (SchemaNotFoundException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private SchemaVersionInfo doGetSchemaVersionInfo(SchemaIdVersion schemaIdVersion) throws SchemaNotFoundException {
        if (schemaIdVersion.getSchemaVersionId() != null) {
            LOG.info("Getting schema version from target registry for [{}]", schemaIdVersion.getSchemaVersionId());
            URIBuilder uriBuilder = currentSchemaRegistryTargets().getSchemasTarget();
            return getEntity(uriBuilder.setPath(uriBuilder.getPath() + "/" + schemaIdVersion.getSchemaVersionId().toString()),
                    SchemaVersionInfo.class);
        } else if (schemaIdVersion.getSchemaMetadataId() != null) {
            SchemaMetadataInfo schemaMetadataInfo = getSchemaMetadataInfo(schemaIdVersion.getSchemaMetadataId());
            SchemaVersionKey schemaVersionKey = new SchemaVersionKey(schemaMetadataInfo.getSchemaMetadata()
                    .getName(), schemaIdVersion.getVersion());
            LOG.info("Getting schema version from target registry for key [{}]", schemaVersionKey);
            return doGetSchemaVersionInfo(schemaVersionKey);
        }

        throw new IllegalArgumentException("Given argument not valid: " + schemaIdVersion);
    }

    private SchemaVersionInfo doGetSchemaVersionInfo(SchemaVersionKey schemaVersionKey) {
        LOG.info("Getting schema version from target registry for [{}]", schemaVersionKey);
        String schemaName = schemaVersionKey.getSchemaName();
        URIBuilder uriBuilder = currentSchemaRegistryTargets().getSchemasTarget();
        return getEntity(
                uriBuilder.setPath(uriBuilder.getPath() + "/" + schemaName + "/versions/" + String.valueOf(schemaVersionKey.getVersion())),
                SchemaVersionInfo.class);
    }

    @Override
    public SchemaVersionInfo getLatestSchemaVersionInfo(String schemaBranchName, String schemaName) throws SchemaNotFoundException {
        URIBuilder uriBuilder = currentSchemaRegistryTargets().getSchemasTarget();
        return getEntity(
                uriBuilder.setPath(uriBuilder.getPath() + "/" + schemaName + "/versions/latest").addParameter("branch", schemaBranchName),
                SchemaVersionInfo.class);
    }

    @Override
    public Collection<SchemaVersionInfo> getAllVersions(String schemaName) throws SchemaNotFoundException {
        return getAllVersions(SchemaBranch.MASTER_BRANCH, schemaName);
    }

    private static String encode(String schemaName) {
        try {
            return URLEncoder.encode(schemaName, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Collection<SchemaVersionInfo> getAllVersions(String s, String s1) throws SchemaNotFoundException, SchemaBranchNotFoundException {
        return null;
    }

    @Override
    public Collection<SchemaVersionInfo> getAllVersions(String s, String s1, List<Byte> list) throws SchemaNotFoundException, SchemaBranchNotFoundException {
        return null;
    }

    private <T> List<T> getEntities(URIBuilder target, Class<T> clazz) {
        String response = Subject.doAs(subject, new PrivilegedAction<String>() {
            @Override
            public String run() {
                try {
                    return restTemplate.getForObject(target.build().toString(), String.class);
                } catch (Exception ex) {
                    LOG.error("error processing request", ex);
                }
                return null;
            }
        });
        return parseResponseAsEntities(response, clazz);
    }

    private <T> List<T> parseResponseAsEntities(String response, Class<T> clazz) {
        List<T> entities = new ArrayList<>();
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(response);
            Iterator<JsonNode> it = node.get("entities").elements();
            while (it.hasNext()) {
                entities.add(mapper.treeToValue(it.next(), clazz));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return entities;
    }

    private <T> T readEntity(String response, Class<T> clazz) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(response, clazz);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private <T> T getEntity(URIBuilder target, Class<T> clazz) {
        String response = Subject.doAs(subject, new PrivilegedAction<String>() {
            @Override
            public String run() {
                try {
                    return restTemplate.getForObject(target.build().toString(), String.class);
                } catch (Exception ex) {
                    LOG.error("unable to execute request", ex);
                }
                return null;
            }
        });

        return readEntity(response, clazz);
    }

    private <T> T postEntity(URIBuilder target, Object json, Class<T> responseType) {
        String response = Subject.doAs(subject, new PrivilegedAction<String>() {
            @Override
            public String run() {
                try {
                    return restTemplate.postForObject(target.build().toString(), json,String.class);
                } catch (Exception ex) {
                    LOG.error("unable to execute request", ex);
                }
                return null;
            }
        });
        return readEntity(response, responseType);
    }

    public static final class Configuration {
        // we may want to remove schema.registry prefix from configuration properties as these are all properties
        // given by client.
        /**
         * URL of schema registry to which this client connects to. For ex: http://localhost:9090/api/v1
         */
        public static final ConfigEntry<String> SCHEMA_REGISTRY_URL =
                ConfigEntry.mandatory("schema.registry.url",
                        String.class,
                        "URL of schema registry to which this client connects to. For ex: http://localhost:9090/api/v1",
                        "http://localhost:9090/api/v1",
                        ConfigEntry.NonEmptyStringValidator.get());

        public static final ConfigEntry<String> HTTP_PROTOCOL =
                ConfigEntry.mandatory("http.protocol",
                        String.class,
                        "",
                        "http",
                        ConfigEntry.NonEmptyStringValidator.get());

        public static final ConfigEntry<String> KEYTAB_LOCATION =
                ConfigEntry.mandatory("keytab.location",
                        String.class,
                        "",
                        "/tmp/keytabs/SVC_SAM_JBOSS_DEV.keytab",
                        ConfigEntry.NonEmptyStringValidator.get());

        public static final ConfigEntry<String> USER_PRINCIPAL =
                ConfigEntry.mandatory("user.principal",
                        String.class,
                        "",
                        "SVC_SAM_JBOSS_DEV@FNB.CO.ZA",
                        ConfigEntry.NonEmptyStringValidator.get());

        public static final ConfigEntry<String> SCHEMA_REGISTRY_HOST =
                ConfigEntry.mandatory("schema.registry.host",
                        String.class,
                        "",
                        "localhost",
                        ConfigEntry.NonEmptyStringValidator.get());

        public static final ConfigEntry<Number> SCHEMA_REGISTRY_PORT =
                ConfigEntry.mandatory("schema.registry.port",
                        Integer.class,
                        "",
                        7788,
                        ConfigEntry.PositiveNumberValidator.get());

        /**
         * Default path for downloaded jars to be stored.
         */
        public static final String DEFAULT_LOCAL_JARS_PATH = "/tmp/schema-registry/local-jars";

        /**
         * Local directory path to which downloaded jars should be copied to. For ex: /tmp/schema-registry/local-jars
         */
        public static final ConfigEntry<String> LOCAL_JAR_PATH =
                ConfigEntry.optional("schema.registry.client.local.jars.path",
                        String.class,
                        "URL of schema registry to which this client connects to. For ex: http://localhost:9090/api/v1",
                        DEFAULT_LOCAL_JARS_PATH,
                        ConfigEntry.NonEmptyStringValidator.get());

        /**
         * Default value for classloader cache size.
         */
        public static final long DEFAULT_CLASSLOADER_CACHE_SIZE = 1024L;

        /**
         * Default value for cache expiry interval in seconds.
         */
        public static final long DEFAULT_CLASSLOADER_CACHE_EXPIRY_INTERVAL_SECS = 60 * 60L;

        /**
         * Maximum size of classloader cache. Default value is {@link #DEFAULT_CLASSLOADER_CACHE_SIZE}
         * Classloaders are created for serializer/deserializer jars downloaded from schema registry and they will be locally cached.
         */
        public static final ConfigEntry<Number> CLASSLOADER_CACHE_SIZE =
                ConfigEntry.optional("schema.registry.client.class.loader.cache.size",
                        Integer.class,
                        "Maximum size of classloader cache",
                        DEFAULT_CLASSLOADER_CACHE_SIZE,
                        ConfigEntry.PositiveNumberValidator.get());

        /**
         * Expiry interval(in seconds) of an entry in classloader cache. Default value is {@link #DEFAULT_CLASSLOADER_CACHE_EXPIRY_INTERVAL_SECS}
         * Classloaders are created for serializer/deserializer jars downloaded from schema registry and they will be locally cached.
         */
        public static final ConfigEntry<Number> CLASSLOADER_CACHE_EXPIRY_INTERVAL_SECS =
                ConfigEntry.optional("schema.registry.client.class.loader.cache.expiry.interval.secs",
                        Integer.class,
                        "Expiry interval(in seconds) of an entry in classloader cache",
                        DEFAULT_CLASSLOADER_CACHE_EXPIRY_INTERVAL_SECS,
                        ConfigEntry.PositiveNumberValidator.get());

        public static final long DEFAULT_SCHEMA_CACHE_SIZE = 1024;
        public static final long DEFAULT_SCHEMA_CACHE_EXPIRY_INTERVAL_SECS = 5 * 60L;

        /**
         * Maximum size of schema version cache. Default value is {@link #DEFAULT_SCHEMA_CACHE_SIZE}
         */
        public static final ConfigEntry<Number> SCHEMA_VERSION_CACHE_SIZE =
                ConfigEntry.optional("schema.registry.client.schema.version.cache.size",
                        Integer.class,
                        "Maximum size of schema version cache",
                        DEFAULT_SCHEMA_CACHE_SIZE,
                        ConfigEntry.PositiveNumberValidator.get());

        /**
         * Expiry interval(in seconds) of an entry in schema version cache. Default value is {@link #DEFAULT_SCHEMA_CACHE_EXPIRY_INTERVAL_SECS}
         */
        public static final ConfigEntry<Number> SCHEMA_VERSION_CACHE_EXPIRY_INTERVAL_SECS =
                ConfigEntry.optional("schema.registry.client.schema.version.cache.expiry.interval.secs",
                        Integer.class,
                        "Expiry interval(in seconds) of an entry in schema version cache",
                        DEFAULT_SCHEMA_CACHE_EXPIRY_INTERVAL_SECS,
                        ConfigEntry.PositiveNumberValidator.get());

        /**
         * Maximum size of schema metadata cache. Default value is {@link #DEFAULT_SCHEMA_CACHE_SIZE}
         */
        public static final ConfigEntry<Number> SCHEMA_METADATA_CACHE_SIZE =
                ConfigEntry.optional("schema.registry.client.schema.metadata.cache.size",
                        Integer.class,
                        "Maximum size of schema metadata cache",
                        DEFAULT_SCHEMA_CACHE_SIZE,
                        ConfigEntry.PositiveNumberValidator.get());

        /**
         * Expiry interval(in seconds) of an entry in schema metadata cache. Default value is {@link #DEFAULT_SCHEMA_CACHE_EXPIRY_INTERVAL_SECS}
         */
        public static final ConfigEntry<Number> SCHEMA_METADATA_CACHE_EXPIRY_INTERVAL_SECS =
                ConfigEntry.optional("schema.registry.client.schema.metadata.cache.expiry.interval.secs",
                        Integer.class,
                        "Expiry interval(in seconds) of an entry in schema metadata cache",
                        DEFAULT_SCHEMA_CACHE_EXPIRY_INTERVAL_SECS,
                        ConfigEntry.PositiveNumberValidator.get());

        /**
         * Maximum size of schema text cache. Default value is {@link #DEFAULT_SCHEMA_CACHE_SIZE}.
         * This cache has ability to store/get entries with same schema name and schema text.
         */
        public static final ConfigEntry<Number> SCHEMA_TEXT_CACHE_SIZE =
                ConfigEntry.optional("schema.registry.client.schema.text.cache.size",
                        Integer.class,
                        "Maximum size of schema text cache",
                        DEFAULT_SCHEMA_CACHE_SIZE,
                        ConfigEntry.PositiveNumberValidator.get());

        /**
         * Expiry interval(in seconds) of an entry in schema text cache. Default value is {@link #DEFAULT_SCHEMA_CACHE_EXPIRY_INTERVAL_SECS}
         */
        public static final ConfigEntry<Number> SCHEMA_TEXT_CACHE_EXPIRY_INTERVAL_SECS =
                ConfigEntry.optional("schema.registry.client.schema.text.cache.expiry.interval.secs",
                        Integer.class,
                        "Expiry interval(in seconds) of an entry in schema text cache.",
                        DEFAULT_SCHEMA_CACHE_EXPIRY_INTERVAL_SECS,
                        ConfigEntry.PositiveNumberValidator.get());

        /**
         *
         */
        public static final ConfigEntry<String> URL_SELECTOR_CLASS =
                ConfigEntry.optional("schema.registry.client.url.selector",
                        String.class,
                        "Schema Registry URL selector class.",
                        FailoverUrlSelector.class.getName(),
                        ConfigEntry.NonEmptyStringValidator.get());

        // connection properties
        /**
         * Default connection timeout on connections created while connecting to schema registry.
         */
        public static final int DEFAULT_CONNECTION_TIMEOUT = 30 * 1000;

        /**
         * Default read timeout on connections created while connecting to schema registry.
         */
        public static final int DEFAULT_READ_TIMEOUT = 30 * 1000;

        private final Map<String, ?> config;
        private final Map<String, ConfigEntry<?>> options;

        public Configuration(Map<String, ?> config) {
            Field[] fields = this.getClass().getDeclaredFields();
            this.options = Collections.unmodifiableMap(buildOptions(fields));
            this.config = buildConfig(config);
        }

        private Map<String, ?> buildConfig(Map<String, ?> config) {
            Map<String, Object> result = new HashMap<>();
            for (Map.Entry<String, ?> entry : config.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                ConfigEntry configEntry = options.get(key);
                if (configEntry != null) {
                    if (value != null) {
                        configEntry.validator().validate((value));
                    } else {
                        value = configEntry.defaultValue();
                    }
                }
                result.put(key, value);
            }

            return result;
        }

        private Map<String, ConfigEntry<?>> buildOptions(Field[] fields) {
            Map<String, ConfigEntry<?>> options = new HashMap<>();
            for (Field field : fields) {
                Class<?> type = field.getType();

                if (type.isAssignableFrom(ConfigEntry.class)) {
                    field.setAccessible(true);
                    try {
                        ConfigEntry configEntry = (ConfigEntry) field.get(this);
                        options.put(configEntry.name(), configEntry);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            return options;
        }

        public <T> T getValue(String propertyKey) {
            return (T) (config.containsKey(propertyKey) ? config.get(propertyKey)
                    : options.get(propertyKey).defaultValue());
        }

        public Map<String, Object> getConfig() {
            return Collections.unmodifiableMap(config);
        }

        public Collection<ConfigEntry<?>> getAvailableConfigEntries() {
            return options.values();
        }

    }

    private static class SchemaDigestEntry {
        private final String name;
        private final byte[] schemaDigest;

        SchemaDigestEntry(String name, byte[] schemaDigest) {
            Preconditions.checkNotNull(name, "name can not be null");
            Preconditions.checkNotNull(schemaDigest, "schema digest can not be null");

            this.name = name;
            this.schemaDigest = schemaDigest;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SchemaDigestEntry that = (SchemaDigestEntry) o;

            if (name != null ? !name.equals(that.name) : that.name != null) return false;
            return Arrays.equals(schemaDigest, that.schemaDigest);

        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + Arrays.hashCode(schemaDigest);
            return result;
        }
    }
}