package com.example.device.service;

import com.example.device.model.request.LoginRequest;
import com.example.device.model.response.LoginResponse;

/***
 * Servicio Login
 */
public interface LoginService {

    LoginResponse login(LoginRequest loginRequest);

}
