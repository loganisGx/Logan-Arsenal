package com.logan.designpattern.proxy.impl;

import com.logan.designpattern.proxy.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Desc：OwnerInvocationHandler
 * Created by liugenxing on 2021/8/7 12:51.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public OwnerInvocationHandler(PersonBean personBean){
        this.person = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try {
            if (method.getName().startsWith("get")){
                return method.invoke(person,args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException();
            }else if (method.getName().startsWith("set")){
                return method.invoke(person,args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }
}
