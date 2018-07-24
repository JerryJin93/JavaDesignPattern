package test;

import com.jerryjin.java.designpattern.singleton.LazySingleton;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println(LazySingleton.getInstance());
    }
}
