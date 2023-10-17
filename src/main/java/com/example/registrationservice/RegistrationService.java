package com.example.registrationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface RegistrationService
{
    @FeignClient(name = "confirmation-service", url = "http://localhost:8083")
    public interface RegistrationServiceClient
    {
        @PostMapping("/notif")
        Map<String,String> Notification (@RequestBody UserDetails userDetails);
        String someDetails(@RequestBody UserDetails userDetails);
    }

}
