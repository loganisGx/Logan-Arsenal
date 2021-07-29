package com.logan.designpattern.factory.entity.impl;

import com.logan.designpattern.factory.entity.Cake;

/**
 * Desc：CheeseCake
 * Created by liugenxing on 2021/7/11 12:28.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class CheeseCake extends Cake {
    private static final String CAKE_NAME = "芝士蛋糕";

    public CheeseCake() {
        super(CAKE_NAME);
    }

    @Override
    public void prepare() {
        System.out.println("准备芝士蛋糕的材料");
    }

    @Override
    public void bake() {
        System.out.println("烘烤芝士蛋糕");
    }

    @Override
    public void cut() {
        System.out.println("切片芝士蛋糕");
    }

    @Override
    public void box() {
        System.out.println("装箱芝士蛋糕");
    }
}
