package org.pehlivan.c1_BeanFactory.domain;

public class BeanC
{
    public String name;
    {
        name = "";
    }
    public BeanC(){
        System.out.println("BeanC");
    }
    @Override
    public String toString() {
        return name+" C";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        if (name == null) return 0;
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof BeanC)) return false;
        if(obj.hashCode() != this.hashCode()) return false;
        return true;
    }
}
