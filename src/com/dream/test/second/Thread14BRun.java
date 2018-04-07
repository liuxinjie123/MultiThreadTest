package com.dream.test.second;

public class Thread14BRun {
    public static void main(String[] args) {
        Service6 service = new Service6();
        MyObject6 object = new MyObject6();
        Thread14A a = new Thread14A(service, object);
        a.setName("A");
        a.start();
        Thread14B b = new Thread14B(object);
        b.setName("B");
        b.start();
    }
}
