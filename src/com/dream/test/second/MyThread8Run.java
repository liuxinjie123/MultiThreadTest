package com.dream.test.second;

public class MyThread8Run {
    public static void main(String[] args) throws InterruptedException {
        Task4 task = new Task4();
        MyThread7 thread7 = new MyThread7(task);
        thread7.start();
        Thread.sleep(10);
        MyThread8 thread8 = new MyThread8(task);
        thread8.start();
    }
}
