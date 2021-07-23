package com.co.alianza.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
public class PayLoad {

    private HttpStatus status;
    private Object content;
    private Object response;
    private String message;

    public PayLoad(HttpStatus status, Object content, Object response, String message) {
        this.status = status;
        this.content = content;
        this.response = response;
        this.message = message;
    }

    public PayLoad(String message, HttpStatus status, Object content, Object response, String message1) {
        this.status = status;
        this.content = content;
        this.response = response;
        this.message = message1;
    }

    public PayLoad(String message, Throwable cause, HttpStatus status, Object content, Object response, String message1) {
        this.status = status;
        this.content = content;
        this.response = response;
        this.message = message1;
    }

    public PayLoad(Throwable cause, HttpStatus status, Object content, Object response, String message) {
        this.status = status;
        this.content = content;
        this.response = response;
        this.message = message;
    }

    public PayLoad(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, HttpStatus status, Object content, Object response, String message1) {
        this.status = status;
        this.content = content;
        this.response = response;
        this.message = message1;
    }

}
