package com.vincent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Chapter5CacheredisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter5CacheredisApplication.class, args);
    }
}
