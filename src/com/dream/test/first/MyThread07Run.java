package com.dream.test.first;

public class MyThread07Run {
    public static void main(String[] args) {
        MyThread07 thread07 = new MyThread07();
        Thread t1 = new Thread(thread07);
        Thread t2 = new Thread(thread07);
        Thread t3 = new Thread(thread07);
        Thread t4 = new Thread(thread07);
        Thread t5 = new Thread(thread07);
        Thread t6 = new Thread(thread07);
        Thread t7 = new Thread(thread07);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}
