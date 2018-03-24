package com.dream.test.first;

public class MyThreadRun {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println(" --- end --- ");
    }
}
