package usal.edu.ar.dao.Interfaz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;

import usal.edu.ar.dao.Negocio.LineaAerea;

public interface AerolineasDAO {

	Hashtable<Integer, String> readAerolineas() throws IOException, FileNotFoundException;
	boolean addLineaAerea(LineaAerea lineaAerea) throws SQLException;
	boolean updateLineaAerea(LineaAerea lineaAerea) throws SQLException;
	boolean deleteLineaAerea(LineaAerea lineaAerea) throws SQLException;
	List<LineaAerea> getAllLineaAerea() throws SQLException;
}
