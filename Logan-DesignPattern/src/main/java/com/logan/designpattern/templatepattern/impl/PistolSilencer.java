package com.logan.designpattern.templatepattern.impl;

import com.logan.base.common.Pistol;
import com.logan.designpattern.templatepattern.AbstractGunSilencer;

/**
 * Desc：PistolSilencer
 * Created by liugenxing on 2021/5/29 13:40.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class PistolSilencer extends AbstractGunSilencer<Pistol> {

    private static String PISTOL_SOUND = "biu";

    @Override
    public boolean supports(Object gun) {
        return (gun instanceof Pistol);
    }

    @Override
    public void internalErasure(Pistol pistol) {
        System.out.println("Using Pistol Silencer...");
        pistol.setSound(PISTOL_SOUND);
    }
}
