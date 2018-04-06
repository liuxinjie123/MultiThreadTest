package com.dream.test.second;

public class Father2SonThreadRun {
    public static void main(String[] args) {
        Father2Son son = new Father2Son();
        Father2SonThreadA a = new Father2SonThreadA(son);
        a.setName("A");
        a.start();
        Father2SonThreadB b = new Father2SonThreadB(son);
        b.setName("B");
        b.start();
    }
}
