package com.dream.test.first;

public class MyThread03 extends Thread {
    private int i;
    public MyThread03 (int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
