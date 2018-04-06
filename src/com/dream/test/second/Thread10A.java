package com.dream.test.second;

public class Thread10A extends Thread {
    private Service3 service;
    public Thread10A(Service3 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernameParamPassword("a", "aa");
    }
}
