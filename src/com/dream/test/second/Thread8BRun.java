package com.dream.test.second;

public class Thread8BRun {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        Thread8A a = new Thread8A(service);
        a.setName("A");
        a.start();
        Thread8B b = new Thread8B(service);
        b.setName("B");
        b.start();
    }
}
