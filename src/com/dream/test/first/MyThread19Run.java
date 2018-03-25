package com.dream.test.first;

public class MyThread19Run {
    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread19 thread19 = new MyThread19(object);
            thread19.start();
            Thread.sleep(20000);
            thread19.stop();
            System.out.println(object.getUsername() + " --- " + object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
