package com.simulador.api.dict.service;

import com.simulador.api.dict.model.Key;
import com.simulador.api.dict.repository.KeyRepository;
import com.simulador.api.dict.rest.request.CreateOrUpdateKeyRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KeyService {

    private final KeyRepository repository;

    public ResponseEntity<?> create(CreateOrUpdateKeyRequest request) {
        return null;
    }

}
