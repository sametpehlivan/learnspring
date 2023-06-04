package org.pehlivan.beanLifeCycle.dependon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = Test.class)
public class Test
{
    public static void main(String[] args) {
        var context = new  AnnotationConfigApplicationContext(Test.class);
        context.getBean(BeanB.class);
    }
}
