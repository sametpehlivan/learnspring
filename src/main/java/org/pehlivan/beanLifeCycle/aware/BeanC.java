package org.pehlivan.beanLifeCycle.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class BeanC implements BeanNameAware, BeanFactoryAware, ApplicationContextAware
{

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanC => setBeanFactory(beanFactory)");
    }
    public void setBeanName(String name)  {
        System.out.println("BeanC => setBeanName("+ name +")");
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("BeanC => ApplicationContext(applicationContext)");
    }
}
