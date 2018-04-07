package com.dream.test.second;

public class MyThread10Run {
    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();
        MyThread9 a = new MyThread9(list);
        a.setName("A");
        a.start();
        MyThread10 b = new MyThread10(list);
        b.setName("B");
        b.start();
        Thread.sleep(6000);
        System.out.println("listSize=" + list.getSize());
    }
}
