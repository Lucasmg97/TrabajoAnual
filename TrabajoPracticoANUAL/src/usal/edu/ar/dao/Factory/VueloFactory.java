package usal.edu.ar.dao.Factory;

import usal.edu.ar.dao.Implementacion.VueloDAOImplFileStream;
import usal.edu.ar.dao.Interfaz.VueloDAO;

public class VueloFactory {
	
	public static VueloDAO getImplementacion(String tipo) {
		if(tipo.equalsIgnoreCase("Stream")) {
			return new VueloDAOImplFileStream();
		}else {
			if(tipo.equalsIgnoreCase("Sql")) {
				return null; // Falta database implementation.
			}
		}
		return null;
	}

}
