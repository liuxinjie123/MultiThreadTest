package com.dream.test.second;

public class Thread7ARun {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            Thread7A thread = new Thread7A(publicVar);
            thread.start();
            Thread.sleep(10);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
