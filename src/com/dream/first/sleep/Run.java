package com.dream.first.sleep;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin: " + System.currentTimeMillis());
        myThread.run();
        System.out.println("end: " + System.currentTimeMillis());
    }
}
