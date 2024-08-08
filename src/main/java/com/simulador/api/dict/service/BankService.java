
package com.simulador.api.dict.service;

import com.simulador.api.dict.model.Bank;
import com.simulador.api.dict.repository.BankRepository;
import com.simulador.api.dict.rest.request.CreateBankRequest;
import com.simulador.api.dict.rest.request.UpdateBankRequest;
import com.simulador.api.dict.rest.response.BankResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BankService {

    private final BankRepository repository;

    public ResponseEntity<?> create(CreateBankRequest request) {
        Bank bank = new Bank(request);

        repository.save(bank);

        return ResponseEntity.status(HttpStatus.CREATED).body(new BankResponse(bank));
    }

    public ResponseEntity<?> update(UpdateBankRequest request) {
        Optional<Bank> optionalBank = repository.findByUuid(request.uuid());
        if (optionalBank.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Banco não encontrado.");
        }

        Bank bank = optionalBank.get();
        bank.update(request);
        repository.save(bank);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    public ResponseEntity<Page<BankResponse>> get(int page, int size) {
        Page<Bank> bankPage = repository.findAll(PageRequest.of(page, size));
        Page<BankResponse> bankResponsePage = bankPage.map(BankResponse::new);

        return ResponseEntity.status(HttpStatus.OK).body(bankResponsePage);
    }

    public ResponseEntity<?> get(UUID uuid) {
        Optional<Bank> optionalBank = repository.findByUuid(uuid);
        if (optionalBank.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Banco não encontrado.");
        }

        BankResponse bankResponse = new BankResponse(optionalBank.get());
        return ResponseEntity.status(HttpStatus.OK).body(bankResponse);
    }

}
