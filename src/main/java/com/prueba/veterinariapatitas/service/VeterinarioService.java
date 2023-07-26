package com.prueba.veterinariapatitas.service;


import com.prueba.veterinariapatitas.dto.VeterinarioDTO;

import java.util.List;

public interface VeterinarioService {

    VeterinarioDTO saveVeterinario(VeterinarioDTO veterinario);
    VeterinarioDTO getVeterinario(Long id);
    List<VeterinarioDTO> getAllVeterinarios();
    void deleteVeterinario(Long id);
}
