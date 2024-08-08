package com.simulador.api.dict.rest.response;

import com.simulador.api.dict.model.type.KeyType;

import java.time.LocalDateTime;

public record KeyResponse(String keyValue,
                          KeyType keyType,
                          String bankCode,
                          String accountBranch,
                          String accountNumber,
                          LocalDateTime accountOpeningDate,
                          String ownerName,
                          LocalDateTime creationDate) {
}
