package com.dream.test.second;

public class Father2Son extends Father2 {
    @Override
    public void serviceMethod() {
        try {
            System.out.println(" in son, next, sleep begin threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println(" in son, next, sleep end threadName=" + Thread.currentThread().getName());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
