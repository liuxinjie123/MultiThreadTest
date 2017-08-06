package com.dream.first.sleep;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName=" + currentThread().getName() + " begin");
            sleep(2000);
            System.out.println("run threadName=" + currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
