package com.dream.test.second;

public class Thread13B extends Thread {
    private MyObject4 object;
    private Service5 service;
    public Thread13B(Service5 service, MyObject4 object) {
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
