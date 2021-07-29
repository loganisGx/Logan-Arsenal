package com.logan.designpattern;

import com.logan.base.common.entity.firearms.MachineGun;
import com.logan.designpattern.template.impl.PistolSilencer;
import org.junit.Test;

import javax.activation.UnsupportedDataTypeException;

/**
 * Desc：TestSilencer
 * Created by liugenxing on 2021/5/29 14:05.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class TestSilencer {
    @Test
    public void testSilencer() throws UnsupportedDataTypeException {
//        Pistol gun = new Pistol("DesertEagle");
//        Pistol gun = new Pistol("DesertEagle",new PistolSilencer());
//        Gun gun = new Gun("DesertEagle",new PistolSilencer());
        MachineGun gun = new MachineGun("AK47",new PistolSilencer());
        gun.shoot();
    }
}
