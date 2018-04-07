package com.dream.test.second;

public class Thread14A extends Thread {
    private Service6 service;
    private MyObject6 object;
    public Thread14A(Service6 service, MyObject6 object) {
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
