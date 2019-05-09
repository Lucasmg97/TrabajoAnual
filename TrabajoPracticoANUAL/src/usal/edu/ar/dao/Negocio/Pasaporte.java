package usal.edu.ar.dao.Negocio;

import java.io.Serializable;
import java.util.Date;

public class Pasaporte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numero;
	private Pais paisEmision;
	private String autoridadEmision;
	private Date  fechaEmision;
	private Date fechaVencimiento;
	
	public Pasaporte(String numero, Pais paisEmision, String autoridadEmision, Date fechaEmision,
			Date fechaVencimiento) {
		super();
		this.numero = numero;
		this.paisEmision = paisEmision;
		this.autoridadEmision = autoridadEmision;
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public Pasaporte() {
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Pais getPaisEmision() {
		return paisEmision;
	}

	public void setPaisEmision(Pais paisEmision) {
		this.paisEmision = paisEmision;
	}

	public String getAutoridadEmision() {
		return autoridadEmision;
	}

	public void setAutoridadEmision(String autoridadEmision) {
		this.autoridadEmision = autoridadEmision;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Pasaporte [numero=" + numero + ", paisEmision=" + paisEmision.toString() + ", autoridadEmision=" + autoridadEmision
				+ ", fechaEmision=" + fechaEmision + ", fechaVencimiento=" + fechaVencimiento + "]";
	}
	
	

}
