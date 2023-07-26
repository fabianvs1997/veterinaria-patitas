package com.prueba.veterinariapatitas.service.impl;

import com.prueba.veterinariapatitas.dto.CitaDTO;
import com.prueba.veterinariapatitas.entity.Cita;
import com.prueba.veterinariapatitas.entity.Paciente;
import com.prueba.veterinariapatitas.entity.Propietario;
import com.prueba.veterinariapatitas.entity.Veterinario;
import com.prueba.veterinariapatitas.repository.CitaRepository;
import com.prueba.veterinariapatitas.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {


    @Autowired
    private CitaRepository citaRepository;

    @Override
    public CitaDTO saveCita(CitaDTO cita) {
        return convertToDto(citaRepository.save(convertToEntity(cita)));
    }

    @Override
    public CitaDTO getCita(Long id) {
        return this.citaRepository.findById(id).map(this::convertToDto).orElse(null);
    }

    @Override
    public List<CitaDTO> getAllCitas() {
        return this.citaRepository.findAll().stream().map(this::convertToDto).collect(java.util.stream.Collectors.toList());
    }

    @Override
    public void deleteCita(Long id) {
        this.citaRepository.deleteById(id);
    }


    private CitaDTO convertToDto(Cita cita) {
        CitaDTO dto = new CitaDTO();
        dto.setId(cita.getId());
        dto.setFechaHora(cita.getFechaHora());
        dto.setPacienteId(cita.getPaciente().getId());
        dto.setPropietarioId(cita.getPropietario().getId());
        dto.setVeterinarioId(cita.getVeterinario().getId());
        return dto;
    }

    private Cita convertToEntity(CitaDTO dto) {
        Cita cita = new Cita();
        cita.setId(dto.getId());
        cita.setFechaHora(dto.getFechaHora());
        Paciente paciente = new Paciente();
        paciente.setId(dto.getPacienteId());
        cita.setPaciente(paciente);
        Propietario propietario = new Propietario();
        propietario.setId(dto.getPropietarioId());
        cita.setPropietario(propietario);
        Veterinario veterinario = new Veterinario();
        veterinario.setId(dto.getVeterinarioId());
        cita.setVeterinario(veterinario);
        return cita;
    }
}
