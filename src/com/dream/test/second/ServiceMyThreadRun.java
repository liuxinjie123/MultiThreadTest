package com.dream.test.second;

public class ServiceMyThreadRun {
    public static void main(String[] args) {
        ServiceMyThread thread = new ServiceMyThread();
        thread.start();
    }
}
