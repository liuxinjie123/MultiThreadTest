package com.dream.test.first;

public class MyThread28Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread27 thread27 = new MyThread27();
            thread27.setPriority(5);
            thread27.start();
            MyThread28 thread28 = new MyThread28();
            thread28.setPriority(6);
            thread28.start();
        }
    }
}
