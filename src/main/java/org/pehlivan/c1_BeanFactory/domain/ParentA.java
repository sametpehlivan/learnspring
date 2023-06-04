package org.pehlivan.c1_BeanFactory.domain;

public class ParentA
{
    public static int number;
    public BeanB beanB;
    public ParentA(){
        System.out.println("ParentA");
    }
    public String name;
    {
        name = "";
    }
    @Override
    public String toString() {
        String b = beanB != null ? beanB.toString() : "B:NULL";
        return name + " A -> " + b ;
    }

    public BeanB getBeanB() {
        return beanB;
    }

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
