package com.dream.test.second;

public class Thread15A extends Thread {
    private Service7 service;
    private MyObject7 object;
    public Thread15A(Service7 service, MyObject7 object) {
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
