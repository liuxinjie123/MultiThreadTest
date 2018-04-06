package com.dream.test.second;

public class Thread5BRun {
    public static void main(String[] args) {
        MyObject2 object1 = new MyObject2();
        MyObject2 object2 = new MyObject2();
        Thread5A thread5A = new Thread5A(object1);
        thread5A.setName("A");
        Thread5B thread5B = new Thread5B(object2);
        thread5B.setName("B");
        thread5A.start();
        thread5B.start();
    }
}
