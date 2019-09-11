package usal.edu.ar.dao.Interfaz;

import java.sql.Connection;
import java.sql.SQLException;

import usal.edu.ar.dao.Negocio.Cliente;
import usal.edu.ar.dao.Negocio.Pasaporte;

public interface PasaporteDAO {
	
	boolean savePasaporte(Cliente cliente, Connection conn) throws SQLException;
	boolean deletePasaporte(Cliente cliente, Connection conn) throws SQLException;
	boolean updatePasaporte(Cliente cliente, Connection conn) throws SQLException;
	Pasaporte getPasaporte(Cliente cliente, Connection conn) throws SQLException;

}
