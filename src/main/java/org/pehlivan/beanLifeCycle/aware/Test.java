package org.pehlivan.beanLifeCycle.aware;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackageClasses = org.pehlivan.beanLifeCycle.aware.Test.class)
public class Test
{
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Test.class);

    }
}
