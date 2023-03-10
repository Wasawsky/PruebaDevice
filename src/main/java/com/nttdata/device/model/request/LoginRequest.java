package com.nttdata.device.model.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginRequest {

    private String user;
    private String password;
}
