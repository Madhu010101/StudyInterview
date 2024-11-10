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


import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access.SchemaNotFoundException;

import java.io.IOException;
import java.util.Map;

/**
 * <p>
 * A Controller Service that is responsible for creating a {@link RecordReader}.
 * </p>
 */
public interface RecordReaderFactory {

    /**
     * Create a RecordReader instance to read records from specified InputStream.
     *
     * @param variables A map contains variables which is used to resolve Record Schema via Expression Language dynamically.                 This can be null or empty.
     * @return Created RecordReader instance
     * @throws MalformedRecordException the malformed record exception
     * @throws IOException              the io exception
     * @throws SchemaNotFoundException  the schema not found exception
     */
    RecordReader createRecordReader(Map<String, String> variables) throws MalformedRecordException, IOException, SchemaNotFoundException;

    /**
     * Create record reader record reader.
     *
     * @param schemaName     the schema name
     * @param version        the version
     * @param host           the host
     * @param port           the port
     * @param httpProtocol   the http protocol
     * @param keytabLocation the keytab location
     * @param userPrincipal  the user principal
     * @return the record reader
     * @throws MalformedRecordException the malformed record exception
     * @throws IOException              the io exception
     * @throws SchemaNotFoundException  the schema not found exception
     */
    RecordReader createRecordReader(String schemaName, int version, String host, int port, String httpProtocol,
                                    String keytabLocation, String userPrincipal)
            throws MalformedRecordException, IOException, SchemaNotFoundException;

}
