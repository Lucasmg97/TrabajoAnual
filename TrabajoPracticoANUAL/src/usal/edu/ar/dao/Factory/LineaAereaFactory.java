package usal.edu.ar.dao.Factory;

import usal.edu.ar.dao.Implementacion.LineaAereaDAOImplFileStream;
import usal.edu.ar.dao.Interfaz.LineaAereaDAO;

public class LineaAereaFactory {
	
	public static LineaAereaDAO getImplementacion(String tipo) {
		if(tipo.equalsIgnoreCase("Stream")) {
			return new LineaAereaDAOImplFileStream();
		}else {
			if(tipo.equalsIgnoreCase("SQL")) {
				return null; // Falta implementacion con database.
			}
		}
		return null;
	}

}
