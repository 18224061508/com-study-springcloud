package com.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloProvider")
public class HelloController {

    @RequestMapping("/say")
    public String say(){
        return "hello world!";
    }
}
