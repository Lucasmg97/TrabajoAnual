package usal.edu.ar.dao.Interfaz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

public interface AerolineasDAO {

	Hashtable<Integer, String> readAerolineas() throws IOException, FileNotFoundException;
}
