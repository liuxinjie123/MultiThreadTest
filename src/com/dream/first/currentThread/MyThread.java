package com.dream.first.currentThread;

public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造方法：" + currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法：" + currentThread().getName());
    }
}
