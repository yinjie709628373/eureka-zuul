package com.example.demo.client;

import org.springframework.stereotype.Component;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient("hello-service")
@Component
public interface TestEurake {
    @RequestMapping(
            value = {"/test"},
            method = {RequestMethod.GET}
    )

    public String test() throws Exception;
}
