package com.dream.test.first;

public class LoginB extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
