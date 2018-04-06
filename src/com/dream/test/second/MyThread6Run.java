package com.dream.test.second;

public class MyThread6Run {
    public static void main(String[] args) {
        Task3 task = new Task3();
        MyThread5 thread5 = new MyThread5(task);
        thread5.start();
        MyThread6 thread6 = new MyThread6(task);
        thread6.start();
    }
}
