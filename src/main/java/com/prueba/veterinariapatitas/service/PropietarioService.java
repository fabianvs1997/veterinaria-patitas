package com.prueba.veterinariapatitas.service;

import com.prueba.veterinariapatitas.dto.PropietarioDTO;

import java.util.List;

public interface PropietarioService {
    PropietarioDTO savePropietario(PropietarioDTO propietario);
    PropietarioDTO getPropietario(Long id);
    List<PropietarioDTO> getAllPropietarios();
    void deletePropietario(Long id);
}
