package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo3Controller {
    @RequestMapping("/hello3")
    public String hello3(String name) {
        return "hello3";
    }

    @RequestMapping("/hello4")
    public String hello4(Integer id) {
        return "hello4";
    }
}
