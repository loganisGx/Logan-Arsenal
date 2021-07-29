package com.logan.base.common.entity.firearms.accessories;

import com.logan.base.common.entity.firearms.Weapon;

/**
 * Desc：Silencer
 * Created by liugenxing on 2021/5/29 13:33.
 * Copr：© 2021 Logan.All rights reserved.
 */
public interface Silencer<T extends Weapon> {
    boolean supports(Object weapon);
    void erasure(T t);
}
