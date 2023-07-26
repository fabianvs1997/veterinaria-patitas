package com.prueba.veterinariapatitas.controller;

import com.prueba.veterinariapatitas.dto.CitaDTO;
import com.prueba.veterinariapatitas.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/citas")
public class CitaController {


    @Autowired
    private CitaService citaService;

    @GetMapping
    public String showCitas(Model model) {
        model.addAttribute("citas",citaService.getAllCitas());
        return "manageCitas";
    }

    @PostMapping("/addCita")
    public String addCita(CitaDTO citaDTO) {
        citaService.saveCita(citaDTO);
        return "redirect:/citas";
    }

    @GetMapping("/editCita/{id}")
    public String showEditForm(Long id, Model model) {
        CitaDTO citaDTO = citaService.getCita(id);
        model.addAttribute("cita", citaDTO);
        return "editCita";
    }

    @PostMapping("/editCita/cita/update/{id}")
    public String updateCita(Long id, CitaDTO updateCita){
        CitaDTO currentCita = citaService.getCita(id);

        if (currentCita != null) {
            currentCita.setId(updateCita.getId());
            currentCita.setFechaHora(updateCita.getFechaHora());
            currentCita.setPropietarioId(updateCita.getPropietarioId());
            currentCita.setPacienteId(updateCita.getPacienteId());
            currentCita.setVeterinarioId(updateCita.getVeterinarioId());

            citaService.saveCita(currentCita);
        }
        return "redirect:/citas";
    }

    @GetMapping("/deleteCita/{id}")
    public String deleteCita(Long id) {
        citaService.deleteCita(id);
        return "redirect:/citas";
    }
}
