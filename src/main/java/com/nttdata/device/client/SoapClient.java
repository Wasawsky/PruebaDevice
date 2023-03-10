package com.nttdata.device.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Component
public class SoapClient extends WebServiceGatewaySupport {

    public String getToken(String username,String password){


        return null;
    }
}
