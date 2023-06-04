package org.pehlivan.JavaBased;

import org.pehlivan.JavaBased.LikeThirdParty.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

@Configuration
public class Configuration1
{
    @Bean
    @Qualifier("selamProvider")
    @Autowired
    public SelamProvider getSelamProvider(@Qualifier("saySelam") String greeting, @Qualifier("age") int age){
        return new SelamProvider(greeting,age);
    }
    @Bean
    @Autowired
    @Qualifier("helloProvider")
    public HelloProvider getHelloProvider(@Qualifier("sayHello") String greeting){
        return new HelloProvider(greeting);
    }
    @Bean
    @Qualifier("sayHello")
    public String getSayHello(){
        return "hello";
    }
    @Bean
    @Qualifier("saySelam")
    public String getSaySelam(){
        return "Salam";
    }
    @Bean
    @Qualifier("age")
    public int getAge(){
        return 11;
    }
    @Autowired
    @Bean
    @Qualifier("errorRenderer")
    @Lazy(value = true)
    @Primary
    public ErrorRenderer getErrorRenderer(@Qualifier("selamProvider") GreetingProvider provider){
        var renderer = new ErrorRenderer();
        renderer.setGreetingProvider(provider);
        return renderer;
    }
    @Autowired
    @Bean
    @Qualifier("standardRenderer")
    public StandardRenderer getStandardRenderer(@Qualifier("helloProvider") GreetingProvider provider){
        return new StandardRenderer(provider);
    }

}
