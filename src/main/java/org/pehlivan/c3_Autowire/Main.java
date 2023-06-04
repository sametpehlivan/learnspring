package org.pehlivan.c3_Autowire;

import org.pehlivan.c2_ConstructorAndSetterInjection.domain.ErrorRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        var context = getBeanFactory();
//        var renderer = (ErrorRenderer) context.getBean("errorRenderer");
//        renderer.render();
/*        var renderer = (ErrorRenderer) context.getBean("errorRenderer2");
        renderer.render();
*/
        var renderer = (ErrorRenderer) context.getBean("errorRenderer3");
        renderer.render();
    }
    public static ApplicationContext getBeanFactory(){
        return new
                ClassPathXmlApplicationContext("autowire.xml");
    }
}
