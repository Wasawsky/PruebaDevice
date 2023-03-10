package com.nttdata.device.controller;

import com.nttdata.device.model.request.LoginRequest;
import com.nttdata.device.service.DeviceService;
import com.nttdata.device.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${service.controller.path}")
public class MainController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private DeviceService deviceService;

    @PostMapping(path = "/login",  consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> postLogin(LoginRequest loginRequest) {
        return new ResponseEntity<>(loginService.login(loginRequest), HttpStatus.OK);
    }

    @GetMapping(path = "/devices",  produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> getDevices(LoginRequest loginRequest) {
        return new ResponseEntity<>(loginService.login(loginRequest), HttpStatus.OK);
    }
}