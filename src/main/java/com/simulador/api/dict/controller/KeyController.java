package com.simulador.api.dict.controller;

import com.simulador.api.dict.rest.request.CreateKeyRequest;
import com.simulador.api.dict.rest.response.KeyResponse;
import com.simulador.api.dict.service.KeyService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
public class KeyController implements KeyControllerInterface {

    private final KeyService service;

    @Override
    public ResponseEntity<?> create(CreateKeyRequest request) {
        return service.create(request);
    }

    @Override
    public ResponseEntity<?> get(UUID uuid) {
        return service.get(uuid);
    }

}
