package usal.edu.ar.dao.Interfaz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import usal.edu.ar.dao.Negocio.LineaAerea;

public interface LineaAereaDAO {

	boolean addAerolinea(LineaAerea lineaAerea) throws IOException ,FileNotFoundException;
	boolean deleteAerolinea(int id) throws IOException , FileNotFoundException;
	boolean updateAerolinea(LineaAerea lineaAerea) throws IOException , FileNotFoundException;
	List<LineaAerea> getAll() throws IOException , FileNotFoundException;
}
