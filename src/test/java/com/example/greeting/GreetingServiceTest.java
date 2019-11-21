package com.example.greeting;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class GreetingServiceTest {

    private GreetingService service;

    @BeforeEach
    public void init(){
        service = new GreetingService();
    }

    @Test
    public void testValidAccounts() {
    }

    @Test
    void validId() {
        Assert.isTrue(service.validId(123), "Should return true when id is a positive integer");
    }

    @Test
    void validAccountPersonal() {
        Assert.isTrue(service.validAccount("personal"), "Should return true when account is business or personal");
    }

    @Test
    void validAccountBusiness() {
        Assert.isTrue(service.validAccount("business"), "Should return true when account is business or personal");
    }

    @Test
    void validTypesSmall() {
        Assert.isTrue(service.validTypes("small"), "Should return true when values are small or big");
    }

    @Test
    void validTypessBig() {
        Assert.isTrue(service.validTypes("big"), "Should return true when values are small or big");
    }
}
