package com.dream.test.second;

public class MyObject7 {
    public void speedPrintString() {
        synchronized (this) {
            System.out.println(" speedPrintString _____getLock time=" + System.currentTimeMillis() + ", run threadName=" +
            Thread.currentThread().getName());
            System.out.println(" ---------------------------------- ");
            System.out.println(" speedPrintString release Lock time=" + System.currentTimeMillis() + ", run threadName=" +
            Thread.currentThread().getName());
        }
    }
}
