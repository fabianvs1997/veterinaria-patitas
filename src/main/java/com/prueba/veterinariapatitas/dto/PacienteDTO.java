package com.prueba.veterinariapatitas.dto;



import java.util.Date;

public class PacienteDTO {

    private Long id;
    private String nombre;
    private String tipoPaciente;
    private Date fechaNacimiento;
    private Long propietarioId;
    
    
    
    
	public PacienteDTO() {
		super();
	}
	public PacienteDTO(Long id, String nombre, String tipoPaciente, Date fechaNacimiento, Long propietarioId) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipoPaciente = tipoPaciente;
		this.fechaNacimiento = fechaNacimiento;
		this.propietarioId = propietarioId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoPaciente() {
		return tipoPaciente;
	}
	public void setTipoPaciente(String tipoPaciente) {
		this.tipoPaciente = tipoPaciente;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Long getPropietarioId() {
		return propietarioId;
	}
	public void setPropietarioId(Long propietarioId) {
		this.propietarioId = propietarioId;
	}
    
    
    

}

