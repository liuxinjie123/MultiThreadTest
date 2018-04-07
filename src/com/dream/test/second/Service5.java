package com.dream.test.second;

public class Service5 {
    public void testMethod1(MyObject4 object) {
        synchronized (object) {
            try {
                System.out.println(" testMethod1 ____getLock time=" + System.currentTimeMillis() + " run ThreadName=" +
                Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println(" testMethod1 releaseLock time=" + System.currentTimeMillis() + " run ThreadName=" +
                Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
