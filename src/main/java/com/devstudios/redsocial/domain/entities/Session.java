package com.devstudios.redsocial.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name="session")
public class Session {

    @Id
    private Long id;
    private LocalDateTime lastConnection;

    @ManyToOne
    private User user;
    private String ipAdress;
    private String device;
    private String browser;
    private Boolean isActive;
    private LocalDateTime createdAt;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getLastConnection() {
        return lastConnection;
    }
    public void setLastConnection(LocalDateTime lastConnection) {
        this.lastConnection = lastConnection;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getIpAdress() {
        return ipAdress;
    }
    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }
    public String getDevice() {
        return device;
    }
    public void setDevice(String device) {
        this.device = device;
    }
    public String getBrowser() {
        return browser;
    }
    public void setBrowser(String browser) {
        this.browser = browser;
    }
    public Boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}
