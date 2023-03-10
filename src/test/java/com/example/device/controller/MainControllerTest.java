package com.example.device.controller;

import com.example.device.model.request.LoginRequest;
import com.example.device.model.response.LoginResponse;
import com.example.device.model.wsdl.DispositivosType;
import com.example.device.persistence.repository.UserTokenRepository;
import com.example.device.service.DeviceService;
import com.example.device.service.LoginService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

public class MainControllerTest {
    @Mock
    LoginService loginService;
    @Mock
    DeviceService deviceService;
    @Mock
    UserTokenRepository userTokenRepository;
    @InjectMocks
    MainController mainController;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testPostLogin() throws Exception {
        LoginResponse response = new LoginResponse();
        response.setToken("TOKEN");
        when(loginService.login(any())).thenReturn(response);

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUser("USER");
        loginRequest.setPassword("PASS");
        ResponseEntity<Object> result = mainController.postLogin(loginRequest);
        assertNotNull(result);
    }

    @Test
    public void testGetDevices() throws Exception {
        when(deviceService.getDevices()).thenReturn(new DispositivosType());

        ResponseEntity<Object> result = mainController.getDevices("authorization");
        assertNotNull(result);
    }
}