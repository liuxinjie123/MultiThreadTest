package com.dream.test.second;

public class Father2 {
    synchronized public void serviceMethod() {
        try {
            System.out.println(" in father, next, sleep begin threadName=" + Thread.currentThread().getName() +
                    ", time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(" in father, next, sleep end threadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
