package com.logan.designpattern.factory.entity;

import com.logan.designpattern.factory.SimpleCakeFactory;
import com.logan.designpattern.factory.entity.Cake;

/**
 * Desc：CakeStore
 * Created by liugenxing on 2021/7/11 12:22.
 * Copr：© 2021 Logan.All rights reserved.
 */
public abstract class CakeStore {

    private String location;
    private SimpleCakeFactory factory;

    public Cake orderCake(String type){
        Cake cake;
        if (factory != null) {
            cake = factory.createCake(type);
        }else {
            cake = createCake(type);
        }

        cake.prepare();
        cake.bake();
        cake.cut();
        cake.box();
        return cake;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public SimpleCakeFactory getFactory() {
        return factory;
    }

    public void setFactory(SimpleCakeFactory factory) {
        this.factory = factory;
    }

    protected abstract Cake createCake(String type);
}
