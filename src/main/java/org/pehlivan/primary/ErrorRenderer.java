package org.pehlivan.primary;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("errorWithPrimary")
@PropertySource("app.properties")
public class ErrorRenderer implements GreetingRenderer
{
    private GreetingProvider greetingProvider = null;
    @Autowired(required = true)
    public void setGreetingProvider(GreetingProvider helloProvider) {
        System.err.println("==> in setGreetingProvider()");
        this.greetingProvider = helloProvider;
    }
// naming convension inject
//    public void setAGreetingProvider(GreetingProvider helloProvider) {
//        System.err.println("==> in setAGreetingProvider()");
//        this.greetingProvider = helloProvider;
//    }
    @Override
    public void render() {
        System.err.println(greetingProvider.getGreeting());
    }
}
