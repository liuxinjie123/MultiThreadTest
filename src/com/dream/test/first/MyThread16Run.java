package com.dream.test.first;

public class MyThread16Run {
    public static void main(String[] args) {
        try {
            MyThread16 thread16 = new MyThread16();
            thread16.start();
            Thread.sleep(200);
            thread16.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" --- end --- ");
    }
}
