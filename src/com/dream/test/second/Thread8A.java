package com.dream.test.second;

public class Thread8A extends Thread {
    private ObjectService service;
    public Thread8A(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
