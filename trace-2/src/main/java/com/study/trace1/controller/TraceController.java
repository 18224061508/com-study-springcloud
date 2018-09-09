package com.study.trace1.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class TraceController {

    private final Logger logger = Logger.getLogger(TraceController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/trace-2")
    public String trace(){
      logger.info("==== call trace-2 =====");
      return "trace";
    }
}
