package com.logan.designpattern.factory.entity.impl;

import com.logan.designpattern.factory.entity.Cake;

/**
 * Desc：MangoLayerCake
 * Created by liugenxing on 2021/7/11 12:29.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class MangoLayerCake extends Cake {
    private static final String CAKE_NAME = "芒果千层蛋糕";

    public MangoLayerCake() {
        super(CAKE_NAME);
    }

    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
