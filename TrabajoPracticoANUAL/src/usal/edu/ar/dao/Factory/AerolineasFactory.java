package usal.edu.ar.dao.Factory;

import usal.edu.ar.dao.Implementacion.AerolineasDAOImplFileString;
import usal.edu.ar.dao.Interfaz.AerolineasDAO;

public class AerolineasFactory {
	
	public static AerolineasDAO getImplementacion() {
		return new AerolineasDAOImplFileString();
	}
}
