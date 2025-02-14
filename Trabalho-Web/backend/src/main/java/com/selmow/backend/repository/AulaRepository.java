package com.selmow.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selmow.backend.domain.Aula;

public interface AulaRepository extends JpaRepository<Aula, Integer>{
    
}
