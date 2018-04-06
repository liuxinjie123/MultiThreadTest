package com.dream.test.second;

public class Thread11A extends Thread {
    private Service4 service;
    public Thread11A(Service4 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.a();
    }
}
