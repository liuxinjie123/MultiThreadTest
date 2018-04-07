package com.dream.test.second;

public class Service7 {
    public void testMethod1(MyObject7 object) {
        synchronized (object) {
            try {
                System.out.println(" testMethod1 -----getLock time=" + System.currentTimeMillis() + ", run threadName=" +
                Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println(" testMethod1 release Lock time=" + System.currentTimeMillis() + ", run threadName=" +
                Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
