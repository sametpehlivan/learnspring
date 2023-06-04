package org.pehlivan.beanLifeCycle.exersice;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class DestroyPrototype implements BeanPostProcessor, BeanFactoryAware, DisposableBean
{

    private BeanFactory factory;
    private static final List<Object> prototypesBeans = new ArrayList<>();
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.factory = factory;
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (factory.isPrototype(beanName)){
            synchronized (prototypesBeans){
                prototypesBeans.add(bean);
            }
        }
        return bean;
    }
    @Override
    public void destroy() throws Exception {
        synchronized (prototypesBeans){
            for (Object bean :prototypesBeans){
                if (bean instanceof DisposableBean ){
                   DisposableBean disposableBean = (DisposableBean) bean;
                   try {
                       disposableBean.destroy();
                   }catch (Exception e){
                     e.printStackTrace();
                   }
                   prototypesBeans.clear();
                }
            }
        }
    }
}
