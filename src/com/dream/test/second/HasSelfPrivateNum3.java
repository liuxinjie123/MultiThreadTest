package com.dream.test.second;

public class HasSelfPrivateNum3 {
    private int num = 0;
    public void addI(String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println(" a set over");
                //Thread.sleep(1000);
            } else {
                num = 200;
                System.out.println(" b set over");
                Thread.sleep(2000);
            }
            System.out.println(username + " num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
