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

import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.json.JsonTreeRowRecordReader;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access.SchemaNotFoundException;

import java.io.IOException;
import java.util.Map;

public class JsonTreeReader extends SchemaRegistryService implements RecordReaderFactory {

    @Override
    public RecordReader createRecordReader(final Map<String, String> variables)
            throws IOException, MalformedRecordException, SchemaNotFoundException {
        return new JsonTreeRowRecordReader(getSchema(variables));
    }

    public RecordReader createRecordReader(String schemaName, int version, String host, int port, String httpProtocol,
                                           String keytabLocation, String userPrincipal)
            throws IOException, MalformedRecordException, SchemaNotFoundException {
        return new JsonTreeRowRecordReader(getSchema(schemaName, version, host, port, httpProtocol,
                keytabLocation, userPrincipal));
    }
}
