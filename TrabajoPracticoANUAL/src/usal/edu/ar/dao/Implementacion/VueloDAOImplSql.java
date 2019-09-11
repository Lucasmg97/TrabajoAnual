package usal.edu.ar.dao.Implementacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import usal.edu.ar.Util.Conexion;
import usal.edu.ar.dao.Interfaz.VueloDAO;
import usal.edu.ar.dao.Negocio.Vuelo;

public class VueloDAOImplSql implements VueloDAO{
	
	private String query;
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection conn;

	@Override
	public boolean addVuelo(Vuelo vuelo) throws IOException, FileNotFoundException,SQLException {
		query = "INSERT INTO Vuelos values (?,?,?,?,?,?,?,?)";
		conn = Conexion.getConnection();
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query);
		ps.setString(1, vuelo.getId_vuelo());
		ps.setInt(2, vuelo.getCantidadAsientos());
		ps.setDate(3, vuelo.getFechahorasalida());
		ps.setDate(4, vuelo.getFechahorallegada());
		ps.setString(5, vuelo.getTiempovuelo());
		ps.setInt(6, vuelo.getAeropuertoSalida().getId());
		ps.setInt(7, vuelo.getAeropuertoLlegada().getId());
		ps.setInt(8, vuelo.getLineaAerea().getId());
		int r = ps.executeUpdate();
		if(r==1) {
			conn.commit();
			ps.close();
			conn.close();
			return true;
		}
		conn.rollback();
		ps.close();
		conn.close();
		return false;
	}

	@Override
	public boolean deleteVuelo(int id) throws IOException, FileNotFoundException, SQLException{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateVuelo(Vuelo vuelo) throws IOException, FileNotFoundException,SQLException{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Vuelo> getAll() throws IOException, FileNotFoundException,SQLException{
		// TODO Auto-generated method stub
		return null;
	}

}
