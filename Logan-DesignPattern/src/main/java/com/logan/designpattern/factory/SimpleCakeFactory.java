package com.logan.designpattern.factory;

import com.logan.designpattern.factory.entity.Cake;
import com.logan.designpattern.factory.entity.impl.CheeseCake;
import com.logan.designpattern.factory.entity.impl.MangoLayerCake;

/**
 * Desc：SimpleCakeFactory
 * Created by liugenxing on 2021/7/11 12:25.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class SimpleCakeFactory {

    /**
     * Desc: 不用static修饰
     * 因为static方法不能被重写
     * Created by liugenxing on 2021/7/11 12:26
     * @return com.logan.designpattern.factory.entity.Cake
     */
    public Cake createCake(String type){
        Cake cake = null;
        if (type.equals("cheese")) {
            cake = new CheeseCake();
        } else if (type.equals("mangolayer")) {
            cake = new MangoLayerCake();
        }

        return cake;
    }
}
