package com.example.dispring.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hi, primary greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "ola! espaniol";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo!, wie gehts!";
    }
}
