package usal.edu.ar.dao.Implementacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import usal.edu.ar.Util.BuscadorUtil;
import usal.edu.ar.Util.Conexion;
import usal.edu.ar.dao.Interfaz.AerolineasDAO;
import usal.edu.ar.dao.Negocio.Alianza;
import usal.edu.ar.dao.Negocio.LineaAerea;
import usal.edu.ar.dao.Negocio.Vuelo;

public class AerolineasImplSql implements AerolineasDAO{
	
	private Connection conn;
	private PreparedStatement ps;
	private String query;
	private BuscadorUtil buscador;

	@Override
	public Hashtable<Integer, String> readAerolineas() throws IOException, FileNotFoundException {
		Hashtable<Integer, String> aerolineas = new Hashtable<>();
		query = "select * from Aerolineas";
		conn = Conexion.getConnection();
		try {
			ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				aerolineas.put(rs.getInt(1), rs.getString(2));
			}
			ps.close();
			rs.close();
			conn.close();
			return aerolineas;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addLineaAerea(LineaAerea lineaAerea) throws SQLException {
		conn = Conexion.getConnection();
		conn.setAutoCommit(false);
		query = "INSERT INTO Aerolinea VALUES (?,?)";
		ps = conn.prepareStatement(query);
		ps.setString(1, lineaAerea.getNombreAerolinea());
		ps.setString(2, lineaAerea.getAlianza().toString());
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
	public boolean updateLineaAerea(LineaAerea lineaAerea) throws SQLException {
		query = "UPDATE Aerolinea SET nombre_aerolinea=? , alianza=? where id_aerolinea =?";
		conn =  Conexion.getConnection();
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query);
		ps.setString(1, lineaAerea.getNombreAerolinea());
		ps.setString(2, lineaAerea.getAlianza().toString());
		ps.setInt(3, lineaAerea.getId());
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
	public boolean deleteLineaAerea(LineaAerea lineaAerea) throws SQLException {
		query = "DELETE FROM Aerolinea where id_aerolinea=?";
		conn = Conexion.getConnection();
		ps = conn.prepareStatement(query);
		ps.setInt(1, lineaAerea.getId());
		int r = ps.executeUpdate();
		if(r ==1) {
			ps.close();
			conn.close();
			return true;
		}
		ps.close();
		conn.close();
		return false;
	}

	@Override
	public List<LineaAerea> getAllLineaAerea() throws SQLException {
		List<LineaAerea> ln = new ArrayList<>();
		conn = Conexion.getConnection();
		query = "SELECT * FROM Aerolinea";
		ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			ArrayList<Vuelo> v = new ArrayList<>();
			LineaAerea l = new LineaAerea();
			l.setId(rs.getInt(1));
			l.setNombreAerolinea(rs.getString(2));
			l.setAlianza(Alianza.valueOf(rs.getString(3)));
			String query2 = "SELECT * FROM Vuelos where id_aerolinea=?";
			PreparedStatement ps2 = conn.prepareStatement(query2);
			ps2.setInt(1, l.getId());
			ResultSet rs2 = ps2.executeQuery();
			while(rs2.next()) {
				Vuelo v1 = new Vuelo();
				v1.setId(rs2.getInt(1));
				v1.setId_vuelo(rs2.getString(2));
				v1.setCantidadAsientos(rs2.getInt(3));
				v1.setFechahorasalida(rs2.getDate(4));
				v1.setFechahorallegada(rs2.getDate(5));
				v1.setTiempovuelo(rs2.getString(6));
				v1.setAeropuertoSalida(buscador.getIDAeropuerto(rs2.getInt(7)));
				v1.setAeropuertoLlegada(buscador.getIDAeropuerto(rs2.getInt(8)));
				v1.setLineaAerea(buscador.getIDLineaAerea(rs2.getInt(9)));
				v.add(v1);
				l.setVuelos(v);
			}
			ps2.close();
			rs2.close();
			ln.add(l);
		}
		ps.close();
		rs.close();
		conn.close();
		return ln;
	}
	
	

}
