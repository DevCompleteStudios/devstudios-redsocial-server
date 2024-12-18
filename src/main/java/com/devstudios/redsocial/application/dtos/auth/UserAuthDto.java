package com.devstudios.redsocial.application.dtos.auth;

import java.util.List;

import com.devstudios.redsocial.application.dtos.shared.Dto;




public class UserAuthDto extends Dto {

    private String email;
    private String username;
    private String nickname;
    private List<SessionDto> sessions;


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
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
    public List<SessionDto> getSessions() {
        return sessions;
    }
    public void setSessions(List<SessionDto> sessions) {
        this.sessions = sessions;
    }

}
