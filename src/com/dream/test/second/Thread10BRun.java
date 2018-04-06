package com.dream.test.second;

public class Thread10BRun {
    public static void main(String[] args) {
        Service3 service = new Service3();
        Thread10A a = new Thread10A(service);
        a.setName("A");
        a.start();
        Thread10B b = new Thread10B(service);
        b.setName("B");
        b.start();
    }
}
