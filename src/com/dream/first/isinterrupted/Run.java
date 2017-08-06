package com.dream.first.isinterrupted;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        myThread.interrupted();
        Thread.currentThread().interrupt();
        System.out.println("是否停止1: " + myThread.interrupted());
        System.out.println("是否停止2: " + myThread.interrupted());
        System.out.println("是否停止3: " + myThread.isInterrupted());
        System.out.println("是否停止4: " + myThread.isInterrupted());
        System.out.println("end");
    }
}
