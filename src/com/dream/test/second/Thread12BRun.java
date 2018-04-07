package com.dream.test.second;

public class Thread12BRun {
    public static void main(String[] args) {
        MyList list = new MyList();
        Thread12A a = new Thread12A(list);
        a.setName("A");
        a.start();
        Thread12B b = new Thread12B(list);
        b.setName("B");
        b.start();
    }
}
