package com.logan.designpattern.proxy.impl;

import com.logan.designpattern.proxy.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Desc：NonOwnerInvocationHandler
 * Created by liugenxing on 2021/8/7 12:54.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean personBean){
        this.person = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try {
            if (method.getName().startsWith("get") || method.getName().equals("setHotOrNotRating")) {
                return method.invoke(person,args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }
        }  catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
