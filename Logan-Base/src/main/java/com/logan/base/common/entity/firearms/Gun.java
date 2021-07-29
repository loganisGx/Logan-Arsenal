package com.logan.base.common.entity.firearms;

import com.logan.base.common.entity.firearms.accessories.Shooter;
import com.logan.base.common.entity.firearms.accessories.Silencer;

import javax.activation.UnsupportedDataTypeException;

/**
 * Desc：Gun
 * Created by liugenxing on 2021/5/29 13:51.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class Gun extends Weapon implements Shooter {

    private String gunName;
    private String sound = "bang";   //枪声
    private Silencer silencer;  //消音器

    public Gun() {
    }

    public Gun(String gunName) {
        this.gunName = gunName;
    }

    public Gun(Silencer silencer) throws UnsupportedDataTypeException {
        //策略模式
        if (!silencer.supports(this)) {
            throw new UnsupportedDataTypeException();
        }
        this.silencer = silencer;
    }

    public Gun(String gunName, Silencer silencer) throws UnsupportedDataTypeException {
        //策略模式
        if (!silencer.supports(this)) {
            throw new UnsupportedDataTypeException();
        }
        this.gunName = gunName;
        this.silencer = silencer;
    }

    @Override
    public void shoot() {
        if (silencer != null) {
            silencer.erasure(this);
        }
        System.out.println(gunName + "---" + sound + "!" + sound + "!" + sound + "!");
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
