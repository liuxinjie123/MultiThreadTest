package com.dream.test.first;

public class MyThread19 extends Thread {
    private SynchronizedObject object;
    public MyThread19 (SynchronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
