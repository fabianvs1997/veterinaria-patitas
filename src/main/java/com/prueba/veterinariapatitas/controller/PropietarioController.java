package com.prueba.veterinariapatitas.controller;

import com.prueba.veterinariapatitas.dto.PropietarioDTO;
import com.prueba.veterinariapatitas.service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/propietarios")
public class PropietarioController {

    @Autowired
    private PropietarioService propietarioService;


    @GetMapping
    public String showPropietarios(Model model) {
        model.addAttribute("propietarios",propietarioService.getAllPropietarios());
        return "managePropietarios";
    }

    @PostMapping("/addPropietario")
    public String addPropietario(PropietarioDTO propietarioDTO) {
        propietarioService.savePropietario(propietarioDTO);
        return "redirect:/propietarios";
    }

    @GetMapping("/editPropietario/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        PropietarioDTO propietarioDTO = propietarioService.getPropietario(id);
        model.addAttribute("propietario", propietarioDTO);
        return "editPropietario";
    }

    @PostMapping("/editPropietario/propietarios/updatePropietario/{id}")
    public String updatePropietario(@PathVariable Long id, PropietarioDTO updatedPropietario) {
        PropietarioDTO currentPropietario = propietarioService.getPropietario(id);
        if(currentPropietario != null){

            currentPropietario.setNombre(updatedPropietario.getNombre());
            currentPropietario.setId(updatedPropietario.getId());
            currentPropietario.setApellidoPaterno(updatedPropietario.getApellidoPaterno());
            currentPropietario.setApellidoMaterno(updatedPropietario.getApellidoMaterno());
            currentPropietario.setTelefono(updatedPropietario.getTelefono());

            propietarioService.savePropietario(currentPropietario);
        }
        return "redirect:/propietarios";
    }

    @GetMapping("/deletePropietario/{id}")
    public String deletePropietario(@PathVariable Long id) {
        propietarioService.deletePropietario(id);
        return "redirect:/propietarios";
    }
}
