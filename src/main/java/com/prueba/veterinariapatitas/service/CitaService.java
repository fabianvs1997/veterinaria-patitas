package com.prueba.veterinariapatitas.service;

import com.prueba.veterinariapatitas.dto.CitaDTO;

import java.util.List;

public interface CitaService {
    CitaDTO saveCita(CitaDTO cita);
    CitaDTO getCita(Long id);
    List<CitaDTO> getAllCitas();
    void deleteCita(Long id);
}
