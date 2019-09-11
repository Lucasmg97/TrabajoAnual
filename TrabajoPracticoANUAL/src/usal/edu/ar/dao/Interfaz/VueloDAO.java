package usal.edu.ar.dao.Interfaz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import usal.edu.ar.dao.Negocio.Vuelo;

public interface VueloDAO {

	boolean addVuelo(Vuelo vuelo) throws IOException ,FileNotFoundException,SQLException;
	boolean deleteVuelo(int id) throws IOException , FileNotFoundException,SQLException;
	boolean updateVuelo(Vuelo vuelo) throws IOException , FileNotFoundException,SQLException;
	List<Vuelo> getAll() throws IOException , FileNotFoundException,SQLException;
}
