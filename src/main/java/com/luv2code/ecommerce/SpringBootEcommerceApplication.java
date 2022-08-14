package com.luv2code.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootEcommerceApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootEcommerceApplication.class, args);
        new SpringApplicationBuilder(SpringBootEcommerceApplication.class).web(WebApplicationType.NONE).run(args);
    }


}
