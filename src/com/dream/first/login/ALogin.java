package com.dream.first.login;

import com.dream.first.login.LoginServlet;

public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}
