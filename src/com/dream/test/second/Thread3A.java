package com.dream.test.second;

public class Thread3A extends Thread {
    private HasSelfPrivateNum3 numRef;
    public Thread3A(HasSelfPrivateNum3 numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
