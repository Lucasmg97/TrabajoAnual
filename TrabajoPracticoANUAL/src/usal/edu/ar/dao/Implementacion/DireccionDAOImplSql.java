package usal.edu.ar.dao.Implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import usal.edu.ar.Util.BuscadorUtil;
import usal.edu.ar.dao.Interfaz.DireccionDAO;
import usal.edu.ar.dao.Negocio.Cliente;
import usal.edu.ar.dao.Negocio.Direccion;

public class DireccionDAOImplSql implements DireccionDAO{
	
	private String query;
	private PreparedStatement ps;
	private ResultSet rs;

	@Override
	public boolean saveDireccion(Cliente cliente, Connection conn) throws SQLException {
		query = "INSERT INTO Direccion values(?,?,?,?,?,?)";
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
		ps.setString(1, cliente.getDireccion().getCalle());
		ps.setString(2, cliente.getDireccion().getAltura());
		ps.setString(3, cliente.getDireccion().getCiudad());
		ps.setInt(4, cliente.getDireccion().getPais().getId());
		ps.setInt(5, cliente.getDireccion().getProvincia().getId());
		ps.setInt(6, cliente.getId());
		int r = ps.executeUpdate();
		rs = ps.getGeneratedKeys();
		while(rs.next()) {
			cliente.getDireccion().setId(rs.getInt(1));
		}
		if(r==1) {
		//	conn.commit();
			return true;
		}
		ps.close();
		
		return false;
	}

	@Override
	public boolean deleteDireccion(Cliente cliente, Connection conn) throws SQLException {
		query = "DELETE * FROM Direccion where id_cliente=?";
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query);
		ps.setInt(1, cliente.getId());
		int r = ps.executeUpdate();
		if(r ==1) {
			return true;
		}else {
			conn.rollback();
		}
		ps.close();
		return false;
	}

	@Override
	public boolean updateDireccion(Cliente cliente, Connection conn) throws SQLException {
		query = "UPDATE Direccion SET calle=?, altura=?, ciudad=?, id_pais=?, id_provincia=? where id_cliente=? ";
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query);
		ps.setString(1, cliente.getDireccion().getCalle());
		ps.setString(2, cliente.getDireccion().getAltura());
		ps.setString(3, cliente.getDireccion().getCiudad());
		ps.setInt(4, cliente.getDireccion().getPais().getId());
		ps.setInt(5, cliente.getDireccion().getProvincia().getId());
		ps.setInt(6, cliente.getId());
		int r = ps.executeUpdate();
		if(r==1) {
			return true;
		}
		ps.close();
		return false;
	}

	@Override
	public Direccion getDireccion(Cliente cliente, Connection conn) throws SQLException {
		query = "SELECT * FROM Direccion where id_cliente=?";
		Direccion d = new Direccion();
		BuscadorUtil buscador = new BuscadorUtil();
		ps = conn.prepareStatement(query);
		ps.setInt(1, cliente.getId());
		rs = ps.executeQuery();
		while(rs.next()) {
			d.setId(rs.getInt(1));
			d.setCalle(rs.getString(2));
			d.setAltura(rs.getString(3));
			d.setCiudad(rs.getString(4));
			d.setPais(buscador.getIDPais(rs.getInt(5)));
			d.setProvincia(buscador.getIDProvincia(rs.getInt(6)));
		}
		rs.close();
		ps.close();
		return d;
	}

}
