package com.dream.test.second;

public class MyThread7 extends Thread {
    private Task4 task;
    public MyThread7(Task4 task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
