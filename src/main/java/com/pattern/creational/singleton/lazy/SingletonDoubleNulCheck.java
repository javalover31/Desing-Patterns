package com.pattern.creational.singleton.lazy;

public class SingletonDoubleNulCheck {
    private SingletonDoubleNulCheck() {
    }
    private static SingletonDoubleNulCheck singletonDoubleNulCheck;

    public static SingletonDoubleNulCheck getInstance() {
        if (singletonDoubleNulCheck == null) {
            synchronized (SingletonDoubleNulCheck.class) {
                if (singletonDoubleNulCheck == null) {
                    singletonDoubleNulCheck = new SingletonDoubleNulCheck();
                }
            }
        }
        return singletonDoubleNulCheck;
    }
}
