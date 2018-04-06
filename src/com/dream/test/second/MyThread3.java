package com.dream.test.second;

public class MyThread3 extends Thread {
    private Task2 task;
    public MyThread3(Task2 task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}
