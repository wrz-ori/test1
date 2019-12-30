package com.test.entity;

import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2019/11/6.
 */
@Component
public class ColorInk implements Ink{

    private String color="黑色";
    @Override
    public String showcolor() {
        return this.color;
    }
}
