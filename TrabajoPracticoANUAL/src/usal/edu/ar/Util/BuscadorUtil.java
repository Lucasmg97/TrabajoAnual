package usal.edu.ar.Util;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import usal.edu.ar.dao.Interfaz.BuscadorDAO;
import usal.edu.ar.dao.Negocio.Aeropuerto;
import usal.edu.ar.dao.Negocio.Alianza;
import usal.edu.ar.dao.Negocio.LineaAerea;
import usal.edu.ar.dao.Negocio.Pais;
import usal.edu.ar.dao.Negocio.Provincia;
import usal.edu.ar.dao.Negocio.Vuelo;

public class BuscadorUtil implements BuscadorDAO{
	
	private String query;
	private ResultSet rs;
	private PreparedStatement ps;
	private Connection conn;
	
	private String PrimeraMayuscula(String aux) {
		String palabra = aux.toUpperCase().charAt(0) + aux.substring(1, aux.length()).toLowerCase();
		return palabra;
	}
	

	@Override
	public Provincia getProvincia(String prov) throws SQLException {
		conn = Conexion.getConnection();
		query = "SELECT * FROM Provincias where nombre like ?";	
		ps = conn.prepareStatement(query);
		ps.setString(1, this.PrimeraMayuscula(prov)+'%');
		rs = ps.executeQuery();
		while(rs.next()) {
			Provincia p = new Provincia(rs.getInt(1),rs.getString(2));
			ps.close();
			conn.close();
			return p;
			
		}
		ps.close();
		conn.close();
		return null;
	}

	@Override
	public Pais getPais(String pais) throws SQLException {
		conn = Conexion.getConnection();
		query = "select * from Paises where Nombre =?";
		ps = conn.prepareStatement(query);
		ps.setString(1, this.PrimeraMayuscula(pais));
		rs = ps.executeQuery();
		while(rs.next()) {
			Pais p = new Pais(rs.getInt(1),rs.getString(2));
			ps.close();
			conn.close();
			return p;
		}
		ps.close();
		conn.close();
		return null;
		
		
	}

	@Override
	public LineaAerea getAerolinea(String aerolinea) throws SQLException {
		conn = Conexion.getConnection();
		LineaAerea ln = new LineaAerea();
		query = "SELECT * FROM Aerolinea where nombre_aerolinea like ?";
		ps = conn.prepareStatement(query);
		ps.setString(1, this.PrimeraMayuscula(aerolinea));
		rs = ps.executeQuery();
		while(rs.next()) {
			ArrayList<Vuelo> vuelo = new ArrayList<>();
			ln.setId(rs.getInt(1));
			ln.setNombreAerolinea(rs.getString(2));
			ln.setAlianza(Alianza.valueOf(rs.getString(3)));
			String query2 = "SELECT * FROM Vuelos where id_aerolinea = ? ";
			PreparedStatement ps2 = conn.prepareStatement(query2);
			ps2.setInt(1, ln.getId());
			ResultSet rs2 = ps2.executeQuery();
			while(rs2.next()) {
				Vuelo v = new Vuelo();
				v.setId(rs2.getInt(1));
				v.setId_vuelo(rs2.getString(2));
				v.setCantidadAsientos(rs2.getInt(3));
				v.setFechahorasalida(rs2.getDate(4));
				v.setFechahorallegada(rs2.getDate(5));
				v.setTiempovuelo(rs2.getString(6));
				v.setAeropuertoSalida(this.getIDAeropuerto(rs2.getInt(7)));
				v.setAeropuertoLlegada(this.getIDAeropuerto(rs2.getInt(8)));
				v.setLineaAerea(this.getIDLineaAerea(rs2.getInt(9)));
				vuelo.add(v);
				ln.setVuelos(vuelo);
			}
			ps2.close();
		}
		ps.close();
		conn.close();
		return ln;
	}


