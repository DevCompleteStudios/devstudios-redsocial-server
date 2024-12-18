package com.devstudios.redsocial.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devstudios.redsocial.application.dtos.auth.LoginUserDto;
import com.devstudios.redsocial.application.dtos.auth.RegisterUserDto;
import com.devstudios.redsocial.application.dtos.auth.UpdateAccountDto;
import com.devstudios.redsocial.application.dtos.auth.UserAuthDto;
import com.devstudios.redsocial.application.dtos.shared.ResponseDto;
import com.devstudios.redsocial.domain.entities.Session;
import com.devstudios.redsocial.domain.entities.User;
import com.devstudios.redsocial.domain.errors.CustomError;
import com.devstudios.redsocial.infrastructure.repositories.IUsersRepository;

import eu.bitwalker.useragentutils.UserAgent;
import jakarta.servlet.http.HttpServletRequest;



@Service
public class AuthService {

    @Autowired
    private IUsersRepository usersRepository;
    @Autowired
    private HttpServletRequest request;


    public ResponseDto<UserAuthDto> login(LoginUserDto dto){
        User user = usersRepository.findByEmail(dto.getEmail())
            .orElseThrow( () -> CustomError.notFound("Account not exists"));

        // Comparar la contraseña con bcrypt
        Boolean isvalidPassword = true;
        if( !isvalidPassword ) throw CustomError.badRequest("Email or password is not valid");
        if( !isValidAccount(user) ) throw CustomError.badRequest("This account has been suspended");

        // Validar que el inició de sesión sea valido
        Session newSession = isValidCurrentSession(user.getSessions());
        if( newSession != null ){
            this.verifyEmail(user.getEmail());
            user.getSessions().add(newSession);
            usersRepository.save(user);
            // Enviamos el correo electronico con el código de verificacion
            throw CustomError.badRequest("A verification code has been sent");
        }

        return new ResponseDto<>(200, null, "JWT");
    }


    public ResponseDto<UserAuthDto> loginByCode( String code ){
        return null;
    }


    public ResponseDto<UserAuthDto> register( RegisterUserDto dto ){
        return null;
    }


    public ResponseDto<Boolean> verifyEmail(){
        // Solamente enviar código de autenticación de 6 digitos a su correo
        return null;
    }


    public ResponseDto<Boolean> verifyEmail(String email){
        // Solamente enviar código de autenticación de 6 digitos a su correo
        return null;
    }


    public ResponseDto<Boolean> updateByCode( UpdateAccountDto dto ){
        return null;
    }


    private Boolean isValidAccount(User user){
        return user.getIsActive();
    }


    private Session isValidCurrentSession( List<Session> sessions ){
        Session current = getCurrentSession();
        Boolean isValid = sessions.contains(current);

        return null;
    }


    private Session getCurrentSession(){
        String ip = request.getHeader("X-Forwarded-For");
        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));

        if (ip == null || ip.isEmpty() || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }

        String browser = userAgent.getBrowser().getName();
        String os = userAgent.getOperatingSystem().getName();

        Session session = new Session();
        session.setIpAdress(ip);
        session.setBrowser(browser);
        session.setDevice(os);

        return session;
    }

}
