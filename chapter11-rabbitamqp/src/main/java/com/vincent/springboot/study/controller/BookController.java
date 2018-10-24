package com.vincent.springboot.study.controller;

import com.vincent.springboot.study.config.RabbitConfig;
import com.vincent.springboot.study.entity.Book;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vincent
 * on 2018/10/16 上午9:47
 */
@RestController
@RequestMapping(value = "/books")
public class BookController {


    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public BookController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @GetMapping
    public void defaultMessage() {
        Book book = new Book();
        book.setId("1");
        book.setName("一起来学Spring Boot");
        this.rabbitTemplate.convertAndSend(RabbitConfig.DEFAULT_BOOK_QUEUE, book);
        this.rabbitTemplate.convertAndSend(RabbitConfig.MANUAL_BOOK_QUEUE, book);
    }
}
