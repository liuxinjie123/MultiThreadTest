package com.dream.first.run;


import com.dream.first.service.MyRunnable;

public class Runnable1 {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
