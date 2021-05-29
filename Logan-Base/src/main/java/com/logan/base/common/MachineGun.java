package com.logan.base.common;

import com.logan.base.common.accessories.Silencer;

import javax.activation.UnsupportedDataTypeException;

/**
 * Desc：MachineGun
 * Created by liugenxing on 2021/5/29 14:56.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class MachineGun extends Gun{
    public MachineGun() {
    }

    public MachineGun(String gunName) {
        super(gunName);
    }

    public MachineGun(Silencer silencer) throws UnsupportedDataTypeException {
        super(silencer);
    }

    public MachineGun(String gunName, Silencer silencer) throws UnsupportedDataTypeException {
        super(gunName, silencer);
    }
}
