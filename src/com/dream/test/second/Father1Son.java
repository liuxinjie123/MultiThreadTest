package com.dream.test.second;

public class Father1Son extends Father1 {
    synchronized public void operateISonMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println(" son print i=" + i);
                Thread.sleep(100);
                this.operateIFatherMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
