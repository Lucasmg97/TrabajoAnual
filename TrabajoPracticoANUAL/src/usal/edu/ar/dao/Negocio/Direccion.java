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
	private Provincia provincia;
	private Pais pais;
	private String codPostal;
	
	public Direccion(String calle, String altura, String ciudad, Provincia provincia, Pais pais, String codPostal) {
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
	

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", altura=" + altura + ", ciudad=" + ciudad + ", provincia=" + provincia.toString()
				+ ", pais=" + pais.toString() + ", codPostal=" + codPostal + "]";
	}


	
	

}
