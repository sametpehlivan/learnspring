package org.pehlivan.beanLifeCycle.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanB implements BeanNameAware, BeanFactoryAware
{

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanB => setBeanFactory(beanFactory)");
    }
    public void setBeanName(String name)  {
        System.out.println("BeanB => setBeanName("+ name +")");
    }
}
