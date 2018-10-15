package com.vincent.springboot.study.controller;

import com.vincent.springboot.study.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vincent on 2018/10/13 上午12:28
 */
@RequestMapping("/properties")
@RestController
public class PropertiesController {

    private static final Logger log = LoggerFactory.getLogger(PropertiesController.class);

    private final Person person;

    @Autowired
    public PropertiesController (Person person) {
        this.person = person;
    }

    @GetMapping("/1")
    public Person person () {
        log.info("=================================================================================================");
        log.info(person.toString());
        log.info("=================================================================================================");
        return person;
    }


}
