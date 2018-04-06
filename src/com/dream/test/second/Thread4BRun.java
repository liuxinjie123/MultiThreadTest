package com.dream.test.second;

public class Thread4BRun {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        Thread4A thread4A = new Thread4A(object);
        thread4A.setName("A");
        Thread4B thread4B = new Thread4B(object);
        thread4B.setName("B");
        thread4A.start();
        thread4B.start();
    }
}
