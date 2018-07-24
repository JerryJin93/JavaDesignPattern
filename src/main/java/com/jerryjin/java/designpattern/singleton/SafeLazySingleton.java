package com.jerryjin.java.designpattern.singleton;

public class SafeLazySingleton {

    private static SafeLazySingleton instance;

    private SafeLazySingleton() {

    }

//    public static synchronized SafeLazySingleton getInstance(){
//        if (instance == null){
//            instance = new SafeLazySingleton();
//        }
//        return instance;
//    }

    public static SafeLazySingleton getInstance(){
        synchronized (SafeLazySingleton.class){
            if (instance == null){
                instance = new SafeLazySingleton();
            }
        }
        return instance;
    }

}
