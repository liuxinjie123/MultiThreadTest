package com.dream.test.second;

public class Thread2BRun {
    public static void main(String[] args) {
        HasSelfPrivateNum2 numRef = new HasSelfPrivateNum2();
        Thread2A thread2A = new Thread2A(numRef);
        thread2A.start();
        Thread2B thread2B = new Thread2B(numRef);
        thread2B.start();
    }
}
