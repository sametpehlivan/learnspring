package org.pehlivan.c1_BeanFactory.domain;

public abstract class ParentB {
    public static int number;
    public BeanC beanC;
    public String name;
    {
        name = "";
    }
    public ParentB(){
        System.out.println("ParentB");
    }
    @Override
    public String toString() {
        String c = beanC != null ? beanC.toString() : "C:NULL";
        return name + " B -> " + c ;
    }

    public BeanC getBeanC() {
        return beanC;
    }

    public void setBeanC(BeanC beanC) {
        this.beanC = beanC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
