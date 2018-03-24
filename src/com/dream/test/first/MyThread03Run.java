package com.dream.test.first;

public class MyThread03Run {
    public static void main(String[] args) {
        System.out.println(" --- start --- ");
        for (int i = 0; i < 10; i++) {
            MyThread03 thread03 = new MyThread03(i);
            thread03.start();
        }
        System.out.println(" --- end --- ");
    }
}
