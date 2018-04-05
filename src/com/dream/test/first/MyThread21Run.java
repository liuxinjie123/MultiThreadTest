package com.dream.test.first;

public class MyThread21Run {
    public static void main(String[] args) {
        try {
            MyThread21 thread21 = new MyThread21();
            thread21.start();
            Thread.sleep(1000);
            thread21.suspend();
            System.out.println(" main end ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
