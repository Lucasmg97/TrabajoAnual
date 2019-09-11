package usal.edu.ar.dao.Negocio;

import java.io.Serializable;

public class Telefono implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String numeroPersonal;
	private String numeroCelular;
	private String numeroLaboral;
	
	public Telefono(String numeroPersonal, String numeroCelular, String numeroLaboral) {
		super();
		this.numeroPersonal = numeroPersonal;
		this.numeroCelular = numeroCelular;
		this.numeroLaboral = numeroLaboral;
	}
	
	public Telefono() {
	}

	public String getNumeroPersonal() {
		return numeroPersonal;
	}

	public void setNumeroPersonal(String numeroPersonal) {
		this.numeroPersonal = numeroPersonal;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getNumeroLaboral() {
		return numeroLaboral;
	}

	public void setNumeroLaboral(String numeroLaboral) {
		this.numeroLaboral = numeroLaboral;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Telefono [numeroPersonal=" + numeroPersonal + ", numeroCelular=" + numeroCelular + ", numeroLaboral="
				+ numeroLaboral + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
