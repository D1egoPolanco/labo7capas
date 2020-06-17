package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="estudiante")
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_usuario")
	private Integer codigo;
	
	@Column(name="nombre")
	@NotEmpty
	@Size(message = "El nombre debe tener maximo 50 caracteres", max = 50)
		private String nombre;
	
	@Column(name="apellido")
	@NotEmpty
	@Size(message = "El apellido debe tener maximo 50 caracteres", max = 50)
		private String apellido;
	
	@Column(name="carne")
	@NotEmpty
	@Pattern(regexp = "^[0-9]{8}$", message = "El carne debe tener exactamente 8 digitos")
	
	private String carne;
	
	@Column(name="carrera")
	@NotEmpty
	@Size(message = "La carrera debe tener maximo 100 caracteres", max = 100)
	
	private String carrera;


	public Estudiante() {
		
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCarne() {
		return carne;
	}


	public void setCarne(String carne) {
		this.carne = carne;
	}


	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}