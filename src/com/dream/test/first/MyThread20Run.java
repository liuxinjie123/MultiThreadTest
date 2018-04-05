package com.dream.test.first;

public class MyThread20Run {
    public static void main(String[] args) {
        try {
            MyThread20 thread20 = new MyThread20();
            thread20.start();
            Thread.sleep(5000);
            //A
            thread20.suspend();
            System.out.println("A=" + System.currentTimeMillis() + ", i=" + thread20.getI());
            Thread.sleep(5000);
            System.out.println("A=" + System.currentTimeMillis() + ", i=" + thread20.getI());

            //B
            thread20.resume();
            Thread.sleep(5000);

            //C
            thread20.suspend();
            System.out.println("B=" + System.currentTimeMillis() + ", i=" + thread20.getI());
            Thread.sleep(5000);
            System.out.println("B=" + System.currentTimeMillis() + ", i=" + thread20.getI());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
