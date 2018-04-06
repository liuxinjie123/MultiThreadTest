package com.dream.test.second;

public class Thread9BRun {
    public static void main(String[] args) {
        ObjectService2 service = new ObjectService2();
        Thread9A a = new Thread9A(service);
        a.setName("a");
        a.start();
        Thread9B b = new Thread9B(service);
        b.setName("b");
        b.start();
    }
}
