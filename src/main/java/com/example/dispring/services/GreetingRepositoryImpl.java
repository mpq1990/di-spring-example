package com.example.dispring.services;

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
