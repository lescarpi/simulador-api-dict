package com.simulador.api.dict.model;

import com.simulador.api.dict.rest.request.CreateBankRequest;
import com.simulador.api.dict.rest.request.UpdateBankRequest;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Data
@Table(name = "banks")
@Entity
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, updatable = false)
    private UUID uuid;

    private String name;
    private String cnpj;
    private String code;

    public Bank(CreateBankRequest request) {
        this.name = request.name();
        this.cnpj = request.cnpj();
        this.code = request.code();
    }

    @PrePersist
    private void onCreate() {
        this.uuid = UUID.randomUUID();
    }

    public void update(UpdateBankRequest request) {
        this.name = request.name();
        this.cnpj = request.cnpj();
        this.code = request.code();
    }

}
