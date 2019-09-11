package usal.edu.ar.dao.Negocio;

import java.io.Serializable;

public class Provincia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	
	public Provincia (String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Provincia(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Provincia() {
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
		return "Provincia [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
