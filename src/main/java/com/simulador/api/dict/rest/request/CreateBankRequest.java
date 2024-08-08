package com.simulador.api.dict.rest.request;

public record CreateBankRequest(String name,
                                String cnpj,
                                String code) {
}
