package com.dream.first.login;

import com.dream.first.login.LoginServlet;

public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
