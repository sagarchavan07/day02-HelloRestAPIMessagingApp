package com.bl.messagingapp;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("app")
public class RestController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello";
    }
}
