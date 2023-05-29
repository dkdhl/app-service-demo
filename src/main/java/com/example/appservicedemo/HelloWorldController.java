package com.example.appservicedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello, world! this is app service poc";
    }
}

