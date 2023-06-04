package org.pehlivan.c2_ConstructorAndSetterInjection.domain;

public class StandartRenderer implements GreetingRenderer
{
    private GreetingProvider greetingProvider = null;
    public void setProvider(GreetingProvider greetingProvider) {
        System.err.println("==> in setAProvider()");
        this.greetingProvider = greetingProvider;
    }
    public void render() {
        System.out.println(greetingProvider.getGreeting());
    }
}
