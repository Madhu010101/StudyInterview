package monitoring.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import za.co.fnb.cish.fid.monitoring.email.EmailClient;
import za.co.fnb.cish.fid.monitoring.service.EventRecieverService;
import za.co.fnb.cish.fid.monitoring.service.MessageReceiverService;
import za.co.fnb.cish.fid.monitoring.service.MonitoringService;
import za.co.fnb.cish.fid.monitoring.service.RegulatoryReceiverService;

import java.io.File;

import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class MonitorServiceTest {

    public MessageReceiverService getMessageReceiverService() {
        return messageReceiverService;
    }

    public void setMessageReceiverService(MessageReceiverService messageReceiverService) {
        this.messageReceiverService = messageReceiverService;
    }

    @Mock
    private MessageReceiverService messageReceiverService;
    @Mock
    private RegulatoryReceiverService regulatoryReceiverService;
    @Mock
    private EventRecieverService eventRecieverService;
    @Mock
    private EmailClient mailSender;
    @InjectMocks
    private MonitoringService monitoringService;

    @Test
    public void testCurrentTime() throws Exception{
        when(messageReceiverService.readDlqMesg()).thenReturn(mock(File.class));
        doNothing().when(mailSender).sendEmail(eq("mabongi.madlopha@fnb.co.za"),any(),eq("FID Monitoring Report"),eq("This the FID Monitoring Report for today"),eq(File.createTempFile("something","something")));

        monitoringService.reportForDLQs();
        Assert.assertNotNull(messageReceiverService.readDlqMesg());

        when(regulatoryReceiverService.readRegulatoryMesg()).thenReturn(mock(File.class));
        doNothing().when(mailSender).sendEmail(eq("mabongi.madlopha@fnb.co.za"),any(),eq("FID Monitoring Report"),eq("This the FID Monitoring Report for today"),eq(File.createTempFile("something","something")));
        Assert.assertNotNull(regulatoryReceiverService.readRegulatoryMesg());

        when(eventRecieverService.readEvents()).thenReturn(mock(File.class));
        doNothing().when(mailSender).sendEmail(eq("mabongi.madlopha@fnb.co.za"),any(),eq("FID Monitoring Report"),eq("This the FID Monitoring Report for today"),eq(File.createTempFile("something","something")));
        Assert.assertNotNull(eventRecieverService.readEvents());
        }


}
