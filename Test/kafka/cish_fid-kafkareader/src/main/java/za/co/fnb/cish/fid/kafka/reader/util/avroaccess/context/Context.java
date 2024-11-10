package za.co.fnb.cish.fid.kafka.reader.util.avroaccess.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import za.co.fnb.cish.fid.kafka.reader.util.avroaccess.registry.HortonworksSchemaRegistry;

/**
 * Created by f3795594 on 2018/06/01.
 */
public class Context {

    private static final Logger LOG = LoggerFactory.getLogger(Context.class);
    private static Context INSTANCE = null;

    public static Context getInstance() {
        if (INSTANCE == null) {
            return new Context();
        }
        return INSTANCE;
    }

    private HortonworksSchemaRegistry hortonworksSchemaRegistry;

    private Context() {
        initialize();
    }

    private void initialize() {
        try {
            hortonworksSchemaRegistry = new HortonworksSchemaRegistry();
            hortonworksSchemaRegistry.enable();
        } catch (Exception ex) {
            LOG.error("error initializing context", ex);
        }
    }

    public HortonworksSchemaRegistry getHortonworksSchemaRegistry() {
        return hortonworksSchemaRegistry;
    }
}