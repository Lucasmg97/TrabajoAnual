package usal.edu.ar.dao.Factory;

import usal.edu.ar.dao.Implementacion.VentasDAOImplFileStream;
import usal.edu.ar.dao.Interfaz.VentasDAO;

public class VentasFactory {
	
	public static VentasDAO getImplementacion(String tipo) {
		if(tipo.equalsIgnoreCase( "Stream")) {
			return new VentasDAOImplFileStream();
		}else {
			if(tipo.equalsIgnoreCase("SQL")) {
				return null; // FALTA IMPLEMENTAICON DATABASE
			}
		}
		return null;
	}

}
