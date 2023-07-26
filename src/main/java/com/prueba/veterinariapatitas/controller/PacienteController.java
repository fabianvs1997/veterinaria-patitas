package com.prueba.veterinariapatitas.controller;

import com.prueba.veterinariapatitas.dto.PacienteDTO;
import com.prueba.veterinariapatitas.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/paciente")
public class PacienteController {


    @Autowired
    private PacienteService pacienteService;


    @GetMapping
    public String showPacientes(Model model) {
        List<PacienteDTO> pacientes=this.pacienteService.getAllPacientes();
        model.addAttribute("pacientes",pacientes);
        return "managePacientes";
    }

    @PostMapping("/addPaciente")
    public String addPaciente(PacienteDTO pacienteDTO) {
        pacienteService.savePaciente(pacienteDTO);
        return "redirect:/paciente";
    }

    @GetMapping("/editPaciente/{id}")
    public String showEditForm(Long id, Model model) {
        PacienteDTO pacienteDTO = pacienteService.getPaciente(id);
        model.addAttribute("paciente", pacienteDTO);
        return "editPaciente";
    }

    @PostMapping("/editPaciente/paciente/update/{id}")
    public String updatePaciente(Long id, PacienteDTO updatedPaciente) {
        PacienteDTO currentPaciente = pacienteService.getPaciente(id);
        if(currentPaciente != null){

            currentPaciente.setNombre(updatedPaciente.getNombre());
            currentPaciente.setId(updatedPaciente.getId());
            currentPaciente.setTipoPaciente(updatedPaciente.getTipoPaciente());
            currentPaciente.setFechaNacimiento(updatedPaciente.getFechaNacimiento());
            currentPaciente.setPropietarioId(updatedPaciente.getPropietarioId());

            pacienteService.savePaciente(currentPaciente);
        }
        return "redirect:/paciente";
    }

    @GetMapping("/deletePaciente/{id}")
    public String deletePaciente(Long id) {
        pacienteService.deletePaciente(id);
        return "redirect:/paciente";
    }
}
