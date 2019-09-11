package usal.edu.ar.dao.Factory;

import usal.edu.ar.dao.Implementacion.ClienteDAOImplFileStream;
import usal.edu.ar.dao.Implementacion.ClienteDAOImplSql;
import usal.edu.ar.dao.Interfaz.ClienteDAO;

public class ClienteFactory {

	public static ClienteDAO getImplementacion(String tipo) {
		if(tipo.equalsIgnoreCase("Stream")) {
			return new ClienteDAOImplFileStream();
		}else {
			if(tipo.equalsIgnoreCase("Sql")) {
				return new ClienteDAOImplSql();
			}
		}
		return null;
	}
}
