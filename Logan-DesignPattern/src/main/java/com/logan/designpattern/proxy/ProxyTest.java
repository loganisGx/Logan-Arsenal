package com.logan.designpattern.proxy;

import com.logan.designpattern.proxy.impl.NonOwnerInvocationHandler;
import com.logan.designpattern.proxy.impl.OwnerInvocationHandler;
import com.logan.designpattern.proxy.impl.PersonBeanImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Desc：ProxyTest
 * Created by liugenxing on 2021/8/7 13:12.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class ProxyTest {
    public static void main(String[] args) {
        ProxyTest proxyTest = new ProxyTest();
        proxyTest.drive();
    }

    public PersonBean getOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),new OwnerInvocationHandler(person));
    }

    public PersonBean getNonOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),new NonOwnerInvocationHandler(person));
    }

    public void drive(){
        PersonBean joe = buildPersonBeanInstance("Joe Javabean", "male", "video game");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling ,Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);   //试着改变评分，应该是行不通的
        } catch (Exception exception) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
        System.out.println("joe is Proxy class : " + Proxy.isProxyClass(joe.getClass()));
        System.out.println("ownerProxy is Proxy class : " + Proxy.isProxyClass(ownerProxy.getClass()));

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling ,Go");      //应该是行不通的
        } catch (Exception exception) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);        //试着设置评分,应该行得通！
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    public PersonBean buildPersonBeanInstance(String name,String gender,String interests){
        PersonBean personBean = new PersonBeanImpl();
        personBean.setName(name);
        personBean.setGender(gender);
        personBean.setInterests(interests);
        return personBean;
    }
}
