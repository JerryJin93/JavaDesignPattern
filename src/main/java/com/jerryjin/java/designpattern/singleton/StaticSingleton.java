package com.jerryjin.java.designpattern.singleton;

public class StaticSingleton {

    private StaticSingleton(){

    }

    public static StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }

    private static class SingletonHolder{
        private static final StaticSingleton instance = new StaticSingleton();
    }
}
