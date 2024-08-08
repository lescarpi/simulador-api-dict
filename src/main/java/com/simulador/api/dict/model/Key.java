package com.simulador.api.dict.model;

import com.simulador.api.dict.model.type.KeyType;
import com.simulador.api.dict.rest.request.CreateOrUpdateKeyRequest;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
@Table(name = "keys")
@Entity
public class Key {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String keyValue;
    private KeyType keyType;

    @ManyToOne
    @JoinColumn(name = "bank_id", nullable = false)
    private Bank bank;

    private String accountBranch;
    private String accountNumber;
    private LocalDateTime accountOpeningDate;
    private String ownerName;
    private final LocalDateTime creationDate = LocalDateTime.now();

}
