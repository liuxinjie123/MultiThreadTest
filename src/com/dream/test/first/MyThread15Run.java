package com.dream.test.first;

public class MyThread15Run {
    public static void main(String[] args) {
        try {
            MyThread15 thread15 = new MyThread15();
            thread15.start();
            Thread.sleep(200);
            thread15.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" --- end --- ");
    }
}
