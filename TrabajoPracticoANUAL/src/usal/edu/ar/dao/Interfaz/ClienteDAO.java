package usal.edu.ar.dao.Interfaz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import usal.edu.ar.dao.Negocio.Cliente;

public interface ClienteDAO {

	boolean saveCliente (Cliente cliente, Connection conn) throws IOException, FileNotFoundException, SQLException;
	boolean updateCliente (Cliente cliente, Connection conn) throws IOException, FileNotFoundException, SQLException;
	boolean deleteCliente(int id, Connection conn) throws IOException, FileNotFoundException, SQLException;
	List<Cliente> getAll(Connection conn) throws IOException , FileNotFoundException, SQLException;
	boolean commitCliente(Connection conn) throws SQLException;
	boolean rollbackClinete(Connection conn);
	
}
