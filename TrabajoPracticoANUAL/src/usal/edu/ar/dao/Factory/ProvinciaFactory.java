package usal.edu.ar.dao.Factory;

import usal.edu.ar.dao.Implementacion.ProvinciasDAOImplFileString;
import usal.edu.ar.dao.Interfaz.ProvinciasDAO;

public class ProvinciaFactory {
	
	public static ProvinciasDAO getImplementacion() {
		return new ProvinciasDAOImplFileString();
	}

}
