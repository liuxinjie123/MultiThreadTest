package com.dream.test.second;

public class Thread7A extends Thread {
    private PublicVar publicVar;
    public Thread7A(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B", "BB");
    }
}
