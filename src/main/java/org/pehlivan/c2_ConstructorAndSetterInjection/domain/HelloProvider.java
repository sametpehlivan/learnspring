package org.pehlivan.c2_ConstructorAndSetterInjection.domain;

public class HelloProvider implements GreetingProvider
{
    private String greeting;
    public HelloProvider(String greeting) {
        this.greeting = greeting;
    }
    @Override
    public String getGreeting() {
        return this.greeting;
    }
}
