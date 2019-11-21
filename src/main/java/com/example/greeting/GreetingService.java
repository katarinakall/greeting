package com.example.greeting;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    public boolean validId(int id){
        if(id >= 0)
            return true;
        else
            return false;
    }

    public boolean validAccount(String account){
        if(account.equalsIgnoreCase("personal") || account.equalsIgnoreCase("business"))
            return true;
        else
            return false;
    }

    public boolean validTypes(String type){
        if(type.equalsIgnoreCase("small") || type.equalsIgnoreCase("big"))
            return true;
        else
            return false;
    }
}
