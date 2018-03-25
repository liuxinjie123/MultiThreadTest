package com.dream.test.first;

public class MyThread17Run {
    public static void main(String[] args) {
        MyThread17 thread17 = new MyThread17();
        thread17.start();
        thread17.interrupt();
        System.out.println(" --- end --- ");
    }
}
