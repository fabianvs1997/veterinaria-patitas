package com.prueba.veterinariapatitas.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CitaDTO {

    private Long id;
    private Date fechaHora;
    private Long propietarioId;
    private Long pacienteId;
    private Long veterinarioId;

}
