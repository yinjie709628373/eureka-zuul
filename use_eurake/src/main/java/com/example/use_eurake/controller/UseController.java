package com.example.use_eurake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class UseController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public String test() throws Exception {
        System.out.println("Ok");
        return "Ok";
    }
}
