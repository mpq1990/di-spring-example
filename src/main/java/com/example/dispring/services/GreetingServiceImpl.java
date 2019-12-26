package com.example.dispring.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String GREETING_MESSAGE = "Hello World!!!";

    @Override
    public String sayGreeting() {
        return GREETING_MESSAGE;
    }
}
