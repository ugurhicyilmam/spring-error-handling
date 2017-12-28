package com.ugurhicyilmam.response;

import lombok.Data;

import static com.ugurhicyilmam.response.ResponseCode.SUCCESS;


@Data
public class Response<T> {
    private ResponseCode code;
    private T data;

    private Response(T data, ResponseCode code) {
        this.data = data;
        this.code = code;
    }

    public static <T> Response<T> success(T data) {
        return new Response<>(data, SUCCESS);
    }

    public static <T> Response<T> error(ResponseCode responseCode, T data) {
        assert !SUCCESS.equals(responseCode);
        return new Response<>(data, responseCode);
    }

    public static <T> Response<T> success() {
        return success(null);
    }

    public static <T> Response<T> error(ResponseCode responseCode) {
        return error(responseCode, null);
    }
}