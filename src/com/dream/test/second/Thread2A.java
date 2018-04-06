package com.dream.test.second;

public class Thread2A extends Thread {
    private HasSelfPrivateNum2 numRef;
    public Thread2A(HasSelfPrivateNum2 numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
