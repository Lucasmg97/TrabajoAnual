package usal.edu.ar.dao.Interfaz;

import java.sql.Connection;
import java.sql.SQLException;

import usal.edu.ar.dao.Negocio.Cliente;
import usal.edu.ar.dao.Negocio.PasajeroFrecuente;

public interface PasajeroFrecuenteDAO {
	
	boolean addPasajeroFrecuente(Cliente cliente, Connection conn)throws SQLException;
	boolean deletePasajeroFrecuente(Cliente cliente, Connection conn)throws SQLException;
	boolean updatePasajeroFrecuente(Cliente cliente, Connection conn)throws SQLException;
	PasajeroFrecuente getPasajeroFrecuente(Cliente cliente, Connection conn)throws SQLException;
	

}
