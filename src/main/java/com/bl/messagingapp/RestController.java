package com.bl.messagingapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("app")
public class RestController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/hello")
    public String sayHelloGet(@RequestParam String name){
        return "hello " + name;
    }

    @GetMapping("/hello/{name}")
    public String sayHelloGetPath(@PathVariable String name){
        return "hello " + name;
    }
}
