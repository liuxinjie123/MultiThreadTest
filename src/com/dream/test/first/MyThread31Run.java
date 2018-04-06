package com.dream.test.first;

public class MyThread31Run {
    public static void main(String[] args) {
        try {
            MyThread31 thread31 = new MyThread31();
            thread31.setDaemon(true);
            thread31.start();
            System.out.println("thread31.name=" + thread31.getName());
            System.out.println("main thread name=" + Thread.currentThread().getName());
            Thread.sleep(10000);
            System.out.println(" 我离开thread对象，也不再打印了，也就是停止了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
