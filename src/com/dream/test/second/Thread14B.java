package com.dream.test.second;

public class Thread14B extends Thread {
    private MyObject6 object;
    public Thread14B(MyObject6 object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
