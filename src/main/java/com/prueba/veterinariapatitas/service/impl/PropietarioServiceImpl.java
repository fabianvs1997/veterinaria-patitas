package com.prueba.veterinariapatitas.service.impl;

import com.prueba.veterinariapatitas.dto.PropietarioDTO;
import com.prueba.veterinariapatitas.entity.Propietario;
import com.prueba.veterinariapatitas.repository.PropietarioRepository;
import com.prueba.veterinariapatitas.service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PropietarioServiceImpl implements PropietarioService {

    @Autowired
    private PropietarioRepository propietarioRepository;


    @Override
    public PropietarioDTO savePropietario(PropietarioDTO propietario) {
        return convertToDto(propietarioRepository.save(convertToEntity(propietario)));
    }

    @Override
    public PropietarioDTO getPropietario(Long id) {
        return this.propietarioRepository.findById(id).map(this::convertToDto).orElse(null);
    }

    @Override
    public List<PropietarioDTO> getAllPropietarios() {
        return this.propietarioRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @Override
    public void deletePropietario(Long id) {
        this.propietarioRepository.deleteById(id);
    }


    private PropietarioDTO convertToDto(Propietario propietario) {
        PropietarioDTO dto = new PropietarioDTO();
        dto.setId(propietario.getId());
        dto.setApellidoPaterno(propietario.getApellidoPaterno());
        dto.setApellidoMaterno(propietario.getApellidoMaterno());
        dto.setNombre(propietario.getNombre());
        dto.setTelefono(propietario.getTelefono());
        return dto;
    }

    private Propietario convertToEntity(PropietarioDTO dto) {
        Propietario propietario = new Propietario();
        propietario.setId(dto.getId());
        propietario.setApellidoPaterno(dto.getApellidoPaterno());
        propietario.setApellidoMaterno(dto.getApellidoMaterno());
        propietario.setNombre(dto.getNombre());
        propietario.setTelefono(dto.getTelefono());
        return propietario;
    }
}
