package monitoring.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import za.co.fnb.cish.fid.monitoring.service.MessageReceiverService;
import za.co.fnb.cish.fid.monitoring.util.ActiveMQClient;
import za.co.fnb.cish.fid.monitoring.util.FileManager;

import java.io.File;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class MessageRecieverTest {

    @Mock
    private ActiveMQClient activeMQClient;
    @Mock
    private FileManager fileManager;

    @InjectMocks
    private MessageReceiverService messageReceiverService;

    public ActiveMQClient getActiveMQClient() {
        return activeMQClient;
    }

    @Test
    public void testReadDLQMessage() throws Exception{

        when(activeMQClient.getQueueSize1(anyString())).thenReturn(1L);
        when(fileManager.csvGeneratorForDB(any(),anyString(),anyString())).thenReturn(mock(File.class));

        Assert.assertNotNull(activeMQClient.getQueueSize1(anyString()));
        Assert.assertNotNull(fileManager.csvGeneratorForDB(any(),anyString(),anyString()));

    }


}
