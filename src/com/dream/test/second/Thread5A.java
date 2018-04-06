package com.dream.test.second;

public class Thread5A extends Thread {
    private MyObject2 object;
    public Thread5A(MyObject2 object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
