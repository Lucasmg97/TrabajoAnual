package usal.edu.ar.dao.Negocio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Vuelo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String id_vuelo;
	private LineaAerea lineaAerea;
	private int cantidadAsientos;
	private Aeropuerto aeropuertoSalida;
	private Aeropuerto aeropuertoLlegada;
	private Date fechahorasalida;
	private Date fechahorallegada;
	private String tiempovuelo; // Hay que ver como se manipula el tiempo de vuelo , para sumarselo al aeropuerto de llegada  y saber cuando llega.
	private List<Cliente> clientes;
	
	public Vuelo() {
		
	}

	public Vuelo(int id,String id_vuelo, LineaAerea lineaAerea, int cantidadAsientos, Aeropuerto aeropuertoSalida,
			Aeropuerto aeropuertoLlegada, Date fechahorasalida, Date fechahorallegada, String tiempovuelo,
			List<Cliente> clientes) {
		super();
		this.id = id;
		this.id_vuelo = id_vuelo;
		this.lineaAerea = lineaAerea;
		this.cantidadAsientos = cantidadAsientos;
		this.aeropuertoSalida = aeropuertoSalida;
		this.aeropuertoLlegada = aeropuertoLlegada;
		this.fechahorasalida = fechahorasalida;
		this.fechahorallegada = fechahorallegada;
		this.tiempovuelo = tiempovuelo;
		this.clientes = clientes;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getId_vuelo() {
		return id_vuelo;
	}

	public void setId_vuelo(String id_vuelo) {
		this.id_vuelo = id_vuelo;
	}

	public LineaAerea getLineaAerea() {
		return lineaAerea;
	}

	public void setLineaAerea(LineaAerea lineaAerea) {
		this.lineaAerea = lineaAerea;
	}

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}

	public Aeropuerto getAeropuertoSalida() {
		return aeropuertoSalida;
	}

	public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
		this.aeropuertoSalida = aeropuertoSalida;
	}

	public Aeropuerto getAeropuertoLlegada() {
		return aeropuertoLlegada;
	}

	public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
		this.aeropuertoLlegada = aeropuertoLlegada;
	}

	public Date getFechahorasalida() {
		return fechahorasalida;
	}

	public void setFechahorasalida(Date fechahorasalida) {
		this.fechahorasalida = fechahorasalida;
	}

	public Date getFechahorallegada() {
		return fechahorallegada;
	}

	public void setFechahorallegada(Date fechahorallegada) {
		this.fechahorallegada = fechahorallegada;
	}

	public String getTiempovuelo() {
		return tiempovuelo;
	}

	public void setTiempovuelo(String tiempovuelo) {
		this.tiempovuelo = tiempovuelo;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//Falta manipular la lista de clientes para el ToString.
	@Override
	public String toString() {
		return "Vuelo [id_vuelo=" + id_vuelo + ", lineaAerea=" + lineaAerea.toString() + ", cantidadAsientos=" + cantidadAsientos
				+ ", aeropuertoSalida=" + aeropuertoSalida.toString() + ", aeropuertoLlegada=" + aeropuertoLlegada.toString()
				+ ", fechahorasalida=" + fechahorasalida + ", fechahorallegada=" + fechahorallegada + ", tiempovuelo="
				+ tiempovuelo + ", clientes=" + clientes + "]";
	}


	
	
	
	
	

}
