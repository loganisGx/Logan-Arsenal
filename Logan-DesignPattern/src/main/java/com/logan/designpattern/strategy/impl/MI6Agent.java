package com.logan.designpattern.strategy.impl;

import com.logan.base.common.entity.human.Person;
import com.logan.designpattern.strategy.Assassinator;

import java.util.Set;

/**
 * Desc：MI6Agent
 * Created by liugenxing on 2021/7/11 11:55.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class MI6Agent implements Assassinator {
    @Override
    public Object assassinate(Set<Person> person) {
        System.out.println("不要动！我是军情六处的探员！");
        return person.size();
    }
}
