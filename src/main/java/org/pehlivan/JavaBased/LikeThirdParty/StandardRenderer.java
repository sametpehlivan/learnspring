package org.pehlivan.JavaBased.LikeThirdParty;

public class StandardRenderer implements GreetingRenderer
{
    private GreetingProvider greetingProvider = null;
    public StandardRenderer(GreetingProvider greetingProvider){
        this.greetingProvider = greetingProvider;
    }
    public void render() {
        System.out.println(greetingProvider.getGreeting());
    }
}
