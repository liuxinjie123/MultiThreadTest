package com.dream.test.first;

public class MyThread09Run {
    public static void main(String[] args) {
        MyThread09 thread09 = new MyThread09();
        System.out.println("begin=" + thread09.isAlive());
        thread09.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end=" + thread09.isAlive());
    }
}
