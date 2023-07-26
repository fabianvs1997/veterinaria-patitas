package com.prueba.veterinariapatitas.repository;

import com.prueba.veterinariapatitas.entity.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
}

