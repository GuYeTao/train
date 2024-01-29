package com.example.train.batch.controller;

import com.example.train.batch.feign.BusinessFeign;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Resource
    BusinessFeign businessFeign;

    @GetMapping("/hello")
    public String hello(){
        System.out.println(businessFeign.hello());
        return "hello11";
    }
}
