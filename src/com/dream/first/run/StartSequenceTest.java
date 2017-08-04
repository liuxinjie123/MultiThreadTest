package com.dream.first.run;

import com.dream.first.service.MyThread2;

public class StartSequenceTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            MyThread2 thread = new MyThread2(i);
            thread.start();
        }
    }
}
