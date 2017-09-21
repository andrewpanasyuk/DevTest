package com.staxter.service.Exception;

public class ErrorResponse {
    private int code = 409;
    private String description = "A user with the given username already exists";

    public int getCode() {
        return code;
    }
    public String getDescription() {
        return description;
    }
}
