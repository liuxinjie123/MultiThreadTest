package com.dream.test.first;

public class MyThread13Run {
    public static void main(String[] args) {
        try {
            MyThread13 thread13 = new MyThread13();
            thread13.start();
            Thread.sleep(2000);
//            thread13.interrupt();
            Thread.currentThread().interrupt();
            System.out.println("是否停止1?" + Thread.interrupted());
            System.out.println("是否停止2?" + Thread.interrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println(" --- end --- ");
    }
}
