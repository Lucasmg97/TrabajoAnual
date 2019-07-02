package usal.edu.ar.dao.Interfaz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import usal.edu.ar.dao.Negocio.Vuelo;

public interface VueloDAO {

	boolean addVuelo(Vuelo vuelo) throws IOException ,FileNotFoundException;
	boolean deleteVuelo(int id) throws IOException , FileNotFoundException;
	boolean updateVuelo(Vuelo vuelo) throws IOException , FileNotFoundException;
	List<Vuelo> getAll() throws IOException , FileNotFoundException;
}
