package com.logan.designpattern.observer;

/**
 * Desc：Subject
 * Created by liugenxing on 2021/7/11 12:00.
 * Copr：© 2021 Logan.All rights reserved.
 */
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
