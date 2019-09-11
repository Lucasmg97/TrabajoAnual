package usal.edu.ar.dao.Interfaz;

import java.sql.Connection;
import java.sql.SQLException;

import usal.edu.ar.dao.Negocio.Cliente;
import usal.edu.ar.dao.Negocio.Telefono;

public interface TelefonoDAO {
	
	boolean saveTelefono(Cliente cliente, Connection conn) throws SQLException;
	boolean deleteTelefono(Cliente cliente, Connection conn) throws SQLException;
	boolean updateTelefono(Cliente cliente, Connection conn) throws SQLException;
	Telefono getTelefono(Cliente cliente, Connection conn) throws SQLException;

}
