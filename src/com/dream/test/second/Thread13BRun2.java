package com.dream.test.second;

public class Thread13BRun2 {
    public static void main(String[] args) {
        MyObject4 object1 = new MyObject4();
        MyObject4 object2 = new MyObject4();
        Service5 service = new Service5();
        Thread13A a = new Thread13A(service, object1);
        a.setName("A");
        a.start();
        Thread13B b = new Thread13B(service, object2);
        b.setName("B");
        b.start();
    }
}
