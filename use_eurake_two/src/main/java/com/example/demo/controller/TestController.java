package com.example.demo.controller;

import com.example.demo.client.TestEurake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test2")
public class TestController {
    @Autowired
    private TestEurake testEurake;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public Object test() throws Exception {
        String res = testEurake.test();
        return res;
    }

    @RequestMapping(value = "/test3", method = RequestMethod.GET)
    @ResponseBody
    public Object test2() throws Exception {
        return "1";
    }
}
