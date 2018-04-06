package com.dream.test.second;

public class Thread8B extends Thread {
    private ObjectService service;
    public Thread8B(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
