package usal.edu.ar.dao.Interfaz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

public interface ProvinciasDAO {

	 Hashtable<Integer, String> readProvincias() throws IOException , FileNotFoundException;
	
}
