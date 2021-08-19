package com.logan.designpattern.proxy;

/**
 * Desc：PersonBean
 * Created by liugenxing on 2021/8/7 12:45.
 * Copr：© 2021 Logan.All rights reserved.
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
