package com.simulador.api.dict.repository;

import com.simulador.api.dict.model.Key;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeyRepository extends JpaRepository<Key, Long> {
}
