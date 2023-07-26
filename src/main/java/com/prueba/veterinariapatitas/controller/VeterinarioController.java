package com.prueba.veterinariapatitas.controller;


import com.prueba.veterinariapatitas.dto.VeterinarioDTO;
import com.prueba.veterinariapatitas.service.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/veterinarios")
public class VeterinarioController {

    @Autowired
    private VeterinarioService veterinarioService;

    @GetMapping
    public String showVeterinarios(Model model) {
        List<VeterinarioDTO> veterinarios = veterinarioService.getAllVeterinarios();
        model.addAttribute("veterinarios", veterinarios);
        return "manageVeterinarios";
    }

    @PostMapping("/addVeterinario")
    public String addVeterinario(VeterinarioDTO veterinarioDto) {
        veterinarioService.saveVeterinario(veterinarioDto);
        return "redirect:/veterinarios";
    }


    @GetMapping("/editVeterinario/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        VeterinarioDTO vetData = veterinarioService.getVeterinario(id);
        model.addAttribute("vet", vetData);
        return "editVeterinario";
    }

    @PostMapping("/editVeterinario/veterinarios/update/{id}")
    public String updateVeterinario(@PathVariable Long id, VeterinarioDTO updatedVeterinario) {
        VeterinarioDTO currentVet = veterinarioService.getVeterinario(id);
        if(currentVet != null){

            currentVet.setNombre(updatedVeterinario.getNombre());
            currentVet.setApellidoPaterno(updatedVeterinario.getApellidoPaterno());
            currentVet.setApellidoMaterno(updatedVeterinario.getApellidoMaterno());
            currentVet.setCedulaProfesional(updatedVeterinario.getCedulaProfesional());


            veterinarioService.saveVeterinario(currentVet);
        }
        return "redirect:/veterinarios";
    }



    @GetMapping("/deleteVeterinario/{id}")
    public String deleteVeterinario(@PathVariable Long id) {
        veterinarioService.deleteVeterinario(id);
        return "redirect:/veterinarios";
    }
}
