package com.dream.first.run;

import com.dream.first.service.MyThread5;

public class RunMyThread5 {
    public static void main(String[] args) {
        MyThread5 thread1 = new MyThread5("A");
        MyThread5 thread2 = new MyThread5("B");
        MyThread5 thread3 = new MyThread5("C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
