package com.kietutorials.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String getHello(){
        System.out.println("HELLO FROM TEST METHOD!!!!!!!!");
        return "hello from kie tutorials!!!!";
    }
    
    @PostMapping
    public String testPostMapping(){
        System.out.println("HELLO FROM POST METHOD!!!!!!!!");
        return "POST METHOD SUCCESS";
    }
}
