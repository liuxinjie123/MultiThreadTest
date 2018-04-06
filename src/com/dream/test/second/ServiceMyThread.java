package com.dream.test.second;

public class ServiceMyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
