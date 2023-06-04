package org.pehlivan.c1_BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        var context = getBeanFactory();
        context.getBean("a");
    }
    public static ApplicationContext getBeanFactory(){
        return new
        ClassPathXmlApplicationContext("constructorandsetters.xml");
    }
}