package com.dream.test.second;

public class Father2SonThreadB extends Thread {
    private Father2Son son;
    public Father2SonThreadB(Father2Son son) {
        this.son = son;
    }

    @Override
    public void run() {
        super.run();
        son.serviceMethod();
    }
}
