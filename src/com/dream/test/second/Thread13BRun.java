package com.dream.test.second;

public class Thread13BRun {
    public static void main(String[] args) {
        Service5 service = new Service5();
        MyObject4 object = new MyObject4();
        Thread13A a = new Thread13A(service, object);
        a.setName("A");
        a.start();
        Thread13B b = new Thread13B(service, object);
        b.setName("B");
        b.start();
    }
}
