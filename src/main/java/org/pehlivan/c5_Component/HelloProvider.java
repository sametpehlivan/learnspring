package org.pehlivan.c5_Component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
@Qualifier("helloProvider")
public class HelloProvider implements GreetingProvider
{
    @Value("Hello")
    private String greeting;
    @Override
    public String getGreeting() {
        return this.greeting;
    }
}
