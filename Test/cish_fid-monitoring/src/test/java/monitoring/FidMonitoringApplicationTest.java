package monitoring;

import org.junit.Assert;
import org.junit.Test;
import za.co.fnb.cish.fid.monitoring.FidMonitoringApplication;

public class FidMonitoringApplicationTest {

    @Test
    public void applicationStartup() {
        FidMonitoringApplication.main(new String[]{});
        Assert.assertTrue(true);
    }
}