package za.co.fnb.cish.fid.topic.processor.config;

import jakarta.jms.ConnectionFactory;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanConfigTest {
    @Autowired
    private ActiveMqApp1BeanConfig beanConfig;

    @Autowired
    private ActiveMqApp2BeanConfig beanConfig2;

   @Test
    @DisplayName("test for connection factory")
    public void testConnectionFactory() {
        ConnectionFactory connectionFactory = beanConfig.connectionFactory();
        Assert.assertNotNull(connectionFactory);
    }

/*
   @Test
    @DisplayName("testJmsListenerContainerFactory")
    void testJmsListenerContainerFactory() {

       DefaultJmsListenerContainerFactoryConfigurer configurer = new DefaultJmsListenerContainerFactoryConfigurer();
       DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
       ConnectionFactory connectionFactory = beanConfig.connectionFactory();
       configurer.configure(factory,connectionFactory);
       beanConfig.jmsListenerContainerFactory(new ActiveMQConnectionFactory(),);

    }

    @Test
    @DisplayName("test for connection factory 2")
    void testConnectionFactory2() {
        ConnectionFactory connectionFactory = beanConfig2.connectionFactory2();
        Assert.assertNotNull(connectionFactory);
    }

    @Test
    @DisplayName("testJmsListenerContainerFactory2")
    void testJmsListenerContainerFactory2() {
        beanConfig2.jmsListenerContainerFactory2(new ActiveMQConnectionFactory());
    }*/
}

