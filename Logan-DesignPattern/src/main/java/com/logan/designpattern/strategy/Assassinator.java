package com.logan.designpattern.strategy;

import com.logan.base.common.entity.human.Person;

import java.util.Set;

/**
 * Desc：Assassinator
 * Created by liugenxing on 2021/7/11 11:45.
 * Copr：© 2021 Logan.All rights reserved.
 */
public interface Assassinator {
    Object assassinate(Set<Person> person);
}
