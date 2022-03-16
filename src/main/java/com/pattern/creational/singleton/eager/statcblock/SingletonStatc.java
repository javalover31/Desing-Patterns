package com.pattern.creational.singleton.eager.statcblock;


public class SingletonStatc {
    private static SingletonStatc singleton;
    private SingletonStatc(){
    }

    static {
        singleton = new SingletonStatc();
    }

}
