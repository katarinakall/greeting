package com.example.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService service;

    @GetMapping(value = "/greeting", params = {"account", "id"})
    public String greetCustomerWithId(@RequestParam String account, @RequestParam int id) {
        if (service.validAccount(account) && service.validId(id))
            return "Hi, userId " + id;
        else
            return "No user found matching account: " + account + "and id: " + id;
    }

    @GetMapping(value = "/greeting", params = {"account", "type"})
    public String greetCustomerWithValues(@RequestParam String account, @RequestParam String type) {
        if (service.validAccount(account) && service.validTypes(type)) {
            if (type.equalsIgnoreCase("big")) {
                return "Welcome, business user!";
            } else if (type.equalsIgnoreCase("small")) {
                try {
                    throw new Exception("The path is not yet implemented");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return "The path is not yet implemented";
            }
        }

        return "No user found matching account: " + account + "and type: " + type;
    }
}