package com.cloud.controller.invoke;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider00")
public interface IClient {

    @RequestMapping("/helloProvider/say")
    String say();
}
