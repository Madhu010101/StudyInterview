package monitoring.configuration;

import jakarta.jms.ConnectionFactory;
import jakarta.jms.ExceptionListener;
import jakarta.jms.JMSException;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ActiveMQApp1BeanConfigTest {

    @Mock
    private ConnectionFactory connectionFactory;

    @Mock
    ActiveMQConnectionFactory activeMQConnectionFactory ;

    @Mock
    DefaultJmsListenerContainerFactoryConfigurer configurer;

    @Test
    public void testConnectionFactory1()throws JMSException {
        activeMQConnectionFactory = mock(ActiveMQConnectionFactory.class);

        String brockerUrl = "tcp://localhost61616";
        String username = "testUser";
        String password = "testPassword";
        int produceWindowSize = 1024;
        int sessionCacheSize = 100;

        when(activeMQConnectionFactory.getBrokerURL()).thenReturn(brockerUrl);
        when(activeMQConnectionFactory.getUserName()).thenReturn(username);
        when(activeMQConnectionFactory.getPassword()).thenReturn(password);

        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory(activeMQConnectionFactory);
        cachingConnectionFactory.setSessionCacheSize(sessionCacheSize);

        ExceptionListener exceptionListener = mock(ExceptionListener.class);
        cachingConnectionFactory.setExceptionListener(exceptionListener);

        Assert.assertEquals(brockerUrl, activeMQConnectionFactory.getBrokerURL());
        Assert.assertEquals(username, activeMQConnectionFactory.getUserName());
        Assert.assertEquals(password, activeMQConnectionFactory.getPassword());

        Assert.assertEquals(sessionCacheSize, cachingConnectionFactory.getSessionCacheSize());
//        Assert.assertEquals(exceptionListener, cachingConnectionFactory.getExcpetionListener());
    }

    @Test
    public void testJMSListenerContainerFactory(){
        DefaultJmsListenerContainerFactory factory = mock(DefaultJmsListenerContainerFactory.class);
        JmsListenerContainerFactory<?> jmsListenerContainerFactory = jmsListenerContainerFactory(connectionFactory,configurer);
        //verify(configurer).configure(factory,connectionFactory);
        Assert.assertNotEquals(configurer,connectionFactory);
        Assert.assertNotEquals(factory, jmsListenerContainerFactory);
    }

    private JmsListenerContainerFactory<?> jmsListenerContainerFactory(ConnectionFactory connectionFactory, DefaultJmsListenerContainerFactoryConfigurer configurer) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        configurer.configure(factory,connectionFactory);
        return factory;
    }

    @Test
    public void testJMSTemplateOne(){
        connectionFactory = mock(ConnectionFactory.class);

        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setConnectionFactory(connectionFactory);

        Assert.assertEquals(connectionFactory,jmsTemplate.getConnectionFactory());
        Assert.assertEquals(connectionFactory,jmsTemplate.getConnectionFactory());
    }
}
