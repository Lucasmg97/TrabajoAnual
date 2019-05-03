package usal.edu.ar.dao.Negocio;

import java.io.Serializable;

public class Direccion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String calle;
	private String altura;
	private String ciudad;
	private int provincia;
	private int pais;
	private String codPostal;
	
	public Direccion(String calle, String altura, String ciudad, int provincia, int pais, String codPostal) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
		this.codPostal = codPostal;
	}

	public Direccion() {
		super();
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", altura=" + altura + ", ciudad=" + ciudad + ", provincia=" + provincia
				+ ", pais=" + pais + ", codPostal=" + codPostal + "]";
	}
	
	

}
