package com.prueba.veterinariapatitas.dto;


public class VeterinarioDTO {

    private Long id;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombre;
    private String cedulaProfesional;
    
    

    
	public VeterinarioDTO() {
		super();
	}
	public VeterinarioDTO(Long id, String apellidoPaterno, String apellidoMaterno, String nombre,
			String cedulaProfesional) {
		super();
		this.id = id;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombre = nombre;
		this.cedulaProfesional = cedulaProfesional;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedulaProfesional() {
		return cedulaProfesional;
	}
	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}
    
    
    


}

