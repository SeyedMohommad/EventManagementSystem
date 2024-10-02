package com.ashkanamin.EMS.security;

import java.util.Date;

public class JwtResponse {
    private String token;
    private String tokenType = "Bearer";
    private Date expiresAt;

    public String getToken() {
        return token;
    }

    public JwtResponse setToken(String token) {
        this.token = token;
        return this;
    }

    public String getTokenType() {
        return tokenType;
    }

    public JwtResponse setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public JwtResponse setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public JwtResponse() {
    }

    public JwtResponse(String token, String tokenType, Date expiresAt) {
        this.token = token;
        this.tokenType = tokenType;
        this.expiresAt = expiresAt;
    }
}
