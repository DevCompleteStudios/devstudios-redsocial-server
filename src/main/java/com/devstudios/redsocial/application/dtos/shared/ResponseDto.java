package com.devstudios.redsocial.application.dtos.shared;

import java.time.LocalDateTime;

public class ResponseDto<T> {
    private LocalDateTime date = LocalDateTime.now();
    private int status;
    private T data;
    private String token;


    public ResponseDto(){}

    public ResponseDto(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public ResponseDto(int status, T data, String token) {
        this(status, data);
        this.token = token;
    }

    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    
}
