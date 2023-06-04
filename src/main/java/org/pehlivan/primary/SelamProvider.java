package org.pehlivan.primary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("selamProvider")
public class SelamProvider implements GreetingProvider
{
    @Value("${selamGreeting}")
    private String greeting;
    @Override
    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
