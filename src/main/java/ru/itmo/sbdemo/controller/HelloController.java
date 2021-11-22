package ru.itmo.sbdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    @ResponseBody
    public String hello() {
        return "<h1>Hello</h1>";
    }


}
