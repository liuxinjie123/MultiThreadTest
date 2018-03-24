package com.dream.test.first;

public class MyThread04 extends Thread {
    private int count = 5;
    public MyThread04 (String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println(" --- 由 " + currentThread().getName() + " 计算.count=" + count);
        }
    }
}
