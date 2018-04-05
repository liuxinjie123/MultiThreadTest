package com.dream.test.first;

public class MyObjectRun {
    public static void main(String[] args) throws InterruptedException {
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread() {
            public void run() {
                myObject.setValue("a", "aa");
            };
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                myObject.printUserPassword();
            };
        };
        thread2.start();
    }
}
