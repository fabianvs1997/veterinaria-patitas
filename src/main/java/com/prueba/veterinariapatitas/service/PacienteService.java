package com.prueba.veterinariapatitas.service;

import com.prueba.veterinariapatitas.dto.PacienteDTO;

import java.util.List;

public interface PacienteService {
    PacienteDTO savePaciente(PacienteDTO paciente);
    PacienteDTO getPaciente(Long id);
    List<PacienteDTO> getAllPacientes();
    void deletePaciente(Long id);
}
