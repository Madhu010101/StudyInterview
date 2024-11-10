package za.co.fnb.idna;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.allegro.schema.json2avro.converter.JsonAvroConverter;

import java.io.File;
import java.io.IOException;

public class AvroRecord {
    private static JsonAvroConverter avroConverter;
    private static Schema schema;
    private static final Logger LOG = LoggerFactory.getLogger(AvroRecord.class);

    public GenericRecord kafkaRecord(String fileLocation, String bodyString) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            if(schema == null){
                schema = new Schema.Parser().parse(new File(fileLocation));
            }
            GenericRecord avroRecord = getGenericRecord(schema, bodyString);
            LOG.info("avroRecord : " + avroRecord.toString());

            return avroRecord;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static GenericRecord getGenericRecord(Schema inputSchema, String message) {

        if(avroConverter == null){
            avroConverter = new JsonAvroConverter();
        }

        LOG.info("messages from kafka" + message);
        return avroConverter.convertToGenericDataRecord(message.getBytes(), schema);
    }

}

