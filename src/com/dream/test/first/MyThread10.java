package com.dream.test.first;

public class MyThread10 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(" run threadName=" + currentThread().getName() + " begin:");
            Thread.sleep(5000);
            System.out.println(" run threadName=" + currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
