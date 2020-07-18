package com.demo.tyba.login.models;

public class JwtToken {
    String accessToken;

    public JwtToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String access_token) {
        this.accessToken = access_token;
    }
}
