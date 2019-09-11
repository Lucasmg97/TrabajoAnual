package usal.edu.ar.dao.Factory;

import usal.edu.ar.dao.Implementacion.AlianzasDAOImplFileString;
import usal.edu.ar.dao.Interfaz.AlianzasDAO;

public class AlianzasFactory {

	public static AlianzasDAO getImplementacion(String dato) {
		if(dato.equalsIgnoreCase("String")) {
			return new AlianzasDAOImplFileString();
		}else if (dato.equalsIgnoreCase("sql")) {
			return null; // Falta sql.
		}
		
		return null;
	}
}
