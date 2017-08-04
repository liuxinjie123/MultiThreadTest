package com.dream.first.run;

import com.dream.first.service.MyThread;
import com.dream.first.service.MyThread3;

public class MyThreadRunThread2 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        MyThread3 myThread3 = new MyThread3(thread);
        myThread3.start();
    }
}
