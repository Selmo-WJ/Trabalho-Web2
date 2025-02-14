package com.selmow.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selmow.backend.domain.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    
}
