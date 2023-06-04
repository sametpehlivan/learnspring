package org.pehlivan.beanLifeCycle.exersice;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanA implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.err.println("in BeanA destroy()");

    }
}
