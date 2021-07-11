package com.logan.designpattern.templatepattern;

import com.logan.base.common.entity.Gun;
import com.logan.base.common.entity.accessories.Silencer;

/**
 * Desc：AbstractGunSilencer
 * Created by liugenxing on 2021/5/29 13:37.
 * Copr：© 2021 Logan.All rights reserved.
 */
public abstract class AbstractGunSilencer<E extends Gun> implements Silencer<E> {

    @Override
    public void erasure(E e) {
        System.out.println("Using Gun silencer...");
        internalErasure(e);
    }

    public abstract void internalErasure(E e);
}
