package com.vincent.controller;

import com.vincent.exception.CustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/10/26
 */
@RestController
public class ExceptionController {

    @GetMapping("/test")
    public String test(Integer num) {

        // TODO 演示需要，实际上参数是否为空通过 @RequestParam(required = true)  就可以控制
        if (num == null) {
            throw new CustomException(400, "num不能为空");
        }
        int i = 10 / num;
        return "result:" + i;

    }
}
