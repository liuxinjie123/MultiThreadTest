package com.dream.test.first;

import java.util.Random;

public class MyThread26 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50000; j++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + j;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.print(" ***** thread26 use time=" + (endTime - beginTime) + " 毫秒.");
    }
}
