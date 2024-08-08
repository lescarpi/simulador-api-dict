package com.simulador.api.dict.repository;

import com.simulador.api.dict.model.Key;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface KeyRepository extends JpaRepository<Key, Long> {

    Optional<Key> findByUuid(UUID uuid);

}
