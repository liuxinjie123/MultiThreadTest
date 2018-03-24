package com.dream.test.first;

public class MyRunnable01Run {
    public static void main(String[] args) {
        System.out.println(" --- start --- ");
        Runnable runnable = new MyRunnable01();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println(" --- end --- ");
    }
}
