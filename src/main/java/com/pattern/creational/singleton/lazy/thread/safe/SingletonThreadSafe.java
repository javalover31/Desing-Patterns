package com.pattern.creational.singleton.lazy.thread.safe;

public class SingletonThreadSafe {
    private SingletonThreadSafe(){}
    private static SingletonThreadSafe singletonThreadSafe;
    public synchronized static SingletonThreadSafe getInstance(){
        if (singletonThreadSafe == null)
            singletonThreadSafe = new SingletonThreadSafe();
        return singletonThreadSafe;
    }

}
