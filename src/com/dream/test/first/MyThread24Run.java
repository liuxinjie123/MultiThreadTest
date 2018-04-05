package com.dream.test.first;

public class MyThread24Run {
    public static void main(String[] args) {
        System.out.println(" main thread begin priority=" + Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(6);
        System.out.println(" main thread end priority=" + Thread.currentThread().getPriority());
        MyThread23 thread23 = new MyThread23();
        thread23.start();
    }
}
