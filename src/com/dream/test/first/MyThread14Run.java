package com.dream.test.first;

public class MyThread14Run {
    public static void main(String[] args) {
        try {
            MyThread14 thread14 = new MyThread14();
            thread14.start();
            Thread.sleep(2000);
            thread14.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" --- end --- ");
    }
}
