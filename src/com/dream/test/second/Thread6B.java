package com.dream.test.second;

public class Thread6B extends Thread {
    private MyObject3 object;
    public Thread6B(MyObject3 object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
