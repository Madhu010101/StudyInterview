package za.co.fnb.cish.fid.kafka.reader.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.avro.AvroReader;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.json.JsonRecordSetWriter;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.RecordReader;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.RecordReaderFactory;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.RecordSetWriter;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.RecordSetWriterFactory;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.Record;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.serialization.record.RecordSchema;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.utils.ProcessException;

import java.io.ByteArrayOutputStream;

/**
 * Created by f3795594 on 2018/06/01.
 */
public class AvroToJsonStream {

    private static final Logger LOG = LoggerFactory.getLogger(AvroToJsonStream.class);

    private RecordSetWriterFactory writerFactory;
    private RecordReaderFactory readerFactory;
    private RecordReader reader;
    private ByteArrayOutputStream baos;
    private RecordSetWriter writer;

    public AvroToJsonStream(String schemaName, int schemaVersion, String host, int port,
                            String httpProtocol, String keytabLocation, String userPrincipal) {

        LOG.info("========================================================");
        LOG.info("Initializing AvroToJsonStream");
        LOG.info("========================================================");
        LOG.info("schemaName = " + schemaName);
        LOG.info("schemaVersion = " + schemaVersion);
        LOG.info("host = " + host);
        LOG.info("port = " + port);
        LOG.info("httpProtocol = " + httpProtocol);
        LOG.info("keytabLocation = " + keytabLocation);
        LOG.info("userPrincipal = " + userPrincipal);
        LOG.info("========================================================");

        initialize(schemaName, schemaVersion, host, port, httpProtocol, keytabLocation, userPrincipal);
    }

    private void initialize(String schemaName, int schemaVersion, String host, int port,
                            String httpProtocol, String keytabLocation, String userPrincipal) {
        try {
            writerFactory = new JsonRecordSetWriter();
            readerFactory = new AvroReader();
            reader = readerFactory.createRecordReader(schemaName, schemaVersion, host, port,
                    httpProtocol, keytabLocation, userPrincipal);
            LOG.debug("Reader: {}", reader.getClass().getCanonicalName());

            final RecordSchema schema = writerFactory.getSchema(schemaName, schemaVersion, host, port,
                    httpProtocol, keytabLocation, userPrincipal);
            baos = new ByteArrayOutputStream(1024);
            writer = writerFactory.createWriter(schema, baos);
            if (writer != null)
                LOG.info("******** WRITER INITIALIZED *********");
        } catch (Exception ex) {
            throw new RuntimeException("initialization error", ex);
        }
    }

    public synchronized String process(byte[] input) {
        try {
            Record record = reader.process(input);
            baos.reset();
            writer.write(record);
            writer.flush();
            return baos.toString();
        } catch (Exception e) {
            throw new ProcessException(e);
        }
    }
}