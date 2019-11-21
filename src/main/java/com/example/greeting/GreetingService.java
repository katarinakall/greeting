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
}
