package com.dream.first.run;

import com.dream.first.service.RandomThread;

public class RunRandomThread {
    public static void main(String[] args) {
        RandomThread randomThread = new RandomThread();
        randomThread.setName("randomThread");
        randomThread.start();
        for (int i = 0; i < 10; i++) {
            int time = (int) (Math.random() * 1000);
            try {
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
