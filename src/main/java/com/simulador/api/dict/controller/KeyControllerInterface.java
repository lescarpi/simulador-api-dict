package com.simulador.api.dict.controller;

import com.simulador.api.dict.rest.request.CreateKeyRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@RequestMapping("keys")
public interface KeyControllerInterface {

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody CreateKeyRequest request);

    @GetMapping("/get/{uuid}")
    public ResponseEntity<?> get(UUID uuid);

}
