package com.example.device.service.impl;

import com.example.device.client.SoapClient;
import com.example.device.model.request.LoginRequest;
import com.example.device.model.response.LoginResponse;
import com.example.device.persistence.entity.UserToken;
import com.example.device.persistence.repository.UserTokenRepository;
import com.example.device.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class LoginServiceImpl implements LoginService {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:sssXXX");

    @Autowired
    SoapClient soapClient;

    @Autowired
    UserTokenRepository userTokenRepository;

    /***
     * Hacer login en el servicio externo y obtener el token
     * @param loginRequest login request
     * @return respuesta con el token obtenido
     */
    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse();
        try {
            String token = soapClient.getToken(loginRequest.getUser(), loginRequest.getPassword());
            if (token != null){
                UserToken userToken = new UserToken();
                userToken.setId(1L);
                userToken.setUsername(loginRequest.getUser());
                userToken.setToken(token);
                userToken.setFecha(dateFormat.format(new Date()));
                userTokenRepository.save(userToken);
                loginResponse.setToken(token);
            }else {
                loginResponse.setToken("ERROR");
            }
        }catch (Exception e ){
            loginResponse.setToken("ERROR");
        }
        return loginResponse;
    }
}
