package com.test.entity;

/**
 * Created by lenovo on 2019/11/5.
 */
public class StudentImpl implements student {


    private Integer id;
    private String name;
    @Override
    public void study() {
        System.out.println(name+"在学习");

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
