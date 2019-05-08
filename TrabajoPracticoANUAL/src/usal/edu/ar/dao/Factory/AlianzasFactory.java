package usal.edu.ar.dao.Factory;

import usal.edu.ar.dao.Implementacion.AlianzasDAOImplFileString;
import usal.edu.ar.dao.Interfaz.AlianzasDAO;

public class AlianzasFactory {

	public static AlianzasDAO getImplementacion() {
		return new AlianzasDAOImplFileString();
	}
}
