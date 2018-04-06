package com.dream.test.second;

public class Thread6A extends Thread {
    private MyObject3 object;
    public Thread6A(MyObject3 object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
