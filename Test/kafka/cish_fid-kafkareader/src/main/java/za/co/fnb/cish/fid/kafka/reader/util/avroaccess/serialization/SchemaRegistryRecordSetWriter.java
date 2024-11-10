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

import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access.HortonworksAttributeSchemaReferenceWriter;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access.SchemaAccessWriter;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access.SchemaField;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access.SchemaNotFoundException;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.RecordSchema;


import java.util.EnumSet;
import java.util.Set;

public abstract class SchemaRegistryRecordSetWriter extends SchemaRegistryService {

    //private volatile SchemaAccessWriter schemaAccessWriter = new HortonworksEncodedSchemaReferenceWriter();
    private volatile SchemaAccessWriter schemaAccessWriter = new HortonworksAttributeSchemaReferenceWriter();

    protected SchemaAccessWriter getSchemaAccessWriter(final RecordSchema schema) throws SchemaNotFoundException {
        schemaAccessWriter.validateSchema(schema);
        return schemaAccessWriter;
    }

    protected Set<SchemaField> getRequiredSchemaFields() {
        final SchemaAccessWriter writer = getSchemaWriteStrategy();
        if (writer == null) {
            return EnumSet.noneOf(SchemaField.class);
        }

        final Set<SchemaField> requiredFields = writer.getRequiredSchemaFields();
        return requiredFields;
    }

    protected SchemaAccessWriter getSchemaWriteStrategy() {
        //return new HortonworksEncodedSchemaReferenceWriter();
        return new HortonworksAttributeSchemaReferenceWriter();
    }
}