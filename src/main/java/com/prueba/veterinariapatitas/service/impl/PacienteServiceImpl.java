package com.prueba.veterinariapatitas.service.impl;

import com.prueba.veterinariapatitas.dto.PacienteDTO;
import com.prueba.veterinariapatitas.entity.Paciente;
import com.prueba.veterinariapatitas.repository.PacienteRepository;
import com.prueba.veterinariapatitas.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;


    @Override
    public PacienteDTO savePaciente(PacienteDTO paciente) {
        return convertToDto(pacienteRepository.save(convertToEntity(paciente)));
    }

    @Override
    public PacienteDTO getPaciente(Long id) {
        return this.pacienteRepository.findById(id).map(this::convertToDto).orElse(null);
    }

    @Override
    public List<PacienteDTO> getAllPacientes() {
        return this.pacienteRepository.findAll().stream().map(this::convertToDto).collect(java.util.stream.Collectors.toList());
    }

    @Override
    public void deletePaciente(Long id) {
        this.pacienteRepository.deleteById(id);
    }

    private PacienteDTO convertToDto(Paciente paciente) {
        PacienteDTO dto = new PacienteDTO();
        dto.setId(paciente.getId());
        dto.setNombre(paciente.getNombre());
        dto.setTipoPaciente(paciente.getTipoPaciente());
        dto.setFechaNacimiento(paciente.getFechaNacimiento());
        dto.setPropietarioId(paciente.getPropietario().getId());
        return dto;
    }

    private Paciente convertToEntity(PacienteDTO dto) {
        Paciente paciente = new Paciente();
        paciente.setId(dto.getId());
        paciente.setNombre(dto.getNombre());
        paciente.setTipoPaciente(dto.getTipoPaciente());
        paciente.setFechaNacimiento(dto.getFechaNacimiento());
        return paciente;
    }
}
