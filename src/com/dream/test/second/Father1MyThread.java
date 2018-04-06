package com.dream.test.second;

public class Father1MyThread extends Thread {
    @Override
    public void run() {
        Father1Son son = new Father1Son();
        son.operateISonMethod();
    }
}
