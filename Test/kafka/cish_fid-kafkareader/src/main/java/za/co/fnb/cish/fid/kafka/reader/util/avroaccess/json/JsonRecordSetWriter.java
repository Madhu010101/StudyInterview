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

package za.co.fnb.cish.fid.kafka.reader.util.avroaccess.json;


import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access.SchemaNotFoundException;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.DateTimeTextRecordSetWriter;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.RecordSetWriter;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.RecordSetWriterFactory;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.RecordSchema;

import java.io.IOException;
import java.io.OutputStream;

public class JsonRecordSetWriter extends DateTimeTextRecordSetWriter implements RecordSetWriterFactory {

    private volatile boolean prettyPrint;

    @Override
    public RecordSetWriter createWriter(final RecordSchema schema, final OutputStream out) throws SchemaNotFoundException, IOException {
        return new WriteJsonResult(schema, getSchemaAccessWriter(schema), out, prettyPrint, NullSuppression.NEVER_SUPPRESS, OutputGrouping.OUTPUT_ONELINE,
                null, null, null);
    }
}