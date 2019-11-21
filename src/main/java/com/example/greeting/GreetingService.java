package com.example.greeting;

import org.springframework.stereotype.Service;

@Service
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

    public boolean validValues(String value){
        if(value.equalsIgnoreCase("small") || value.equalsIgnoreCase("big"))
            return true;
        else
            return false;
    }
}
