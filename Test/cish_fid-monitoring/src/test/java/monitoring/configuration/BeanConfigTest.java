package monitoring.configuration;

import jakarta.jms.ExceptionListener;
import jakarta.jms.JMSException;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Properties;
import java.util.concurrent.ThreadPoolExecutor;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class BeanConfigTest {

    @Test
    public void testGetJavaMailSender(){
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("mail.fnb.co.za");
        mailSender.setPort(25);

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "false");
        props.put("mail.debug", "true");

        Assert.assertEquals("mail.fnb.co.za", mailSender.getHost());
        Assert.assertEquals(25,mailSender.getPort());

        Assert.assertEquals("smtp", props.getProperty("mail.transport.protocol"));
        Assert.assertEquals("false", props.getProperty("mail.smtp.auth"));
        Assert.assertEquals("true",props.getProperty("mail.debug"));

    }

    @Test
    public void testTaskExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setMaxPoolSize(180);
        executor.setQueueCapacity(720);
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();

        Assert.assertEquals(180,executor.getMaxPoolSize());
        Assert.assertEquals(720, executor.getQueueCapacity());

    }

    @Test
    public void testConnectionFactory() throws JMSException {
        ActiveMQConnectionFactory factory = mock(ActiveMQConnectionFactory.class);

        String brockerUrl = "tcp://localhost61616";
        String username = "testUser";
        String password = "testPassword";

        when(factory.getBrokerURL()).thenReturn(brockerUrl);
        when(factory.getUserName()).thenReturn(username);
        when(factory.getPassword()).thenReturn(password);

        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory(factory);
        ExceptionListener exceptionListener = mock(ExceptionListener.class);
        cachingConnectionFactory.setExceptionListener(exceptionListener);

        Assert.assertEquals(brockerUrl,factory.getBrokerURL());
        Assert.assertEquals(username,factory.getUserName());
        Assert.assertEquals(password,factory.getPassword());

    }
}
