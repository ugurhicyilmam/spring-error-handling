package com.ugurhicyilmam.response;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ResponseCode {
    SUCCESS("S00"),
    ASSET_NOT_FOUND("E01");

    private String value;

    ResponseCode(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return value;
    }
}