package com.vincent.springcloud.study;

import com.battcn.swagger.annotation.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger2Doc
@SpringBootApplication
public class Chapter10SwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter10SwaggerApplication.class, args);
    }
}
