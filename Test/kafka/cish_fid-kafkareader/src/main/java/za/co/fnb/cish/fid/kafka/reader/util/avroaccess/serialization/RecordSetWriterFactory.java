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
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.RecordSchema;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/**
 * <p>
 * A Controller Service that is responsible for creating
 * </p>
 * <p>A writer is created with a RecordSchema and an OutputStream that the writer will write to.</p>
 * <p>
 * The schema can be retrieved by {@link #getSchema(Map, RecordSchema)} method, based on a Map containing variables,
 * and a RecordSchema which is read from the incoming FlowFile.
 * </p>
 * <p>
 * For most processors those make use of Record Writers also make use of Record Readers, and the schema for the output is often determined
 * by either reading the schema from referencing attributes or the content of the input FlowFile.
 * In this case, if a RecordSchema is known and already available when calling {@link #getSchema(Map, RecordSchema)} method,
 * the schema should be specified so that it can be reused.
 * </p>
 *
 * <p>
 * PLEASE NOTE: This interface is still considered 'unstable' and may change in a non-backward-compatible
 * manner between minor or incremental releases of NiFi.
 * </p>
 */
public interface RecordSetWriterFactory {

    /**
     * <p>
     * Returns the Schema that will be used for writing Records. The given variables are
     * intended to be used for determining the schema that should be used when writing records.
     * </p>
     *
     * @param variables the variables which is used to resolve Record Schema via Expression Language, can be null or empty
     * @return the Schema that should be used for writing Records
     * @throws SchemaNotFoundException if unable to find the schema
     * @throws IOException             the io exception
     */
    RecordSchema getSchema(Map<String, String> variables) throws SchemaNotFoundException, IOException;

    /**
     * Gets schema.
     *
     * @param schemaName     the schema name
     * @param schemaVersion  the schema version
     * @param host           the host
     * @param port           the port
     * @param httpProtocol   the http protocol
     * @param keytabLocation the keytab location
     * @param userPrincipal  the user principal
     * @return the schema
     * @throws SchemaNotFoundException the schema not found exception
     * @throws IOException             the io exception
     */
    RecordSchema getSchema(String schemaName, int schemaVersion, String host, int port,
                           String httpProtocol, String keytabLocation, String userPrincipal) throws SchemaNotFoundException, IOException;

    /**
     * <p>
     * Creates a new RecordSetWriter that is capable of writing record contents to an OutputStream.
     * </p>
     * <p>
     * the logger to use when logging information. This is passed in, rather than using the logger of the Controller Service
     * because it allows messages to be logged for the component that is calling this Controller Service.
     *
     * @param schema the schema that will be used for writing records
     * @param out    the OutputStream to write to
     * @return a RecordSetWriter that can write record sets to an OutputStream
     * @throws SchemaNotFoundException the schema not found exception
     * @throws IOException             if unable to read from the given InputStream
     */
    RecordSetWriter createWriter(RecordSchema schema, OutputStream out) throws SchemaNotFoundException, IOException;
}
