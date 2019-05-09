package usal.edu.ar.dao.Negocio;

import java.io.Serializable;

public class Pais implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	
	public Pais(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Pais() {
		
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + "]";
	}
	
	

}
