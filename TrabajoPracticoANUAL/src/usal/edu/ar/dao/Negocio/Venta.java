package usal.edu.ar.dao.Negocio;

import java.io.Serializable;
import java.util.Date;

public class Venta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Cliente cliente;
	private Vuelo vuelo;
	private LineaAerea lineaAerea;
	private Date fechahoraventa;
	private String formapago;
	private int cuotas;
	private String total;
	
	public Venta(int id, Cliente cliente, Vuelo vuelo, LineaAerea lineaAerea, Date fechahoraventa, String formapago,
			int cuotas, String total) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.vuelo = vuelo;
		this.lineaAerea = lineaAerea;
		this.fechahoraventa = fechahoraventa;
		this.formapago = formapago;
		this.cuotas = cuotas;
		this.total = total;
	}

	public Venta() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public LineaAerea getLineaAerea() {
		return lineaAerea;
	}

	public void setLineaAerea(LineaAerea lineaAerea) {
		this.lineaAerea = lineaAerea;
	}

	public Date getFechahoraventa() {
		return fechahoraventa;
	}

	public void setFechahoraventa(Date fechahoraventa) {
		this.fechahoraventa = fechahoraventa;
	}

	public String getFormapago() {
		return formapago;
	}

	public void setFormapago(String formapago) {
		this.formapago = formapago;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cliente=" + cliente + ", vuelo=" + vuelo + ", lineaAerea=" + lineaAerea
				+ ", fechahoraventa=" + fechahoraventa + ", formapago=" + formapago + ", cuotas=" + cuotas + ", total="
				+ total + "]";
	}
	
	

}
