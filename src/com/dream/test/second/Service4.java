package com.dream.test.second;

public class Service4 {
    private String anyString = new String();
    public void a() {
        try {
            synchronized (anyString) {
                System.out.println(" a begin ");
                Thread.sleep(3000);
                System.out.println(" a end ");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void b() {
        try {
            System.out.println(" b begin ");
            Thread.sleep(3000);
            System.out.println(" b end ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
