package com.dream.test.first;

public class MyThread02 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName() + ", time=" + time);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
