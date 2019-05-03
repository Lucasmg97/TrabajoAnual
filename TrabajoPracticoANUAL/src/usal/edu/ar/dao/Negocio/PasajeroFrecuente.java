package usal.edu.ar.dao.Negocio;

import java.io.Serializable;

public class PasajeroFrecuente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int alianza;
	private int aerolinea;
	private String numero;
	private String categoria;
	
	public PasajeroFrecuente(int alianza, int aerolinea, String numero, String categoria) {
		super();
		this.alianza = alianza;
		this.aerolinea = aerolinea;
		this.numero = numero;
		this.categoria = categoria;
	}
	
	public PasajeroFrecuente() {
		
	}

	public int getAlianza() {
		return alianza;
	}

	public void setAlianza(int alianza) {
		this.alianza = alianza;
	}

	public int getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(int aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PasajeroFrecuente [alianza=" + alianza + ", aerolinea=" + aerolinea + ", numero=" + numero
				+ ", categoria=" + categoria + "]";
	}
	
	
	
}
