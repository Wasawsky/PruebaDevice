package com.nttdata.device.configuration;

import com.nttdata.device.client.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class PruebaDeviceApplication {

    @Autowired
    SoapClient client;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.nttdata.device.model.wsdl");
        return marshaller;
    }
    @Bean
    public SoapClient soapClientBean(Jaxb2Marshaller marshaller) {
        client.setDefaultUri("http://localhost:10000/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}