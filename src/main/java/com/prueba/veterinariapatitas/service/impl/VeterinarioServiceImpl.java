package com.prueba.veterinariapatitas.service.impl;

import com.prueba.veterinariapatitas.dto.VeterinarioDTO;
import com.prueba.veterinariapatitas.entity.Veterinario;
import com.prueba.veterinariapatitas.repository.VeterinarioRepository;
import com.prueba.veterinariapatitas.service.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VeterinarioServiceImpl implements VeterinarioService {

    @Autowired
    private VeterinarioRepository veterinarioRepository;
    @Override
    public VeterinarioDTO saveVeterinario(VeterinarioDTO veterinarioDto) {
        return convertToDto(this.veterinarioRepository.save(convertToEntity(veterinarioDto)));
    }

    @Override
    public VeterinarioDTO getVeterinario(Long id) {
        Optional<Veterinario> veterinarian = this.veterinarioRepository.findById(id);
        if (veterinarian.isPresent()) {
            return convertToDto(veterinarian.get());
        } else {
            throw new RuntimeException("Veterinario no encontrado");
        }
    }

    @Override
    public List<VeterinarioDTO> getAllVeterinarios() {
        List<Veterinario> veterinarios = this.veterinarioRepository.findAll();
        return veterinarios.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @Override
    public void deleteVeterinario(Long id) {
        this.veterinarioRepository.deleteById(id);
    }

    private VeterinarioDTO convertToDto(Veterinario veterinario) {
        VeterinarioDTO dto = new VeterinarioDTO();
        dto.setId(veterinario.getId());
        dto.setApellidoPaterno(veterinario.getApellidoPaterno());
        dto.setApellidoMaterno(veterinario.getApellidoMaterno());
        dto.setNombre(veterinario.getNombre());
        dto.setCedulaProfesional(veterinario.getCedulaProfesional());
        return dto;
    }

    private Veterinario convertToEntity(VeterinarioDTO dto) {
        Veterinario veterinario = new Veterinario();
        veterinario.setId(dto.getId());
        veterinario.setApellidoPaterno(dto.getApellidoPaterno());
        veterinario.setApellidoMaterno(dto.getApellidoMaterno());
        veterinario.setNombre(dto.getNombre());
        veterinario.setCedulaProfesional(dto.getCedulaProfesional());
        return veterinario;
    }
}
