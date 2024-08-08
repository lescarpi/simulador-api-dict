package com.simulador.api.dict.rest.response;

import com.simulador.api.dict.model.Key;
import com.simulador.api.dict.model.type.KeyType;

import java.time.LocalDateTime;
import java.util.UUID;

public record KeyResponse(UUID uuid,
                          String keyValue,
                          KeyType keyType,
                          String bankCode,
                          String accountBranch,
                          String accountNumber,
                          LocalDateTime accountOpeningDate,
                          String ownerName,
                          LocalDateTime creationDate) {

    public KeyResponse(Key key) {
        this(key.getUuid(), key.getKeyValue(), key.getKeyType(), key.getBank().getCode(), key.getAccountBranch(),
                key.getAccountNumber(), key.getAccountOpeningDate(), key.getOwnerName(), key.getCreationDate());
    }

}
