package com.simulador.api.dict.model;

import com.simulador.api.dict.model.type.KeyType;
import com.simulador.api.dict.rest.request.CreateKeyRequest;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@Data
@Table(name = "keys")
@Entity
public class Key {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, updatable = false)
    private UUID uuid;

    private String keyValue;

    @Enumerated(EnumType.STRING)
    private KeyType keyType;

    @ManyToOne
    @JoinColumn(name = "bank_id", nullable = false)
    private Bank bank;

    private String accountBranch;
    private String accountNumber;
    private LocalDateTime accountOpeningDate;
    private String ownerName;
    private final LocalDateTime creationDate = LocalDateTime.now();

    public Key(CreateKeyRequest request) {
        this.keyValue = request.keyValue();
        this.keyType = request.keyType();
        this.accountBranch = request.accountBranch();
        this.accountNumber = request.accountNumber();
        this.accountOpeningDate = request.accountOpeningDate();
        this.ownerName = request.ownerName();
    }

    @PrePersist
    private void onCreate() {
        this.uuid = UUID.randomUUID();
    }

}
