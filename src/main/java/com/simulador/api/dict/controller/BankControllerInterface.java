package com.simulador.api.dict.controller;

import com.simulador.api.dict.rest.request.CreateBankRequest;
import com.simulador.api.dict.rest.request.UpdateBankRequest;
import com.simulador.api.dict.rest.response.BankResponse;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("banks")
public interface BankControllerInterface {

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody CreateBankRequest request);

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody UpdateBankRequest request);

    @GetMapping("/get")
    public ResponseEntity<Page<BankResponse>> get(@RequestParam int page, @RequestParam int size);

    @GetMapping("/get/{uuid}")
    public ResponseEntity<?> get(@PathVariable UUID uuid);

}
