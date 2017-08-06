package com.dream.first.sameNum;

public class MyThread extends Thread {
    private int i = 5;
    @Override
    synchronized public void run() {
        System.out.println("i=" + (i--) + " threadName=" + currentThread().getName());
    }
}
