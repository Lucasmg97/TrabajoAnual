package usal.edu.ar.dao.Factory;

import usal.edu.ar.dao.Implementacion.AerolineasDAOImplFileString;
import usal.edu.ar.dao.Implementacion.AerolineasImplSql;
import usal.edu.ar.dao.Interfaz.AerolineasDAO;

public class AerolineasFactory {
	
	public static AerolineasDAO getImplementacion(String dato) {
		if(dato.equalsIgnoreCase("String")){
			return new AerolineasDAOImplFileString();
		}else if(dato.equalsIgnoreCase("sql")) {
			return new AerolineasImplSql();
		}
		return null;
	}
}
