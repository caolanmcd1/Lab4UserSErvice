package com.example.notificationservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NotificationController
{
    @GetMapping("/notif")
    Map <String,String> Notification (@RequestBody UserDetails userDetails)
    {
        Map<String,String> notif = new HashMap<>();
        notif.put("Message: ", "user" + userDetails.getName() + userDetails.getEmail() + "has been successfully registered.");
        return notif;
    }

}
