package org.pehlivan.beanLifeCycle.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("B_E_A_N_A")
public class BeanA implements BeanNameAware
{
    public void setBeanName(String name) {
        System.out.println("BeanA => setBeanName("+ name +")");
    }
}
