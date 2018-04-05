package com.dream.test.first;

public class SynchronizedObject2 {
    synchronized public void printString() {
        System.out.println(" --- begin --- ");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println(" a 线程用于suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println(" --- end --- ");
    }
}
