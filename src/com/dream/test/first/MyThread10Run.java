package com.dream.test.first;

public class MyThread10Run {
    public static void main(String[] args) {
        MyThread10 thread10 = new MyThread10();
        System.out.println(" --- begin=" + System.currentTimeMillis());
        thread10.run();
        System.out.println(" --- end " + System.currentTimeMillis());
    }
}
