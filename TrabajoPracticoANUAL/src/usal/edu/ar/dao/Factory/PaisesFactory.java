package usal.edu.ar.dao.Factory;

import usal.edu.ar.dao.Implementacion.PaisesDAOImplFileString;
import usal.edu.ar.dao.Implementacion.PaisesDAOImplSql;
import usal.edu.ar.dao.Interfaz.PaisesDAO;

public class PaisesFactory {

	public static PaisesDAO getImplementacion(String dato) {
		if(dato.equalsIgnoreCase("string")) {
			return new PaisesDAOImplFileString();
		}else if(dato.equalsIgnoreCase("sql")) {
			return new PaisesDAOImplSql();
		}
		return null;
	}
}
