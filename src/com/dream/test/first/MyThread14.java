package com.dream.test.first;

public class MyThread14 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5000000; i++) {
            if (this.isInterrupted()) {
                System.out.println("已经是停止状态了！我要退出了！");
                break;
            }
            System.out.println("i=" + (i+1));
        }
    }
}
