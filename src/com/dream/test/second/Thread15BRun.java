package com.dream.test.second;

public class Thread15BRun {
    public static void main(String[] args) {
        Service7 service = new Service7();
        MyObject7 object = new MyObject7();
        Thread15A a = new Thread15A(service, object);
        a.setName("A");
        a.start();
        Thread15B b = new Thread15B(object);
        b.setName("B");
        b.start();
    }
}
