package com.bl.messagingapp.Controller;

import com.bl.messagingapp.DTO.UserDTO;
import com.bl.messagingapp.Entity.User;
import com.bl.messagingapp.Service.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("app")
public class RestController {
    @Autowired
    MessagingService messagingService;

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/hello")
    public String sayHelloGet(@RequestParam String name){
        return "hello " + name;
    }

    @PostMapping("/hellopost")
    public String sayHelloPost(@RequestBody UserDTO userDTO){
        User user = new User(userDTO);
        return messagingService.getMessage(user);
    }

    @PutMapping("/helloPut/{firstName}")
    public String sayHelloPost(@PathVariable String firstName , @RequestParam String lastName){
        return "hello " + firstName + " " + lastName + " from BirdgeLabz!";
    }
}
