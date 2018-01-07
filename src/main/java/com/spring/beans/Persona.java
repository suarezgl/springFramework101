package com.spring.beans;

public class Persona {

	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;

	
	
	public Pais getPais() {
		return pais;
	}


	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}


	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apodo=" + apodo + " Pais" + this.getPais().getNombre() + " Ciudad "+  this.getPais().getCiudades().get(0).getNombre()+" ]";
	}
	
	
}
