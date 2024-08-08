package com.simulador.api.dict.controller;

import com.simulador.api.dict.rest.request.CreateBankRequest;
import com.simulador.api.dict.rest.request.UpdateBankRequest;
import com.simulador.api.dict.rest.response.BankResponse;
import com.simulador.api.dict.service.BankService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
public class BankController implements BankControllerInterface {

    private final BankService service;

    @Override
    public ResponseEntity<?> create(CreateBankRequest request) {
        return service.create(request);
    }

    @Override
    public ResponseEntity<?> update(UpdateBankRequest request) {
        return service.update(request);
    }

    @Override
    public ResponseEntity<Page<BankResponse>> get(int page, int size) {
        return service.get(page, size);
    }

    @Override
    public ResponseEntity<?> get(UUID uuid) {
        return service.get(uuid);
    }

}
