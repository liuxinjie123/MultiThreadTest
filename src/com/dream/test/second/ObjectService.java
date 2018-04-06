package com.dream.test.second;

public class ObjectService {
    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println(" threadName=" + Thread.currentThread().getName() + ", begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println(" threadName=" + Thread.currentThread().getName() + ", end   time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
