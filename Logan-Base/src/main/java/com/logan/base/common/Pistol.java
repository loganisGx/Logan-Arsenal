package com.logan.base.common;

import com.logan.base.common.accessories.Silencer;

import javax.activation.UnsupportedDataTypeException;

/**
 * Desc：Pistol
 * Created by liugenxing on 2021/5/29 14:07.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class Pistol extends Gun{

    public Pistol() {
    }

    public Pistol(String gunName) {
        super(gunName);
    }

    public Pistol(Silencer silencer) throws UnsupportedDataTypeException {
        super(silencer);
    }

    public Pistol(String gunName, Silencer silencer) throws UnsupportedDataTypeException {
        super(gunName, silencer);
    }
}
