package usal.edu.ar.dao.Factory;

import usal.edu.ar.dao.Implementacion.PaisesDAOImplFileString;
import usal.edu.ar.dao.Interfaz.PaisesDAO;

public class PaisesFactory {

	public static PaisesDAO getImplementacion() {
		return new PaisesDAOImplFileString();
	}
}
