package com.simulador.api.dict.service;

import com.simulador.api.dict.model.Bank;
import com.simulador.api.dict.model.Key;
import com.simulador.api.dict.repository.BankRepository;
import com.simulador.api.dict.repository.KeyRepository;
import com.simulador.api.dict.rest.request.CreateKeyRequest;
import com.simulador.api.dict.rest.response.KeyResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class KeyService {

    private final BankRepository bankRepository;

    private final KeyRepository keyRepository;

    public ResponseEntity<?> create(CreateKeyRequest request) {
        Optional<Bank> bank = bankRepository.findByCode(request.bankCode());
        if (bank.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi encontrado banco com esse código.");
        }

        Key key = new Key(request);
        key.setBank(bank.get());

        keyRepository.save(key);

        return ResponseEntity.status(HttpStatus.CREATED).body(new KeyResponse(key));
    }

    public ResponseEntity<?> get(UUID uuid) {
        Optional<Key> optionalKey = keyRepository.findByUuid(uuid);
        if (optionalKey.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Chave não encontrada.");
        }

        KeyResponse keyResponse = new KeyResponse(optionalKey.get());
        return ResponseEntity.status(HttpStatus.OK).body(keyResponse);
    }

}
