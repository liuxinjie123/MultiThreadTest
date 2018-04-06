package com.dream.test.first;

public class MyThread30Run {
    public static void main(String[] args) {
        try {
            MyThread29 thread29 = new MyThread29();
            thread29.setPriority(Thread.NORM_PRIORITY - 3);
            thread29.start();
            MyThread30 thread30 = new MyThread30();
            thread30.setPriority(Thread.NORM_PRIORITY + 3);
            thread30.start();
            Thread.sleep(20000);
            thread29.stop();
            thread30.stop();
            System.out.println(" thread29=" + thread29.getCount());
            System.out.println(" thread30=" + thread30.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
