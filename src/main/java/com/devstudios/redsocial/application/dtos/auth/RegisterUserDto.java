package com.devstudios.redsocial.application.dtos.auth;

import java.time.LocalDateTime;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotNull;






public class RegisterUserDto extends LoginUserDto {

    @NotNull
    @Length(max=70, min=5)
    private String username;

    @Length(max=70, min=3)
    private String nickname;

    private LocalDateTime birthdate;

    @Length(min = 20, max = 150)
    private String description;


    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public LocalDateTime getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDateTime birthdate) {
        this.birthdate = birthdate;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
