package com.devstudios.redsocial.domain.errors;

import java.time.LocalDateTime;



public class CustomError extends RuntimeException {

    private String error;
    private int status;
    private final LocalDateTime date = LocalDateTime.now();


    private CustomError(String error, int status) {
        super(error);
        this.error = error;
        this.status = status;
    }


    public static CustomError badRequest( String error ){
        return new CustomError(error, 400);
    }

    public static CustomError notFound( String error ){
        return new CustomError(error, 404);
    }

    public static CustomError internalServerError( Object error ){
        System.out.println("Unexpected error - check logs");
        System.out.println(error);

        return new CustomError("Internal server error", 500);
    }


    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public LocalDateTime getDate() {
        return date;
    }

}
