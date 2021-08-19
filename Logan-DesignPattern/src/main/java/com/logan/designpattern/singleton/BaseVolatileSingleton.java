package com.logan.designpattern.singleton;

import com.logan.designpattern.singleton.entity.LoganSingleton;

/**
 * Desc：BaseVolatileSingleton
 * 双重检查锁(DCL) + volatile 实现单例模式
 * Created by liugenxing on 2021/7/29 9:07.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class BaseVolatileSingleton {
    private static volatile LoganSingleton singleton;

    public static LoganSingleton getInstance(){
        if (singleton != null) {
            synchronized (BaseVolatileSingleton.class){
                if (singleton != null) {
                    singleton = new LoganSingleton();
                }
            }
        }
        return singleton;
    }
}
