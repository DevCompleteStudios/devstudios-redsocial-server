package com.devstudios.redsocial.application.dtos.shared;

import java.time.LocalDateTime;

public class Dto {
    private Long id;
    private LocalDateTime createdAt;
    private Boolean isActive;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public Boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    
}