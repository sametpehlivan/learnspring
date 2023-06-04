package org.pehlivan.JavaBased.LikeThirdParty;

public class SelamProvider implements GreetingProvider
{
    private String greeting;
    private int age;
    public SelamProvider(String greeting, int age){
        this.age = age;
        this.greeting = greeting;
    }
    @Override
    public String getGreeting() {
        return greeting+age;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
