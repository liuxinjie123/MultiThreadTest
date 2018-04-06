package com.dream.test.second;

public class Thread6BRun {
    public static void main(String[] args) {
        MyObject3 object = new MyObject3();
        Thread6A a = new Thread6A(object);
        a.setName("A");
        Thread6B b = new Thread6B(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
