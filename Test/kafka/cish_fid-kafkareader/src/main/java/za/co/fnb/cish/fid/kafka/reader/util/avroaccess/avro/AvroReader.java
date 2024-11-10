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

package za.co.fnb.cish.fid.kafka.reader.util.avroaccess.avro;

import org.apache.avro.Schema;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access.SchemaNotFoundException;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.MalformedRecordException;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.RecordReader;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.RecordReaderFactory;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.SchemaRegistryService;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.RecordSchema;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class AvroReader extends SchemaRegistryService implements RecordReaderFactory {
    private static final int MAX_AVRO_SCHEMA_CACHE_SIZE = 20;

    private final Map<String, Schema> compiledAvroSchemaCache = new LinkedHashMap<String, Schema>() {
        @Override
        protected boolean removeEldestEntry(final Map.Entry<String, Schema> eldest) {
            return size() >= MAX_AVRO_SCHEMA_CACHE_SIZE;
        }
    };

    @Override
    public RecordReader createRecordReader(Map<String, String> variables) throws MalformedRecordException, IOException, SchemaNotFoundException {
        final RecordSchema recordSchema = getSchema(variables);

        final Schema avroSchema;
        try {
            if (recordSchema.getSchemaFormat().isPresent() & recordSchema.getSchemaFormat().get().equals(AvroTypeUtil.AVRO_SCHEMA_FORMAT)) {
                final Optional<String> textOption = recordSchema.getSchemaText();
                if (textOption.isPresent()) {
                    avroSchema = compileAvroSchema(textOption.get());
                } else {
                    avroSchema = AvroTypeUtil.extractAvroSchema(recordSchema);
                }
            } else {
                avroSchema = AvroTypeUtil.extractAvroSchema(recordSchema);
            }
        } catch (final Exception e) {
            throw new SchemaNotFoundException("Failed to compile Avro Schema", e);
        }

        return new AvroReaderWithExplicitSchema(recordSchema, avroSchema);
    }

    @Override
    public RecordReader createRecordReader(String schemaName, int version, String host, int port, String httpProtocol,
                                           String keytabLocation, String userPrincipal)
            throws MalformedRecordException, IOException, SchemaNotFoundException {

        final RecordSchema recordSchema = getSchema(schemaName, version, host, port,
                httpProtocol, keytabLocation, userPrincipal);

        final Schema avroSchema;
        try {
            if (recordSchema.getSchemaFormat().isPresent() & recordSchema.getSchemaFormat().get().equals(AvroTypeUtil.AVRO_SCHEMA_FORMAT)) {
                final Optional<String> textOption = recordSchema.getSchemaText();
                if (textOption.isPresent()) {
                    avroSchema = compileAvroSchema(textOption.get());
                } else {
                    avroSchema = AvroTypeUtil.extractAvroSchema(recordSchema);
                }
            } else {
                avroSchema = AvroTypeUtil.extractAvroSchema(recordSchema);
            }
        } catch (final Exception e) {
            throw new SchemaNotFoundException("Failed to compile Avro Schema", e);
        }

        return new AvroReaderWithExplicitSchema(recordSchema, avroSchema);
    }

    private Schema compileAvroSchema(final String text) {
        // Access to the LinkedHashMap must be done while synchronized on this.
        // However, if no compiled schema exists, we don't want to remain synchronized
        // while we compile it, as compilation can be expensive. As a result, if there is
        // not a compiled schema already, we will compile it outside of the synchronized
        // block, and then re-synchronize to update the map. All of this is functionally
        // equivalent to calling compiledAvroSchema.computeIfAbsent(text, t -> new Schema.Parser().parse(t));
        // but does so without synchronizing when not necessary.
        Schema compiled;
        synchronized (this) {
            compiled = compiledAvroSchemaCache.get(text);
        }

        if (compiled != null) {
            return compiled;
        }

        final Schema newlyCompiled = new Schema.Parser().parse(text);
        synchronized (this) {
            return compiledAvroSchemaCache.computeIfAbsent(text, t -> newlyCompiled);
        }
    }
}