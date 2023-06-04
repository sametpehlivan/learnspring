package org.pehlivan.c4_annotation.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class ErrorRenderer implements GreetingRenderer
{

    private GreetingProvider greetingProvider = null;

//    public ErrorRenderer(GreetingProvider greetingProvider) {
//        System.err.println("==> in ErrorOutputRenderer()");
//        this.greetingProvider = greetingProvider;
//    }
    @Autowired(required = true)
    public void setGreetingProvider(GreetingProvider greetingProvider) {
        System.err.println("==> in setGreetingProvider()");
        this.greetingProvider = greetingProvider;
    }
    public void setAGreetingProvider(GreetingProvider greetingProvider) {
        System.err.println("==> in setAGreetingProvider()");
        this.greetingProvider = greetingProvider;
    }
    @Override
    public void render() {
        System.err.println(greetingProvider.getGreeting());
    }
}
