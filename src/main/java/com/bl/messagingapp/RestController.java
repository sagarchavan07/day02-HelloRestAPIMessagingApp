package com.bl.messagingapp;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/hello")
    public String sayHelloPost(@RequestBody User user){
        return "hello " + user.getFirstName() + " " + user.getLastName();
    }

    @PutMapping("/helloPut/{firstName}")
    public String sayHelloPost(@PathVariable String firstName , @RequestParam String lastName){
        return "hello " + firstName + " " + lastName + " from BirdgeLabz!";
    }
}
