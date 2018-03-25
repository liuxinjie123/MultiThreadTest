package com.dream.test.first;

public class MyThread08 extends Thread {
    public MyThread08() {
        System.out.println("构造方法打印：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法打印：" + Thread.currentThread().getName());
    }
}
