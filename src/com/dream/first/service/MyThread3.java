package com.dream.first.service;

public class MyThread3 extends Thread {
    private Thread thread;
    public MyThread3(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        thread.run();
    }
}
