package com.example.dispring.services;

import org.springframework.stereotype.Component;

public class GreetingRepositoryTwo implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hi Secondary english";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hi Secondary spanish";
    }

    @Override
    public String getGermanGreeting() {
        return "Hi Secondary german";
    }
}
