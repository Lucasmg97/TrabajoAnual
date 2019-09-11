package usal.edu.ar.dao.Interfaz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import usal.edu.ar.dao.Negocio.Aeropuerto;
import usal.edu.ar.dao.Negocio.LineaAerea;
import usal.edu.ar.dao.Negocio.Pais;
import usal.edu.ar.dao.Negocio.Provincia;

public interface BuscadorDAO {
	
	Provincia getProvincia(String prov) throws SQLException;
	Pais getPais(String pais) throws SQLException, FileNotFoundException, IOException;
	LineaAerea getAerolinea(String aerolinea) throws SQLException;
	Aeropuerto getAeropuerto(String aeropuerto) throws SQLException;
	
	Pais getIDPais(int id) throws SQLException;
	Provincia getIDProvincia(int id) throws SQLException;
	Aeropuerto getIDAeropuerto(int id) throws SQLException;
	LineaAerea getIDLineaAerea(int id) throws SQLException;
	

}
