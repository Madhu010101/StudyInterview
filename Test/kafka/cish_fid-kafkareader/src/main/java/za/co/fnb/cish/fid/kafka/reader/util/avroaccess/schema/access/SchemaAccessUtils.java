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
package za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access;

import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.registry.SchemaRegistry;

public class SchemaAccessUtils {

    public static final String HWX_CONTENT_ENCODED_SCHEMA = "hwx-content-encoded-schema";
    public static final String HWX_SCHEMA_REF_ATTRIBUTES = "hwx-schema-ref-attributes";

    private static String getSchemaAccessStrategyName(final String schemaAccessValue) {
        return HWX_CONTENT_ENCODED_SCHEMA;
    }

    private static boolean isSchemaRegistryRequired(final String schemaAccessValue) {
        return true;
    }

    public static SchemaAccessStrategy getSchemaAccessStrategy(final SchemaRegistry schemaRegistry) {
        return new HortonworksEncodedSchemaReferenceStrategy(schemaRegistry);
        //return new HortonworksAttributeSchemaReferenceStrategy(schemaRegistry);
    }
}