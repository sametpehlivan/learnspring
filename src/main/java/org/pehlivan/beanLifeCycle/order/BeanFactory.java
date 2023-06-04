package org.pehlivan.beanLifeCycle.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class BeanFactory
{
    public BeanFactory(){
        System.out.println("=> BeanFactory()");
    }
    @Bean
    public String getName(){
        return "s";
    }
    @PostConstruct
    public void init(){
        System.out.println("=> factoryInit()");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("=> factoryDestroy()");
    }
}
