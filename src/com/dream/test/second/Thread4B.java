package com.dream.test.second;

public class Thread4B extends Thread {
    private MyObject myObject;
    public Thread4B(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
