package usal.edu.ar.dao.Interfaz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

public interface AlianzasDAO {

	Hashtable<Integer, String> readAlianzas() throws IOException, FileNotFoundException;
}
