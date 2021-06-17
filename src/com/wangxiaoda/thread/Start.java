package com.wangxiaoda.thread;

public class Start {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
    }

}
