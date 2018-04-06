package com.dream.test.second;

public class Thread4A extends Thread {
    private MyObject myObject;
    public Thread4A(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
