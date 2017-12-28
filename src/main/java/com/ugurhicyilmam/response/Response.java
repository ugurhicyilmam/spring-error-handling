package com.ugurhicyilmam.response;

import lombok.Data;


@Data
public class Response<T> {
    private String code;
    private String message;
    private T data;

    public Response(T data, String code) {
        this.data = data;
        this.code = code;
    }
}