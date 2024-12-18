package com.devstudios.redsocial.application.dtos.auth;

import java.time.LocalDateTime;

import com.devstudios.redsocial.application.dtos.shared.Dto;




public class SessionDto extends Dto {

    private LocalDateTime lastConnection;
    private String ipAdress;
    private String device;
    private String browser;


    public LocalDateTime getLastConnection() {
        return lastConnection;
    }
    public void setLastConnection(LocalDateTime lastConnection) {
        this.lastConnection = lastConnection;
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

}
