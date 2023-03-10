package com.nttdata.device.service.impl;

import com.nttdata.device.client.SoapClient;
import com.nttdata.device.model.request.LoginRequest;
import com.nttdata.device.model.response.LoginResponse;
import com.nttdata.device.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private SoapClient soapClient;

    @Override
    public LoginResponse login(LoginRequest loginRequest) {

        String token = soapClient.getToken(loginRequest.getUser(), loginRequest.getPassword());

        return null;
    }
}
