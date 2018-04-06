package com.dream.test.second;

public class Father2SonThreadA extends Thread {
    private Father2Son son;
    public Father2SonThreadA(Father2Son son) {
        this.son = son;
    }

    @Override
    public void run() {
        son.serviceMethod();
    }
}
