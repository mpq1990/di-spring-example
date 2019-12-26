package com.example.dispring.services;

public class GreetingServiceImpl implements GreetingService {
    public static final String GREETING_MESSAGE = "Hello World!!!";

    @Override
    public String sayGreeting() {
        return GREETING_MESSAGE;
    }
}
