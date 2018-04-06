package com.dream.test.second;

public class Thread9B extends Thread {
    private ObjectService2 service;
    public Thread9B(ObjectService2 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }
}
