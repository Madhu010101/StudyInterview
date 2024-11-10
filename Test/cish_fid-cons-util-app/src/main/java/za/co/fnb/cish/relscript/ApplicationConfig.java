package za.co.fnb.cish.relscript;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ApplicationConfig {

    @Value(value = "${spring.datasource.cishfid.password}")
    private String password;

    @Value(value ="${spring.datasource.cishfid.username}")
    private String username;

    @Value(value="${spring.datasource.cishfid.url}")
    private String url;

    @PreDestroy
    public void onShutDown() {
    }

/*    @Bean(name="entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

        return sessionFactory;
    }*/

    @Bean
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

}