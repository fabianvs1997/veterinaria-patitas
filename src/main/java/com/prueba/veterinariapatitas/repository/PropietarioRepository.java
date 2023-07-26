package com.prueba.veterinariapatitas.repository;

import com.prueba.veterinariapatitas.entity.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Long> {
}
