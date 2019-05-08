package usal.edu.ar.dao.Interfaz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

public interface PaisesDAO {

	Hashtable<Integer, String> readPaises() throws IOException , FileNotFoundException;
}
