package usal.edu.ar.dao.Negocio;

import java.io.Serializable;

public class PasajeroFrecuente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Alianza alianza;
	private LineaAerea lineaAerea;
	private String numero;
	private String categoria;
	
	
	public PasajeroFrecuente(Alianza alianza, LineaAerea lineaAerea, String numero, String categoria) {
		super();
		this.alianza = alianza;
		this.lineaAerea = lineaAerea;
		this.numero = numero;
		this.categoria = categoria;
	}

	public PasajeroFrecuente(int id,Alianza alianza, LineaAerea lineaAerea, String numero, String categoria) {
		super();
		this.id = id;
		this.alianza = alianza;
		this.lineaAerea = lineaAerea;
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

	public LineaAerea getLineaAerea() {
		return lineaAerea;
	}

	public void setLineaAerea(LineaAerea lineaAerea) {
		this.lineaAerea = lineaAerea;
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
		return "PasajeroFrecuente [alianza=" + alianza + ", aerolinea=" + lineaAerea.toString() + ", numero=" + numero
				+ ", categoria=" + categoria + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
