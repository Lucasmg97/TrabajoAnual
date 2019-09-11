package usal.edu.ar.dao.Negocio;

import java.io.Serializable;
import java.time.LocalDate;

public class Pasaporte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String numero;
	private Pais paisEmision;
	private String autoridadEmision;
	private LocalDate  fechaEmision;
	private LocalDate fechaVencimiento;
	
	
	public Pasaporte(String numero, Pais paisEmision, String autoridadEmision, LocalDate fechaEmision,
			LocalDate fechaVencimiento) {
		super();
		this.numero = numero;
		this.paisEmision = paisEmision;
		this.autoridadEmision = autoridadEmision;
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
	}

	public Pasaporte(int id,String numero, Pais paisEmision, String autoridadEmision, LocalDate fechaEmision,
			LocalDate fechaVencimiento) {
		super();
		this.id = id;
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

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
