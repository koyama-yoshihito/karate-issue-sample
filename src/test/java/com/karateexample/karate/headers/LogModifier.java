package com.karateexample.karate.headers;

import com.intuit.karate.http.HttpLogModifier;

public class LogModifier implements HttpLogModifier {

    @Override
    public boolean enableForUri(String uri) {
        return true;
    }

    @Override
    public String uri(String uri) {
        return uri;
    }

    @Override
    public String header(String header, String value) {
        if (header.toLowerCase().contains("authorization")) {
            return "***";
        }
        return value;
    }

    @Override
    public String request(String uri, String request) {
        return request;
    }

    @Override
    public String response(String uri, String response) {
        return response;
    }
}
