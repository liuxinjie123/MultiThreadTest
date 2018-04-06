package com.dream.test.second;

public class MyThread5 extends Thread {
    private Task3 task;
    public MyThread5(Task3 task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
