package com.dream.test.second;

public class Thread11BRun {
    public static void main(String[] args) {
        Service4 service = new Service4();
        Thread11A a = new Thread11A(service);
        a.setName("A");
        a.start();
        Thread11B b = new Thread11B(service);
        b.setName("B");
        b.start();
    }
}
