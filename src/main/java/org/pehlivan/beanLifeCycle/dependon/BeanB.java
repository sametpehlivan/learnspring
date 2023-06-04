package org.pehlivan.beanLifeCycle.dependon;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Qualifier("beanB")
@Lazy
public class BeanB
{
    public BeanB(){
        System.out.println("BeanB initialize");
    }
}
