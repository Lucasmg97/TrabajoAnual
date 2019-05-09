package usal.edu.ar.dao.Negocio;

import java.io.Serializable;

public class PasajeroFrecuente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Alianza alianza;
	private int aerolinea; //Duda de como declarar este atributo , si como objeto de lineaerea o q.
	private String numero;
	private String categoria;
	
	public PasajeroFrecuente(Alianza alianza, int aerolinea, String numero, String categoria) {
		super();
		this.alianza = alianza;
		this.aerolinea = aerolinea;
		this.numero = numero;
		this.categoria = categoria;
	}
	
	public PasajeroFrecuente() {
		
	}

	public Alianza getAlianza() {
		return alianza;
	}

	public void setAlianza(Alianza alianza) {
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
