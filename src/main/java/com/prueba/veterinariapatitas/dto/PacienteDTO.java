package com.prueba.veterinariapatitas.dto;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PacienteDTO {

    private Long id;
    private String nombre;
    private String tipoPaciente;
    private Date fechaNacimiento;
    private Long propietarioId;

}

