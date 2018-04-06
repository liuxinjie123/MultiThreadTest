package com.dream.test.second;

public class Service2ThreadBRun {
    public static void main(String[] args) {
        try {
            Service2 service = new Service2();
            Service2ThreadA threadA = new Service2ThreadA(service);
            threadA.setName("a");
            threadA.start();
            Thread.sleep(500);
            Service2ThreadB threadB = new Service2ThreadB(service);
            threadB.setName("b");
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
