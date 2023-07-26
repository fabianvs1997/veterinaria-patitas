package com.prueba.veterinariapatitas.repository;

import com.prueba.veterinariapatitas.entity.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {
}
