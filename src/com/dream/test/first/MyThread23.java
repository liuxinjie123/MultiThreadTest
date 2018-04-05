package com.dream.test.first;

public class MyThread23 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread23 run priority=" + this.getPriority());
        MyThread24 thread24 = new MyThread24();
        thread24.start();
    }
}
