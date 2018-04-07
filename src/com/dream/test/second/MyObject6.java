package com.dream.test.second;

public class MyObject6 {
    synchronized public void speedPrintString() {
        System.out.println(" speedPrintString —————getLock time=" + System.currentTimeMillis() + ", run threadName=" +
        Thread.currentThread().getName());
        System.out.println(" ---------------------------------- ");
        System.out.println(" speedPrintString release Lock time=" + System.currentTimeMillis() + ", run threadName=" +
        Thread.currentThread().getName());
    }
}
