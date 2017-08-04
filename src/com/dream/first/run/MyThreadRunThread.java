package com.dream.first.run;

import com.dream.first.service.MyThread;

public class MyThreadRunThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread thread1 = new Thread(thread);
        thread1.start();
    }
}
