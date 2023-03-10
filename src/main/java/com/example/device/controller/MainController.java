package com.example.device.controller;

import com.example.device.model.request.LoginRequest;
import com.example.device.model.response.LoginResponse;
import com.example.device.model.wsdl.DispositivosType;
import com.example.device.persistence.entity.UserToken;
import com.example.device.persistence.repository.UserTokenRepository;
import com.example.device.service.DeviceService;
import com.example.device.service.LoginService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "${service.controller.path}")
public class MainController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private DeviceService deviceService;

    @Autowired
    private UserTokenRepository userTokenRepository;


    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Obtuvo el token exitosamente",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoginResponse.class)) }),
            @ApiResponse(responseCode = "400", description = "No encontro el token en el servicio"),
            @ApiResponse(responseCode = "500", description = "Error interno, no se pudo conectar al servidor")
    })
    @Operation(summary = "Post Login, obtener token del servicio externo")
    @PostMapping(path = "/login",  consumes = {MediaType.APPLICATION_JSON_VALUE},  produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> postLogin(@RequestBody LoginRequest loginRequest) {
        LoginResponse login = loginService.login(loginRequest);
        if (login.getToken().equals("ERROR")){
            return new ResponseEntity<>(login, HttpStatus.BAD_REQUEST);
        }else {
            return new ResponseEntity<>(login, HttpStatus.OK);
        }

    }

    @Operation(summary = "Get Devices, Obtener dispositivos registrados, validando el token suministrado")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Obtuvo los dispositivos correctamente",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = DispositivosType.class)) }),
            @ApiResponse(responseCode = "400", description = "No encontro dispositivos o no encontro el token suministrado para validar"),
            @ApiResponse(responseCode = "500", description = "Error interno, no se pudo conectar al servidor")
    })
    @GetMapping(path = "/devices",  produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> getDevices(@RequestHeader(HttpHeaders.AUTHORIZATION) String authorization) {
        boolean tokenRequest = findTokenRequest(authorization.substring(7));//BEARER
        if(tokenRequest){
            return new ResponseEntity<>(deviceService.getDevices(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>("TOKEN NO ENCONTRADO", HttpStatus.NOT_FOUND);
        }
    }

    /***
     * Recuperar token guardado
     * @param token el token
     * @return verdadero si encontro el token, falso si no
     */
    private boolean findTokenRequest(String token){
        boolean isFound = false;
        Iterable<UserToken> users = userTokenRepository.findAll();
        for (UserToken userToken: users) {
            if (userToken.getToken().equals(token)){
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}