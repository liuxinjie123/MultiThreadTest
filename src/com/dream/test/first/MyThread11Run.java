package com.dream.test.first;

public class MyThread11Run {
    public static void main(String[] args) {
        MyThread11 thread11 = new MyThread11();
        System.out.println(" begin=" + System.currentTimeMillis());
        thread11.start();
        System.out.println(" end=" + System.currentTimeMillis());
    }
}
