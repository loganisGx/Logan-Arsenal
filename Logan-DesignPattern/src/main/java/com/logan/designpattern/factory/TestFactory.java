package com.logan.designpattern.factory;

import com.logan.designpattern.factory.entity.Cake;
import com.logan.designpattern.factory.entity.CakeStore;
import com.logan.designpattern.factory.entity.impl.GuangzhouCakeStore;
import org.junit.Test;

/**
 * Desc：TestFactory
 * Created by liugenxing on 2021/7/11 12:33.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class TestFactory {
    @Test
    public void testSimpleFactory(){
        SimpleCakeFactory simpleCakeFactory = new SimpleCakeFactory();
        CakeStore cakeStore = new GuangzhouCakeStore();
        cakeStore.setFactory(simpleCakeFactory);

        Cake cheeseCake = cakeStore.orderCake("cheese");
        System.out.println(cheeseCake.getName() + " 做好啦！");
    }

    @Test
    public void testFactoryMethod(){
        CakeStore cakeStore = new GuangzhouCakeStore();
        Cake cheeseCake = cakeStore.orderCake("cheese");
        System.out.println(cakeStore.getLocation() + "蛋糕店的" + cheeseCake.getName() + " 做好啦！");
    }
}
