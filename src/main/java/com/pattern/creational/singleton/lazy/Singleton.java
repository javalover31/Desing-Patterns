package com.pattern.creational.singleton.lazy;

public class Singleton {
    private Singleton(){}

    private static Singleton singleton;
    public static Singleton getInstance(){
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }
}
