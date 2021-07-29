package com.logan.designpattern.factory.entity.impl;

import com.logan.designpattern.factory.entity.Cake;
import com.logan.designpattern.factory.entity.CakeStore;

/**
 * Desc：GuangzhouCakeStore
 * Created by liugenxing on 2021/7/11 12:50.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class GuangzhouCakeStore extends CakeStore {
    public GuangzhouCakeStore() {
        setLocation("广州");
    }

    @Override
    protected Cake createCake(String type) {
        Cake cake = null;
        if (type.equals("cheese")) {
            cake = new CheeseCake();
        } else if (type.equals("mangolayer")) {
            cake = new MangoLayerCake();
        }

        return cake;
    }
}
