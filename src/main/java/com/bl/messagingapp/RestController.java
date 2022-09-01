package com.bl.messagingapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("app")
public class RestController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloGet(@PathVariable String name){
        return "hello " + name;
    }
}
