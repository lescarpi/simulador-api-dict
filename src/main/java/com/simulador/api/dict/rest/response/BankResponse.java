package com.simulador.api.dict.rest.response;

import com.simulador.api.dict.model.Bank;

import java.util.UUID;

public record BankResponse(UUID uuid,
                           String name,
                           String cnpj,
                           String code) {

    public BankResponse(Bank bank) {
        this(bank.getUuid(), bank.getName(), bank.getCnpj(), bank.getCode());
    }

}
