package com.dream.first.run;


import com.dream.first.service.MyRunnable;

public class Runnable2 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("运行结束");
    }
}
