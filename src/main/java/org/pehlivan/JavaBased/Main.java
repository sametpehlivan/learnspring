package org.pehlivan.JavaBased;

import org.pehlivan.JavaBased.LikeThirdParty.ErrorRenderer;
import org.pehlivan.JavaBased.LikeThirdParty.GreetingRenderer;
import org.pehlivan.JavaBased.LikeThirdParty.StandardRenderer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = Configuration1.class)
public class Main
{

    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(Main.class);
        System.out.println(context.getBean(BeanA.class));
    }
}
