package com.dream.test.second;

public class MyThread4 extends Thread {
    private Task2 task;
    public MyThread4(Task2 task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
