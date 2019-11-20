package com.example.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService service;

    @GetMapping("/greeting")
    public String greetCustomer(@RequestParam String account, @RequestParam int id){
        if(account.equals("personal") && service.validId(id))
            return "Hi, userId " + id;
        else
            return "No user found matching id: " + id + " and account: " + account;

    }
}
