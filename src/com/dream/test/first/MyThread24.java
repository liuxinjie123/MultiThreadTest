package com.dream.test.first;

public class MyThread24 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread24 run priority=" + this.getPriority());
    }
}
