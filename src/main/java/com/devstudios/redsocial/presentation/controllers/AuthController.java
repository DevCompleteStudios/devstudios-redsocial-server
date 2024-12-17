package com.devstudios.redsocial.presentation.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/auth")
public class AuthController {


    @PostMapping("/login")
    public ResponseEntity<?> login(){
        return null;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(){
        return null;
    }
    
    @GetMapping("/verify-account")
    public ResponseEntity<?> forgotPassword(){
        return null;
    }

    @PutMapping("/update-by-code/{code}")
    public ResponseEntity<?> resetPassword( @PathVariable String code ){
        return null;
    }

}
