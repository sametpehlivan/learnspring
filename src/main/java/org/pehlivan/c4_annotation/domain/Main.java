package org.pehlivan.c4_annotation.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        var context = getBeanFactory();
        ((GreetingRenderer) context.getBean("errorRenderer")).render();
    }
    public static ApplicationContext getBeanFactory(){
        return new
                ClassPathXmlApplicationContext("annotationAutowire.xml");
    }
}
