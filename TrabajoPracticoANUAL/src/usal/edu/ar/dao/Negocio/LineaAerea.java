package usal.edu.ar.dao.Negocio;

import java.io.Serializable;
import java.util.List;

public class LineaAerea implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombreAerolinea;
	private Alianza alianza;
	private List<Vuelo> vuelos;
	
	public LineaAerea(String nombreAerolinea, Alianza alianza, List<Vuelo> vuelos) {
		super();
		this.nombreAerolinea = nombreAerolinea;
		this.alianza = alianza;
		this.vuelos = vuelos;
	}

	public LineaAerea(int id, String nombreAerolinea, Alianza alianza, List<Vuelo> vuelos) {
		super();
		this.id = id;
		this.nombreAerolinea = nombreAerolinea;
		this.alianza = alianza;
		this.vuelos = vuelos;
	}
	
	public LineaAerea() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreAerolinea() {
		return nombreAerolinea;
	}

	public void setNombreAerolinea(String nombreAerolinea) {
		this.nombreAerolinea = nombreAerolinea;
	}

	public Alianza getAlianza() {
		return alianza;
	}

	public void setAlianza(Alianza alianza) {
		this.alianza = alianza;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "LineaAerea [id=" + id + ", nombreAerolinea=" + nombreAerolinea + ", alianza=" + alianza + ", vuelos="
				+ vuelos + "]";
	}
	
	
	
}
