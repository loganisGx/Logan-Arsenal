package com.logan.designpattern.strategy.impl;

import com.logan.base.common.entity.human.Person;
import com.logan.designpattern.strategy.Assassinator;

import java.util.Set;

/**
 * Desc：FBIAgent
 * Created by liugenxing on 2021/7/11 11:51.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class FBIAgent implements Assassinator {

    @Override
    public Object assassinate(Set<Person> person) {
        System.out.println("举起手！我是FBI特工！");
        return person.size();
    }
}
