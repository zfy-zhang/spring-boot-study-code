package com.vincent.springboot.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = "classpath:beans.xml")
@SpringBootApplication
public class Chapter2ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter2ConfigApplication.class, args);
    }
}
