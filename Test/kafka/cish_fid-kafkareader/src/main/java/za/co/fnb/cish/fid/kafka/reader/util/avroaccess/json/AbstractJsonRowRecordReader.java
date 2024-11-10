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

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.MalformedRecordException;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.RecordReader;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.Record;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.RecordSchema;

import java.io.IOException;

public abstract class AbstractJsonRowRecordReader implements RecordReader {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractJsonRowRecordReader.class);

    private final Gson gson;

    public AbstractJsonRowRecordReader() throws IOException, MalformedRecordException {
        gson = new Gson();
    }

    @Override
    public Record process(byte[] input) {
        return null;
    }

    @Override
    public Record process(final String input) {
        try {
            JsonObject jsonObject = gson.fromJson(input, JsonObject.class);
            final RecordSchema schema = getSchema();
            return convertJsonObjectToRecord(jsonObject, schema);
        } catch (Exception ex) {
            LOG.error("process error", ex);
        }
        return null;
    }

    public abstract Record convertJsonObjectToRecord(JsonObject jsonObject, RecordSchema schema)
            throws IOException, MalformedRecordException;
}