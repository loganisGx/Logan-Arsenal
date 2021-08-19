package com.logan.designpattern.singleton;

import com.logan.designpattern.singleton.entity.LoganSingleton;

/**
 * Desc：BaseClassInitializationSingleton
 * 基于类初始化的单例，线程安全
 * Initialization On Demand Holder idiom
 *
 * Created by liugenxing on 2021/7/29 9:11.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class BaseClassInitializationSingleton {

    private static class InstanceHolder{
        public static LoganSingleton instance = new LoganSingleton();
    }

    public static LoganSingleton getInstance() {
        return InstanceHolder.instance ; // 这里将导致InstanceHolder类被初始化
    }
}
