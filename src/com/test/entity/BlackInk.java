package com.test.entity;

/**
 * Created by lenovo on 2019/11/6.
 */
public class BlackInk  implements Ink{

    private String color="黑色";
    @Override
    public String showcolor() {
        return this.color;
    }
}
