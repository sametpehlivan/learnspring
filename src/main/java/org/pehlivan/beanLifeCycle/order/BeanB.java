package org.pehlivan.beanLifeCycle.order;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
@Scope("prototype")
public class BeanB {
    private BeanB()
    {
        System.out.println("BeanB()");
    }
    @PostConstruct
    public void initPost(){
        System.out.println("hi beanB ready to use");
    }
    @PreDestroy
    public void destroyPre(){
        System.out.println("hi beanB is remove/destroy/detach");
    }
}
