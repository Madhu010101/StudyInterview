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



import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.Record;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.RecordSchema;

import java.io.Closeable;
import java.io.IOException;

/**
 * <p>
 * A RowRecordReader is responsible for parsing data and returning a record at a time
 * in order to allow the caller to iterate over the records individually.
 * </p>
 *
 * <p>
 * PLEASE NOTE: This interface is still considered 'unstable' and may change in a non-backward-compatible
 * manner between minor or incremental releases of NiFi.
 * </p>
 */
public interface RecordReader extends Closeable {

    Record process(String input);
    Record process(byte[] input);
    RecordSchema getSchema() throws MalformedRecordException;

    default Record nextRecord() throws IOException, MalformedRecordException {
        return nextRecord(true, true);
    }

    Record nextRecord(boolean coerceTypes, boolean dropUnknownFields) throws IOException, MalformedRecordException;
}
