package com.simulador.api.dict.repository;

import com.simulador.api.dict.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BankRepository extends JpaRepository<Bank, Long> {

    Optional<Bank> findByUuid(UUID uuid);

}
