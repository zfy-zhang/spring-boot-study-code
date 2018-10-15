package com.vincent.springboot.study.config;

import com.vincent.springboot.study.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vincent on 2018/10/13 上午11:16
 *
 * @Configuration：指明当前类是一个配置类；就是来替代之前的Spring配置文件
 *在配置文件中用<bean><bean/>标签添加组件
 *
 */
@Configuration
public class MyConfig {

    @Bean
    public HelloService helloService() {
        System.out.println("配置类@Bean给容器中添加组件了...");
        return new HelloService();
    }

}
