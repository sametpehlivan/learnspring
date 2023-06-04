package org.pehlivan.c4_annotation.domain;

public class SelamProvider implements GreetingProvider
{
    private String greeting;
    @Override
    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
