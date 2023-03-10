package com.nttdata.device.service;

import com.nttdata.device.model.request.LoginRequest;
import com.nttdata.device.model.response.LoginResponse;

public interface LoginService {

    LoginResponse login(LoginRequest loginRequest);
}
