package za.co.fnb.cish.fid.zos.loader.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
// springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@EnableSwagger2
public class SpringFoxConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("za.co.fnb.cish.fid.zos.loader"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Customer services API")
                .description("Customer enquiry and maintenance  zos API's")
                .version("1.0.0")
                .contact(new Contact("CISH Avengers", "", "DLFNBCISHAVENGERS@fnb.co.za"))
                .build();
    }
}
