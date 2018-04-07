package com.dream.test.second;

public class Thread15B extends Thread {
    private MyObject7 object;
    public Thread15B(MyObject7 object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
