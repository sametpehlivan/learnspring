package org.pehlivan.beanLifeCycle.order;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
@Scope("singleton")
@Lazy
public class BeanC
{
    private BeanC()
    {
        System.out.println("BeanC()");
    }
}
