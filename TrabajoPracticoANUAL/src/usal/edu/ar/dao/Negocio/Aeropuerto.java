package usal.edu.ar.dao.Negocio;

import java.io.Serializable;

public class Aeropuerto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String identificacion;
	private String ciudad;
	private int provincia;
	private int pais;
	
	public Aeropuerto(String identificacion, int cantidadAsientos, String ciudad, int provincia, int pais) {
		super();
		this.identificacion = identificacion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
	}
	
	public Aeropuerto() {
		
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getProvincia() {
		return provincia;
	}

	public void setProvincia(int provincia) {
		this.provincia = provincia;
	}

	public int getPais() {
		return pais;
	}

	public void setPais(int pais) {
		this.pais = pais;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Aeropuerto [identificacion=" + identificacion  + ", ciudad="
				+ ciudad + ", provincia=" + provincia + ", pais=" + pais + "]";
	}
	
	
	
}
