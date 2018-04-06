package com.dream.test.second;

public class Thread2B extends Thread {
    private HasSelfPrivateNum2 numRef;
    public Thread2B(HasSelfPrivateNum2 numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
