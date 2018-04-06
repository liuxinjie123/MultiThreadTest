package com.dream.test.second;

public class Thread3BRun {
    public static void main(String[] args) {
        HasSelfPrivateNum3 numRef1 = new HasSelfPrivateNum3();
        HasSelfPrivateNum3 numRef2 = new HasSelfPrivateNum3();
        Thread3B thread3B = new Thread3B(numRef1);
        thread3B.start();
        Thread3A thread3A = new Thread3A(numRef2);
        thread3A.start();
    }
}
