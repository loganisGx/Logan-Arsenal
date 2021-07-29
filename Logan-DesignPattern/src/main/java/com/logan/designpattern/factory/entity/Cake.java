package com.logan.designpattern.factory.entity;

/**
 * Desc：Cake
 * Created by liugenxing on 2021/7/11 12:22.
 * Copr：© 2021 Logan.All rights reserved.
 */
public abstract class Cake {
    private String name;

    public Cake(String name) {
        this.name = name;
    }

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    public String getName() {
        return name;
    }
}
