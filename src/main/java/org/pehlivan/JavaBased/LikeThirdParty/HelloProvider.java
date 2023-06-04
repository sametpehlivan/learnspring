package org.pehlivan.JavaBased.LikeThirdParty;
public class HelloProvider implements GreetingProvider
{
    private String greeting;
    public HelloProvider(String greeting){
        this.greeting = greeting;
    }
    @Override
    public String getGreeting() {
        return this.greeting;
    }
}
