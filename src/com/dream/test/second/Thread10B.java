package com.dream.test.second;

public class Thread10B extends Thread {
    private Service3 service;
    public Thread10B(Service3 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernameParamPassword("b", "bb");
    }
}
