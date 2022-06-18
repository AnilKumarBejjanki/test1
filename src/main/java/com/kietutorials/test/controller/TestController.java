package com.kietutorials.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String getHello(){
        return "hello from kie tutorials!!!!";
    }
    
}
