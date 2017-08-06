package com.dream.first.isinterrupted;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (currentThread().isInterrupted()) {
                break;
            }
            System.out.println("i=" + (i + 1));
        }
    }
}
