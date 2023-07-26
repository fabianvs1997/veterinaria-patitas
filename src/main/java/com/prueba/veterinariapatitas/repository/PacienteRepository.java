package com.prueba.veterinariapatitas.repository;

import com.prueba.veterinariapatitas.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}

