package com.dream.test.second;

public class MyObject2 {
    public void methodA() {
        try {
            System.out.println(" begin method, threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println(" end method, threadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
