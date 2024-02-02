package com.example.train.member.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${test.nacos}")
    private String testName;

    @GetMapping("/hello")
    public String hello(){
        return testName;
    }
}
