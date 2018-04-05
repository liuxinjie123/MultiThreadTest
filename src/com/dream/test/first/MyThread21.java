package com.dream.test.first;

public class MyThread21 extends Thread {
    private long i = 0;
    @Override
    public void run() {
        while (true) {
            i++;
        }
    }
}
