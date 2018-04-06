package com.dream.test.second;

public class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println(" begin method ThreadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println(" end method ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
