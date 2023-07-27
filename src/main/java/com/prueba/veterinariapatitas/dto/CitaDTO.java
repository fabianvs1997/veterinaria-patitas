package com.prueba.veterinariapatitas.dto;



import java.util.Date;


public class CitaDTO {

    private Long id;
    private Date fechaHora;
    private Long propietarioId;
    private Long pacienteId;
    private Long veterinarioId;
	public CitaDTO() {
		super();
	}
	
	
	public CitaDTO(Long id, Date fechaHora, Long propietarioId, Long pacienteId, Long veterinarioId) {
		super();
		this.id = id;
		this.fechaHora = fechaHora;
		this.propietarioId = propietarioId;
		this.pacienteId = pacienteId;
		this.veterinarioId = veterinarioId;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	public Long getPropietarioId() {
		return propietarioId;
	}
	public void setPropietarioId(Long propietarioId) {
		this.propietarioId = propietarioId;
	}
	public Long getPacienteId() {
		return pacienteId;
	}
	public void setPacienteId(Long pacienteId) {
		this.pacienteId = pacienteId;
	}
	public Long getVeterinarioId() {
		return veterinarioId;
	}
	public void setVeterinarioId(Long veterinarioId) {
		this.veterinarioId = veterinarioId;
	}
    
    
    

}
