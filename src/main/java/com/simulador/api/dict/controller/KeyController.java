package com.simulador.api.dict.controller;

import com.simulador.api.dict.rest.request.CreateOrUpdateKeyRequest;
import com.simulador.api.dict.rest.response.KeyResponse;
import org.springframework.http.ResponseEntity;

public class KeyController implements KeyControllerInterface {

    @Override
    public ResponseEntity<?> create(CreateOrUpdateKeyRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<?> update(CreateOrUpdateKeyRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<KeyResponse> get(String keyValue) {
        return null;
    }

}
