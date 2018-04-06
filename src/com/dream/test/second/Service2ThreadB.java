package com.dream.test.second;

public class Service2ThreadB extends Thread {
    private Service2 service;
    public Service2ThreadB(Service2 service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
