package org.pehlivan.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        var context = getBeanFactory();
        ((GreetingRenderer)context.getBean("errorWithPrimary")).render();

    }
    public static ApplicationContext getBeanFactory(){
        return new
                ClassPathXmlApplicationContext("component2.xml");
    }
}
