package com.devstudios.redsocial.presentation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devstudios.redsocial.application.dtos.auth.LoginUserDto;
import com.devstudios.redsocial.application.dtos.auth.RegisterUserDto;
import com.devstudios.redsocial.application.services.AuthService;

import jakarta.validation.Valid;




@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService service;

    @PostMapping("/login")
    public ResponseEntity<?> login( @Valid @RequestBody LoginUserDto dto ){
        var res = service.login(dto);
        return ResponseEntity.status(res.getStatus()).body(res);
    }

    @PostMapping("/register")
    public ResponseEntity<?> register( @Valid @RequestBody RegisterUserDto dto ){
        var res = service.register(dto);
        return ResponseEntity.status(res.getStatus()).body(res);
    }

    @GetMapping("/verify-account")
    public ResponseEntity<?> verifyAccount(){
        return null;
    }

    @PutMapping("/update-by-code/{code}")
    public ResponseEntity<?> resetPassword( @Valid @PathVariable String code ){
        return null;
    }

}
