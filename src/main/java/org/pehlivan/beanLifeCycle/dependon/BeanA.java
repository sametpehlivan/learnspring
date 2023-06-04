package org.pehlivan.beanLifeCycle.dependon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@DependsOn(value = {"beanB"})
public class BeanA
{
    public BeanA()
    {
        System.out.println("BeanA initialize");
    }
}
