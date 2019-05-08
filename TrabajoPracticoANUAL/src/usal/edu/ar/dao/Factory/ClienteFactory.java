package usal.edu.ar.dao.Factory;

import usal.edu.ar.dao.Implementacion.ClienteDAOImplFileStream;
import usal.edu.ar.dao.Interfaz.ClienteDAO;

public class ClienteFactory {

	public static ClienteDAO getImplementacion(String tipo) {
		if(tipo.equalsIgnoreCase("Stream")) {
			return new ClienteDAOImplFileStream();
		}else {
			if(tipo.equalsIgnoreCase("Sql")) {
				return null; // Falta hacer la implementacion con base de datos.
			}
		}
		return null;
	}
}
