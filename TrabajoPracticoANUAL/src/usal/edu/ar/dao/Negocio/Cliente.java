package usal.edu.ar.dao.Negocio;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String apellido;
	private int dni;
	private Pasaporte pasaporte;
	private String cuitcuil;
	private Date fechanacimiento;
	private String email;
	private Telefono telefono;
	private PasajeroFrecuente pasajeroFrecuente;
	private Direccion direccion;
	
	public Cliente(int id,String nombre, String apellido, int dni, Pasaporte pasaporte, String cuitcuil, Date fechanacimiento,
			String email, Telefono telefono, PasajeroFrecuente pasajeroFrecuente, Direccion direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.pasaporte = pasaporte;
		this.cuitcuil = cuitcuil;
		this.fechanacimiento = fechanacimiento;
		this.email = email;
		this.telefono = telefono;
		this.pasajeroFrecuente = pasajeroFrecuente;
		this.direccion = direccion;
	}

	public Cliente() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Pasaporte getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}

	public String getCuitcuil() {
		return cuitcuil;
	}

	public void setCuitcuil(String cuitcuil) {
		this.cuitcuil = cuitcuil;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public PasajeroFrecuente getPasajeroFrecuente() {
		return pasajeroFrecuente;
	}

	public void setPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) {
		this.pasajeroFrecuente = pasajeroFrecuente;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", pasaporte=" + pasaporte.toString()
				+ ", cuitcuil=" + cuitcuil + ", fechanacimiento=" + fechanacimiento + ", email=" + email + ", telefono="
				+ telefono.toString() + ", pasajeroFrecuente=" + pasajeroFrecuente.toString() + ", direccion=" + direccion.toString() + "]";
	}
	
	
	
}
