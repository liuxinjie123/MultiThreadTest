package com.dream.test.second;

public class Thread9A extends Thread {
    private ObjectService2 service;
    public Thread9A(ObjectService2 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodA();
    }
}
