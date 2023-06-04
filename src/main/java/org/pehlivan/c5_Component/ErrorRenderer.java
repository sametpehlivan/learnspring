package org.pehlivan.c5_Component;

public class ErrorRenderer implements GreetingRenderer
{
    private GreetingProvider greetingProvider = null;
    public void setGreetingProvider(GreetingProvider greetingProvider) {
        System.err.println("==> in setGreetingProvider()");
        this.greetingProvider = greetingProvider;
    }
    @Override
    public void render() {
        System.err.println(greetingProvider.getGreeting());
    }
}
