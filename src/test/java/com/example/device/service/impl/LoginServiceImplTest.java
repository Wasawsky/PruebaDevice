package com.example.device.service.impl;

import com.example.device.client.SoapClient;
import com.example.device.model.request.LoginRequest;
import com.example.device.model.response.LoginResponse;
import com.example.device.persistence.repository.UserTokenRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.text.SimpleDateFormat;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

public class LoginServiceImplTest {
    @Mock
    SimpleDateFormat dateFormat;
    @Mock
    SoapClient soapClient;
    @Mock
    UserTokenRepository userTokenRepository;
    @InjectMocks
    LoginServiceImpl loginServiceImpl;


    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testLogin() throws Exception {
        when(soapClient.getToken(anyString(), anyString())).thenReturn("getTokenResponse");

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUser("USER");
        loginRequest.setPassword("PASS");
        LoginResponse result = loginServiceImpl.login(loginRequest);
        assertNotNull(result);
    }

    @Test
    public void testLoginNoToken() throws Exception {
        when(soapClient.getToken(anyString(), anyString())).thenReturn("getTokenResponse");

        LoginResponse result = loginServiceImpl.login(new LoginRequest());
        assertNotNull(result);
    }
}