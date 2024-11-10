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

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.MalformedRecordException;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.*;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.Record;


import java.io.IOException;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;


public class JsonTreeRowRecordReader extends AbstractJsonRowRecordReader {

    private static final Logger LOG = LoggerFactory.getLogger(JsonTreeRowRecordReader.class);

    private final Supplier<DateFormat> LAZY_DATE_FORMAT;
    private final Supplier<DateFormat> LAZY_TIME_FORMAT;
    private final Supplier<DateFormat> LAZY_TIMESTAMP_FORMAT;

    private final RecordSchema schema;

    public JsonTreeRowRecordReader(final RecordSchema schema) throws IOException, MalformedRecordException {
        super();
        this.schema = schema;

        final DateFormat df = null;
        final DateFormat tf = null;
        final DateFormat tsf = null;

        LAZY_DATE_FORMAT = () -> df;
        LAZY_TIME_FORMAT = () -> tf;
        LAZY_TIMESTAMP_FORMAT = () -> tsf;
    }

    @Override
    public Record nextRecord(boolean coerceTypes, boolean dropUnknownFields) throws IOException, MalformedRecordException {
        return null;
    }

    public Record convertJsonObjectToRecord(final JsonObject jsonObject, final RecordSchema schema) throws IOException, MalformedRecordException {
        final Map<String, Object> values = new HashMap<>(schema.getFieldCount() * 2);
        for (final RecordField recordField : schema.getFields()) {
            final String fieldName = recordField.getFieldName();

            final Object value;
            value = getRawNodeValue(fieldName, jsonObject.get(fieldName), recordField == null ? null : recordField.getDataType());
            values.put(fieldName, value);
        }

        final Supplier<String> supplier = () -> jsonObject.toString();
        return new MapRecord(schema, values, SerializedForm.of(supplier, "application/json"), false, false);
    }

    protected Object getRawNodeValue(final String fieldName, final JsonElement jsonElement, final DataType dataType) throws IOException {

        if (jsonElement.isJsonPrimitive()) {
            if (jsonElement.getAsJsonPrimitive().isBoolean()) {
                return jsonElement.getAsBoolean();
            }
            if (jsonElement.getAsJsonPrimitive().isString()) {
                String data = jsonElement.getAsString();
                if (data.length() > 64) {
                    return data.substring(0, 63);
                }
                return data;
            }
            if (jsonElement.getAsJsonPrimitive().isJsonArray()) {
                return null;
            }
            if (jsonElement.getAsJsonPrimitive().isNumber()) {
                return jsonElement.getAsJsonPrimitive().getAsLong();
            }
        }
        return null;
    }

    @Override
    public RecordSchema getSchema() {
        return schema;
    }

    @Override
    public void close() throws IOException {

    }
}