package com.dream.test.second;

public class MyThread6 extends Thread {
    private Task3 task;
    public MyThread6(Task3 task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
