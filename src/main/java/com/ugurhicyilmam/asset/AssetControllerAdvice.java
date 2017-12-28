package com.ugurhicyilmam.asset;

import com.ugurhicyilmam.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
@ResponseStatus(HttpStatus.BAD_REQUEST)
class AssetControllerAdvice {

    @ExceptionHandler(AssetNotFoundException.class)
    Response handleAssetNotFound() {
        return new Response<>(null, "E01");
    }
}
