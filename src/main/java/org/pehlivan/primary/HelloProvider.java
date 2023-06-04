package org.pehlivan.primary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component()
@Qualifier("helloProvider")

public class HelloProvider implements GreetingProvider
{
    @Value("${helloGreeting}")
    private String greeting;
    @Override
    public String getGreeting() {
        return this.greeting;
    }
}
