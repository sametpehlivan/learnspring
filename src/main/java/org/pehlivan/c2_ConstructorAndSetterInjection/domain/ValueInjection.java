package org.pehlivan.c2_ConstructorAndSetterInjection.domain;

import org.pehlivan.c1_BeanFactory.domain.BeanA;
import org.pehlivan.c1_BeanFactory.domain.BeanB;
import org.pehlivan.c1_BeanFactory.domain.BeanC;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ValueInjection
{
    private BeanA[] array;
    private List<BeanB> list;
    private Set<BeanC> set;
    private Map<Integer, BeanA> map1;

    public ValueInjection(BeanA[] array, List<BeanB> list, Set<BeanC> set, Map<Integer, BeanA> map1) {
        this.array = array;
        this.list = list;
        this.set = set;
        this.map1 = map1;
    }

    public BeanA[] getArray() {
        return array;
    }

    public void setArray(BeanA[] array) {
        this.array = array;
    }

    public List<BeanB> getList() {
        return list;
    }

    public void setList(List<BeanB> list) {
        this.list = list;
    }

    public Set<BeanC> getSet() {
        return set;
    }

    public void setSet(Set<BeanC> set) {
        this.set = set;
    }

    public Map<Integer, BeanA> getMap1() {
        return map1;
    }

    public void setMap1(Map<Integer, BeanA> map1) {
        this.map1 = map1;
    }
}
