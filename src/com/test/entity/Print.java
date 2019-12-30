package com.test.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2019/11/6.
 */
@Component
public class Print {
@Autowired
    private Ink ink;

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {

        this.ink = ink;
    }

    public Print(Ink ink) {
        this.ink = ink;
    }

    public Print() {
    }

    public void print(){

        System.out.println("打印"+ink.showcolor());
    }
}
