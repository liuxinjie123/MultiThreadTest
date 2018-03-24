package com.dream.test.first;

public class MyThread01Run {
    public static void main(String[] args) {
        System.out.println(" --- start --- ");
        MyThread01 thread = new MyThread01();
        thread.start();
        System.out.println(" --- end --- ");
    }
}
