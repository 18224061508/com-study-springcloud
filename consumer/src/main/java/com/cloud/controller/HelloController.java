package com.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/getWorld")
    public String getWorld(){

        ServiceInstance serviceInstance = loadBalancerClient.choose("provider00");
        String url ="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/helloProvider/say";

        return  restTemplate.getForObject(url, String.class);
    }
}
