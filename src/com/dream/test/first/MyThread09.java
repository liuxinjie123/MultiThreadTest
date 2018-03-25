package com.dream.test.first;

public class MyThread09 extends Thread {
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}
