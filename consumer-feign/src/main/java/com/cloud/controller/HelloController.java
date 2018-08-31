package com.cloud.controller;

import com.cloud.controller.invoke.IClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private IClient iClient;

    @RequestMapping("/getWorld")
    public String getWorld(){

        return  iClient.say();
    }
}
