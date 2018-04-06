package com.dream.test.second;

public class MyObject3 {
    synchronized public void methodA() {
        try {
            System.out.println(" begin methodA, threadName=" + Thread.currentThread().getName());
            System.out.println(" begin time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(" end methodA, threadName=" + Thread.currentThread().getName());
            System.out.println(" end time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void methodB() {
        try {
            System.out.println(" begin methodB, threadName=" + Thread.currentThread().getName());
            System.out.println(" begin time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(" end methodB, threadName=" + Thread.currentThread().getName());
            System.out.println(" end time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
