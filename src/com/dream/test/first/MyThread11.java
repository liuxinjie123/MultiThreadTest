package com.dream.test.first;

public class MyThread11 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(" run threadName=" + currentThread().getName() + " begin=" + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(" run threadName=" + currentThread().getName() + "end=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
