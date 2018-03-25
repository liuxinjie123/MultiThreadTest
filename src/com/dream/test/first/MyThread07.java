package com.dream.test.first;

public class MyThread07 extends Thread {
    private int i = 7;

    @Override
    public void run() {
        System.out.println("i=" + i-- + " threadName=" + Thread.currentThread().getName());
    }
}
