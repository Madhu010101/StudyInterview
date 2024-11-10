package za.co.fnb.cish.fid.kafka.reader.kinit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SchedulerTest {

    @Autowired
    private Scheduler scheduler;

    @Test
    public void sendStartUpMsg() {
        scheduler.sendStartUpMsg();
    }

    @Test
    public void initKeyTab() {
        scheduler.initKeyTab();
    }
}