package org.pehlivan.beanLifeCycle.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanA
{

    private BeanA()
    {
        System.out.println("=> BeanA()");
    }
    @PostConstruct
    public void initPost(){
        System.out.println("=> initPost()");
    }
    @PreDestroy
    public void destroyPre(){
        System.out.println("=> destroyPre()");
    }
}
