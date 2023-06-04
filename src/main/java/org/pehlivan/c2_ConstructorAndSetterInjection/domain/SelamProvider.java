package org.pehlivan.c2_ConstructorAndSetterInjection.domain;

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
