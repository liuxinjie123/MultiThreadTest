package com.dream.test.first;

public class MyThread05Run {
    public static void main(String[] args) {
        MyThread05 myThread05 = new MyThread05();
        Thread a = new Thread(myThread05, "A");
        Thread b = new Thread(myThread05, "B");
        Thread c = new Thread(myThread05, "C");
        Thread d = new Thread(myThread05, "D");
        Thread e = new Thread(myThread05, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
