package com.example.device.client;

import com.example.device.model.wsdl.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.bind.JAXBElement;

@Component
public class SoapClient extends WebServiceGatewaySupport {

    @Value("${service.ws.path}")
    private String wsPath;
    public String getToken(String username,String password){

        JAXBElement<LoginResponseType> response;
        ObjectFactory obj = new ObjectFactory();

        LoginRequestType request = new LoginRequestType();
        request.setUsername(username);
        request.setPassword(password);

        JAXBElement<LoginRequestType> requestJAX = obj.createLoginRequest(request);

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.device.model.wsdl");
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        try {
            response = (JAXBElement<LoginResponseType>) webServiceTemplate.marshalSendAndReceive(
                    wsPath, requestJAX, new SoapActionCallback("http://example/dummyservice/v1/login"));
            return response.getValue().getToken();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public DispositivosResponseType getDevices(){

        JAXBElement<DispositivosResponseType> response;
        ObjectFactory obj = new ObjectFactory();

        DispositivosRequestType request = new DispositivosRequestType();
        request.setDevices("devices");
        JAXBElement<DispositivosRequestType> requestJAX = obj.createDispositivosRegistradosRequest(request);
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.device.model.wsdl");
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        try {
            response = (JAXBElement<DispositivosResponseType>) webServiceTemplate.marshalSendAndReceive(
                    wsPath, requestJAX, new SoapActionCallback("http://example/dummyservice/v1/dispositivosRegistrados"));
            return response.getValue();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
