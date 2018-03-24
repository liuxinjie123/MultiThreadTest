package com.dream.test.first;

public class MyThread06 extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println(" 由 " + currentThread().getName() + " 计算，count=" + count);
    }
}
