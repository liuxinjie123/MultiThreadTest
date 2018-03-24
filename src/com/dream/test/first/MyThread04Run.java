package com.dream.test.first;

public class MyThread04Run {
    public static void main(String[] args) {
        MyThread04 a = new MyThread04("A");
        MyThread04 b = new MyThread04("B");
        MyThread04 c = new MyThread04("C");
        a.start();
        b.start();
        c.start();
    }
}
