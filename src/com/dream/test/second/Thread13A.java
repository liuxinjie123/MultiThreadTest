package com.dream.test.second;

public class Thread13A extends Thread {
    private Service5 service;
    private MyObject4 object;
    public Thread13A(Service5 service, MyObject4 object) {
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
