package com.preBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;


// http://localhost:3536/swagger-ui.html
@SpringBootApplication
//@EnableCaching
//@ComponentScan
// (basePackages = "com.preBook")
public class ServiceHospApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
