package com.dream.first.isalive;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        System.out.println("begin=" + thread.isAlive());
        thread.start();
        System.out.println("end=" + thread.isAlive());
        Thread.sleep(1000);
        System.out.println("end2=" + thread.isAlive());
    }
}
