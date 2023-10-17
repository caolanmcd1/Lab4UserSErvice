package com.example.registrationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController
{
    @PostMapping("/confirm")
    String someDetails(@RequestBody UserDetails userDetails)
    {
        return "Hello " + userDetails.getName() + "your registration is successful with the email " + userDetails.getEmail();
    }
}
