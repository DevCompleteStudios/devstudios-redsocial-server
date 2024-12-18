package com.devstudios.redsocial.application.dtos.auth;

import java.time.LocalDateTime;

import com.devstudios.redsocial.application.dtos.shared.Dto;




public class SessionDto extends Dto {

    private LocalDateTime lastConnection;
    private Long ipAdress;
    private String device;
    private String browser;
    private String location;


    public LocalDateTime getLastConnection() {
        return lastConnection;
    }
    public void setLastConnection(LocalDateTime lastConnection) {
        this.lastConnection = lastConnection;
    }
    public Long getIpAdress() {
        return ipAdress;
    }
    public void setIpAdress(Long ipAdress) {
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
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

}
