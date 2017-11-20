package com.spring.beans;

public class Persona {

	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	
	
	public Persona(int id, String nombre, String apodo) {
		this.id = id;
		this.nombre = nombre;
		this.apodo = apodo;
	}
	
	
	public Persona(int id){
		this.id = id;
	}
	
	public Pais pais() {
		
		return pais;
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

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apodo=" + apodo +" ]";
	}
	
	
}
