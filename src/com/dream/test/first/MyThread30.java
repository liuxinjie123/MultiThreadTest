package com.dream.test.first;

public class MyThread30 extends Thread {
    private long count;
    public long getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }
}
