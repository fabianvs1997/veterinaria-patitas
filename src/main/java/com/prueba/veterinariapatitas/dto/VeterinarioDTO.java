package com.prueba.veterinariapatitas.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VeterinarioDTO {

    private Long id;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombre;
    private String cedulaProfesional;


}

