package com.dream.test.first;

public class LoginA extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}
