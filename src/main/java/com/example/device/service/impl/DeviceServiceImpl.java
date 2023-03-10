package com.example.device.service.impl;

import com.example.device.client.SoapClient;
import com.example.device.model.wsdl.DispositivosType;
import com.example.device.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    SoapClient soapClient;

    /***
     * Obtener dispositivos del servicio
     * @return los dispositivos
     */
    @Override
    public DispositivosType getDevices() {
        return soapClient.getDevices().getDispositivos();
    }
}
