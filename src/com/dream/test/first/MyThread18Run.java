package com.dream.test.first;

public class MyThread18Run {
    public static void main(String[] args) {
        try {
            MyThread18 thread18 = new MyThread18();
            thread18.start();
            Thread.sleep(8000);
            thread18.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
