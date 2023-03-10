package com.example.device.service.impl;

import com.example.device.client.SoapClient;
import com.example.device.model.wsdl.DispositivosResponseType;
import com.example.device.model.wsdl.DispositivosType;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;


public class DeviceServiceImplTest {
    @Mock
    SoapClient soapClient;
    @InjectMocks
    DeviceServiceImpl deviceServiceImpl;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetDevices() throws Exception {
        when(soapClient.getDevices()).thenReturn(new DispositivosResponseType());

        DispositivosType result = deviceServiceImpl.getDevices();
        assertNull(result);
    }
}