package com.dream.test.second;

public class Father1 {
    public int i = 10;
    synchronized public void operateIFatherMethod() {
        try {
            i--;
            System.out.println(" father print i=" + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
