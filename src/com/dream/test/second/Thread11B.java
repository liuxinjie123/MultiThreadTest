package com.dream.test.second;

public class Thread11B extends Thread {
    private Service4 service;
    public Thread11B(Service4 service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.b();
    }
}
