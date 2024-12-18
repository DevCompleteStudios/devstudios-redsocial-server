package com.devstudios.redsocial.application.services;

import org.springframework.stereotype.Service;

import com.devstudios.redsocial.application.dtos.auth.LoginUserDto;
import com.devstudios.redsocial.application.dtos.auth.RegisterUserDto;
import com.devstudios.redsocial.application.dtos.auth.UpdateAccountDto;
import com.devstudios.redsocial.application.dtos.auth.UserAuthDto;
import com.devstudios.redsocial.application.dtos.shared.ResponseDto;



@Service
public class AuthService {

    public ResponseDto<UserAuthDto> login(LoginUserDto dto){
        return null;
    }


    public ResponseDto<UserAuthDto> register( RegisterUserDto dto ){
        return null;
    }


    public ResponseDto<Boolean> verifyAccount(){
        // Solamente enviar código de autenticación de 6 digitos a su correo
        return null;
    }
    
    
    public ResponseDto<Boolean> updateByCode( UpdateAccountDto dto ){
        return null;
    }


}
