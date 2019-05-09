package usal.edu.ar.dao.Interfaz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

import usal.edu.ar.dao.Negocio.Provincia;

public interface ProvinciasDAO {

	 Hashtable<Integer, String> readProvincias() throws IOException , FileNotFoundException;
	 
	
}
