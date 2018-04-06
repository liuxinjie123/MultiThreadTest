package com.dream.test.second;

public class Thread3B extends Thread {
    private HasSelfPrivateNum3 numRef;
    public Thread3B(HasSelfPrivateNum3 numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
