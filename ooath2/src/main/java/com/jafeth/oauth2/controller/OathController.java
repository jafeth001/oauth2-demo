package com.jafeth.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class OathController {
    @GetMapping("/hello")
    public String hello(){
        return "hello from sucure end point";
    }
}
