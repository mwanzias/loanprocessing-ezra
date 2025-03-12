package com.mwanzias.lending.kycservice.controller;

public class ApiResponseServer {
    private String message;
    private Object data;

    public ApiResponseServer(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() { return message; }
    public Object getData() { return data; }
}
