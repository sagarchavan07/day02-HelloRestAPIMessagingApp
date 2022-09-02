package com.bl.messagingapp.Service;

import com.bl.messagingapp.Entity.User;
import org.springframework.stereotype.Service;

@Service
public class MessagingService {
    public String getMessage(User user){
        return "hello " + user.getFirstName() + " " + user.getLastName();
    }
}
