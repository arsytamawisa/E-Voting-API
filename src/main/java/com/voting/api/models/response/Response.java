package com.example.demo.models.response;

import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

public class Response<T> {

    private int code;
    private String message;
    private T data;
    private LocalDateTime timeStamp;

    private Response(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timeStamp = LocalDateTime.now();
    }

    public static <T> Response<T> success(T data) {
        return new Response<>(HttpStatus.OK.value(), "Success", data);
    }

    public static Response error(HttpStatus status) {
        return error(status.value(), status.getReasonPhrase());
    }

    public static Response error(int code, String message) {
        return error(code, message, null);
    }

    public static <T> Response error(int code, String message, T data) {
        return new Response(code, message, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
