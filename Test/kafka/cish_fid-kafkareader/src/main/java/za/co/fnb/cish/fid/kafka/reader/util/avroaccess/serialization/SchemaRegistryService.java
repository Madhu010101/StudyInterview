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

package za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.context.Context;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access.HortonworksAttributeSchemaReferenceStrategy;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access.SchemaAccessStrategy;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access.SchemaNotFoundException;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.RecordSchema;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public abstract class SchemaRegistryService {

    private static final Logger LOG = LoggerFactory.getLogger(SchemaRegistryService.class);
    private static final InputStream EMPTY_INPUT_STREAM = new ByteArrayInputStream(new byte[0]);
    private final SchemaAccessStrategy schemaAccessStrategy = null;

    public final RecordSchema getSchema(final Map<String, String> variables) throws SchemaNotFoundException, IOException {

        LOG.info("GET SCHEMA var size: [" + variables.size() + "]");
        variables.forEach((x, y) -> {
            LOG.info("k: [" + x + "] v: [" + y + "]");
        });

        final SchemaAccessStrategy accessStrategy = getSchemaAccessStrategy();
        if (accessStrategy == null) {
            throw new SchemaNotFoundException("Could not determine the Schema Access Strategy for this service");
        }

        return getSchemaAccessStrategy().getSchema(variables);
    }

    public final RecordSchema getSchema(String topicName, int version, String host, int port, String httpProtocol, String keytabLocation, String userPrincipal) throws IOException, SchemaNotFoundException {

        return Context.getInstance().getHortonworksSchemaRegistry().retrieveSchema(topicName, version, host, port, httpProtocol, keytabLocation, userPrincipal);
    }

    protected SchemaAccessStrategy getSchemaAccessStrategy() {
        if (schemaAccessStrategy == null) {
            return new HortonworksAttributeSchemaReferenceStrategy(Context.getInstance().getHortonworksSchemaRegistry());
        }
        return schemaAccessStrategy;
    }
}

//HortonworksAttributeSchemaReferenceStrategy
//HortonworksEncodedSchemaReferenceStrategy