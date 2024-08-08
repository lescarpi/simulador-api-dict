package com.simulador.api.dict.controller;

import com.simulador.api.dict.rest.request.CreateOrUpdateKeyRequest;
import com.simulador.api.dict.rest.response.KeyResponse;
import org.springframework.http.ResponseEntity;

public interface KeyControllerInterface {

    public ResponseEntity<?> create(CreateOrUpdateKeyRequest request);

    public ResponseEntity<?> update(CreateOrUpdateKeyRequest request);

    public ResponseEntity<KeyResponse> get(String keyValue);

}
