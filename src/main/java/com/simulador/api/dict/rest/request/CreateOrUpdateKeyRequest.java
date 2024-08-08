package com.simulador.api.dict.rest.request;

import com.simulador.api.dict.model.type.KeyType;

import java.time.LocalDateTime;

public record CreateOrUpdateKeyRequest(String keyValue,
                                       KeyType keyType,
                                       String bankCode,
                                       String accountBranch,
                                       String accountNumber,
                                       LocalDateTime accountOpeningDate,
                                       String ownerName) {
}
