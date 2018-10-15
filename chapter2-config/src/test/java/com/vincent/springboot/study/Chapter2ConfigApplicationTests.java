package com.vincent.springboot.study;

import com.vincent.springboot.study.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter2ConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ctx;

    @Test
    public void testHelloService() {
        boolean flag = ctx.containsBean("helloService");
        System.out.println(flag);

    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
