package com.example.geminichatbot;

public interface ResponseCallback {

    void onResponse(String response);

    void onError(Throwable throwable);
}
