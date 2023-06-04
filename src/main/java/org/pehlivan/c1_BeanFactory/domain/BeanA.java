package org.pehlivan.c1_BeanFactory.domain;

public class BeanA extends ParentA
{
    public static int count = 1;
    public BeanA(){

        System.out.println("BeanA "+count);
        count++;
    }
    public static BeanA create(){
        return new BeanA();
    }
}
