package usal.edu.ar.dao.Interfaz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import usal.edu.ar.dao.Negocio.Cliente;

public interface ClienteDAO {

	boolean saveCliente (Cliente cliente) throws IOException, FileNotFoundException;
	boolean updateCliente (Cliente cliente) throws IOException, FileNotFoundException;
	boolean deleteCliente(Cliente cliente) throws IOException, FileNotFoundException;
	List<Cliente> getAll() throws IOException , FileNotFoundException;
	
}
