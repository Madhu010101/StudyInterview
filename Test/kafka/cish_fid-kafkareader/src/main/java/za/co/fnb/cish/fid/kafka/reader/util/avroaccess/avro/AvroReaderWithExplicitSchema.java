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

package za.co.fnb.cish.fid.kafka.reader.util.avroaccess.avro;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.BinaryDecoder;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DecoderFactory;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.schema.access.SchemaNotFoundException;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.MalformedRecordException;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.MapRecord;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.Record;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.RecordSchema;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;

public class AvroReaderWithExplicitSchema extends AvroRecordReader {
    private final RecordSchema recordSchema;
    private final DatumReader<GenericRecord> datumReader;
    private BinaryDecoder decoder;
    private GenericRecord genericRecord;

    public AvroReaderWithExplicitSchema(final RecordSchema recordSchema, final Schema avroSchema) throws IOException, SchemaNotFoundException {
        this.recordSchema = recordSchema;

        datumReader = new GenericDatumReader<GenericRecord>(avroSchema);
    }

    @Override
    public Record process(String input) {
        decoder = DecoderFactory.get().binaryDecoder(input.getBytes(), null);

        try {
            genericRecord = datumReader.read(genericRecord, decoder);
            final RecordSchema schema = getSchema();
            final Map<String, Object> values = AvroTypeUtil.convertAvroRecordToMap(genericRecord, schema);
            return new MapRecord(schema, values);
        } catch (final Exception eof) {
            return null;
        }
    }

    @Override
    public Record nextRecord() throws IOException, MalformedRecordException {
        return null;
    }

    @Override
    public Record nextRecord(boolean coerceTypes, boolean dropUnknownFields) throws IOException, MalformedRecordException {
        return null;
    }

    @Override
    public Record process(byte[] input) {
        decoder = DecoderFactory.get().binaryDecoder(new ByteArrayInputStream(input), null);

        try {
            genericRecord = datumReader.read(genericRecord, decoder);
            final RecordSchema schema = getSchema();
            final Map<String, Object> values = AvroTypeUtil.convertAvroRecordToMap(genericRecord, schema);
            return new MapRecord(schema, values);
        } catch (final Exception eof) {
            return null;
        }
    }

    @Override
    public void close() throws IOException {
    }

    @Override
    public RecordSchema getSchema() throws MalformedRecordException {
        return recordSchema;
    }
}