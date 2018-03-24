package com.dream.test.first;

public class MyThreadRun {
    public static void main(String[] args) {
        System.out.println(" --- start --- ");
        MyThread thread = new MyThread();
        thread.start();
        System.out.println(" --- end --- ");
    }
}
