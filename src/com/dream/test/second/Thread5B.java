package com.dream.test.second;

public class Thread5B extends Thread {
    private MyObject2 object;
    public Thread5B(MyObject2 object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
