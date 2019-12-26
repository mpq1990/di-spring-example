package com.example.dispring.controllers;

import com.example.dispring.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
