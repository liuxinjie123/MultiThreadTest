package com.dream.first.service;

public class MyThread5 extends Thread {
    private int count = 5;
    public MyThread5(){}
    public MyThread5(String name) {
        super();
        this.setName(name);
    }
    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println(" 由 " + Thread.currentThread().getName() + ", 计算 count=" + count);
        }
    }
}
