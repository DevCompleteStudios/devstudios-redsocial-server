package com.devstudios.redsocial.application.dtos.users;

import com.devstudios.redsocial.application.dtos.avatars.AvatarPreviewDto;




public class UserPreviewDto {

    private String username;
    private AvatarPreviewDto avatar;
    private Long id;


    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public AvatarPreviewDto getAvatar() {
        return avatar;
    }
    public void setAvatar(AvatarPreviewDto avatar) {
        this.avatar = avatar;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

}
