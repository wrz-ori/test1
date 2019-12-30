package com.test.entity;


import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by lenovo on 2019/11/6.
 */
public class TestType {
    private List list;
    private Map map;
    private Set set;
    private Properties pro;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Properties getPro() {
        return pro;
    }

    public void setPro(Properties pro) {
        this.pro = pro;
    }

    @Override
    public String toString() {
        return "TestType{" +
                "list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", pro=" + pro +
                '}';
    }
}
