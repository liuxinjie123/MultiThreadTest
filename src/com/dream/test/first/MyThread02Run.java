package com.dream.test.first;

public class MyThread02Run {
    public static void main(String[] args) {
        try {
            MyThread02 thread02 = new MyThread02();
            thread02.setName("MyThread02");
            thread02.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName() + ", time=" + time);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
