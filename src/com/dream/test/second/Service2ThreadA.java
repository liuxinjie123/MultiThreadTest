package com.dream.test.second;

public class Service2ThreadA extends Thread {
    private Service2 service;
    public Service2ThreadA(Service2 service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
