package com.dream.test.second;

public class MyThread8 extends Thread {
    private Task4 task;
    public MyThread8(Task4 task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }
}
