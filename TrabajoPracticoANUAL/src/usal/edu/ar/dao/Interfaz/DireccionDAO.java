package usal.edu.ar.dao.Interfaz;

import java.sql.Connection;
import java.sql.SQLException;

import usal.edu.ar.dao.Negocio.Cliente;
import usal.edu.ar.dao.Negocio.Direccion;

public interface DireccionDAO {
	
	boolean saveDireccion(Cliente cliente, Connection conn) throws SQLException;
	boolean deleteDireccion(Cliente cliente, Connection conn)throws SQLException;
	boolean updateDireccion(Cliente cliente, Connection conn)throws SQLException;
	Direccion getDireccion(Cliente cliente, Connection conn)throws SQLException;

}
