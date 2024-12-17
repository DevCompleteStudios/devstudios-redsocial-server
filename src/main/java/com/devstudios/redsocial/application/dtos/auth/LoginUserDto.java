package com.devstudios.redsocial.application.dtos.auth;

import com.devstudios.redsocial.domain.validations.Password;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;



public class LoginUserDto {

    @Email
    @NotNull
    private String email;

    @NotNull
    @NotEmpty
    @Password
    private String password;


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
}
