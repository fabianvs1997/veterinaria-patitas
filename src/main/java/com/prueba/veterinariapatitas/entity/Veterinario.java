package com.prueba.veterinariapatitas.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Veterinario")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Veterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombre;
    private String cedulaProfesional;


}
