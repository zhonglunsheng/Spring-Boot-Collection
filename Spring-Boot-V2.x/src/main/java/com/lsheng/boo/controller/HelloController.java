package com.lsheng.boo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhonglunsheng
 * @Description
 * @create 2019-04-23 19:44
 */
@RestController
public class HelloController {

    @RequestMapping("/index")
    public String sayHello(){
        return "你好，Spring Boot";
    }
}
