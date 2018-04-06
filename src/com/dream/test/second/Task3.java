package com.dream.test.second;

public class Task3 {
    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynchronized threadName=" + Thread.currentThread().getName() + ", i=" + (i+1));
        }
        System.out.println("\n");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadNae=" + Thread.currentThread().getName() + ", i=" + (i+1));
            }
        }
    }
}
