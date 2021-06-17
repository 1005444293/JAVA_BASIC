package com.wangxiaoda.thread;

public class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("MyThread.run()");
    }
}
