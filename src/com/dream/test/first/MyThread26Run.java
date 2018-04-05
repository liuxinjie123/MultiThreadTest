package com.dream.test.first;

public class MyThread26Run {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            MyThread25 thread25 = new MyThread25();
            thread25.setPriority(1);
            thread25.start();
            MyThread26 thread26 = new MyThread26();
            thread26.setPriority(10);
            thread26.start();
        }
    }
}