	@Override
	public Aeropuerto getAeropuerto(String aeropuerto) throws SQLException {
		conn = Conexion.getConnection();
		query = "SELECT * FROM Aeropuerto where codigo_aeropuerto like ?";
		ps = conn.prepareStatement(query);
		ps.setString(1, this.PrimeraMayuscula(aeropuerto)+ '%');
		rs = ps.executeQuery();
		while(rs.next()) {
			Aeropuerto a = new Aeropuerto();
			a.setId(rs.getInt(1));
			a.setIdentificacion(rs.getString(2));
			a.setCiudad(rs.getString(3));
			a.setPais(this.getIDPais(rs.getInt(4)));
			a.setProvincia(this.getIDProvincia(rs.getInt(5)));
			ps.close();
			conn.close();
			return a;
		}
		ps.close();
		conn.close();
		return null;
	}





	@Override
	public Pais getIDPais(int id) throws SQLException {
		conn = Conexion.getConnection();
		query = "SELECT * FROM Paises where pais_id=?";
		ps = conn.prepareStatement(query);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			Pais p = new Pais();
			p.setId(rs.getInt(1));
			p.setNombre(rs.getString(2));
			ps.close();
			conn.close();
			return p;
		}
		ps.close();
		conn.close();
		return null;
	}


	@Override
	public Provincia getIDProvincia(int id) throws SQLException {
		conn = Conexion.getConnection();
		query = "SELECT * FROM Provincias where prov_id=?";
		ps = conn.prepareStatement(query);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			Provincia p = new Provincia();
			p.setId(rs.getInt(1));
			p.setNombre(rs.getString(2));
			ps.close();
			conn.close();
			return p;
		}
		ps.close();
		conn.close();
		return null;
	}


	@Override
	public Aeropuerto getIDAeropuerto(int id) throws SQLException {
		conn = Conexion.getConnection();
		query = "SELECT * FROM Aeropuerto where id_aeropuerto =?";
		ps = conn.prepareStatement(query);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			Aeropuerto a = new Aeropuerto();
			a.setId(rs.getInt(1));
			a.setIdentificacion(rs.getString(2));
			a.setCiudad(rs.getString(3));
			a.setPais(this.getIDPais(rs.getInt(4)));
			a.setProvincia(this.getIDProvincia(rs.getInt(5)));
			ps.close();
			conn.close();
			return a;
		}
		ps.close();
		conn.close();
		return null;
	}


	@Override
	public LineaAerea getIDLineaAerea(int id) throws SQLException {
		conn = Conexion.getConnection();
		LineaAerea ln = new LineaAerea();
		query = "SELECT * FROM Aerolinea where id_aerolinea = ? ";
		ps = conn.prepareStatement(query);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			ArrayList<Vuelo> vuelo = new ArrayList<>();
			ln.setId(rs.getInt(1));
			ln.setNombreAerolinea(rs.getString(2));
			ln.setAlianza(Alianza.valueOf(rs.getString(3)));
			String query2 = "SELECT * FROM Vuelos where id_aerolinea = ? ";
			PreparedStatement ps2 = conn.prepareStatement(query2);
			ps2.setInt(1, ln.getId());
			ResultSet rs2 = ps2.executeQuery();
			while(rs2.next()) {
				Vuelo v = new Vuelo();
				v.setId(rs2.getInt(1));
				v.setId_vuelo(rs2.getString(2));
				v.setCantidadAsientos(rs2.getInt(3));
				v.setFechahorasalida(rs2.getDate(4));
				v.setFechahorallegada(rs2.getDate(5));
				v.setTiempovuelo(rs2.getString(6));
				v.setAeropuertoSalida(this.getIDAeropuerto(rs2.getInt(7)));
				v.setAeropuertoLlegada(this.getIDAeropuerto(rs2.getInt(8)));
				v.setLineaAerea(this.getIDLineaAerea(rs2.getInt(9)));
				vuelo.add(v);
				ln.setVuelos(vuelo);
			}
			ps2.close();
		}
		ps.close();
		conn.close();
		return ln;
		
		
	}

}
