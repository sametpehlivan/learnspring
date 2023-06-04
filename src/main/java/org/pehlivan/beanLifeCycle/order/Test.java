package org.pehlivan.beanLifeCycle.order;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Arrays;

//for configurations
@ComponentScan(basePackageClasses = Test.class )
public class Test
{
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        //for Components init
        context.scan("org.pehlivan.beanLifeCycle.order");
        //call post-initilations
        context.refresh();
        //
        context.registerShutdownHook();
        //call close before callable
        var beanDefinitionNames = context.getBeanDefinitionNames();
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) context.getAutowireCapableBeanFactory();
        Arrays.stream(beanDefinitionNames).forEach((beanName) -> {
            registry.removeBeanDefinition(beanName);
        });

    }
}
