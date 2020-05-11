package usal.edu.ar.dao.Implementacion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import usal.edu.ar.Util.BuscadorUtil;
import usal.edu.ar.dao.Interfaz.PasaporteDAO;
import usal.edu.ar.dao.Negocio.Cliente;
import usal.edu.ar.dao.Negocio.Pasaporte;

public class PasaporteDAOImpSql implements PasaporteDAO{
	
	private String query;
	private PreparedStatement ps;
	private ResultSet rs;

	@Override
	public boolean savePasaporte(Cliente cliente, Connection conn) throws SQLException {
		query = "INSERT INTO Pasaporte values(?,?,?,?,?,?)";
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
		ps.setString(1, cliente.getPasaporte().getNumero());
		ps.setString(2, cliente.getPasaporte().getAutoridadEmision());
		ps.setDate(3,Date.valueOf( cliente.getPasaporte().getFechaEmision()));
		ps.setDate(4,Date.valueOf( cliente.getPasaporte().getFechaVencimiento()));
		ps.setInt(5, cliente.getDireccion().getPais().getId());
		ps.setInt(6, cliente.getId());
		int r = ps.executeUpdate();
		rs = ps.getGeneratedKeys();
		while(rs.next()) {
			cliente.getPasaporte().setId(rs.getInt(1));
		}
		if(r==1) {
			//conn.commit();
			return true;
		}
		rs.close();
		ps.close();
		return false;
	}

	@Override
	public boolean deletePasaporte(Cliente cliente, Connection conn) throws SQLException {
		query = "DELETE FROM Pasaporte where id_cliente=?";
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query);
		ps.setInt(1, cliente.getId());
		int r = ps.executeUpdate();
		if(r==1) {
			System.out.println("pasaporte true");
			return true;
		}
		
		ps.close();
		return false;
	}

	@Override
	public boolean updatePasaporte(Cliente cliente, Connection conn) throws SQLException {
		query = "UPDATE Pasaporte SET nro_pasaporte=?, autoridad_emision=?,	fecha_emision=?, fecha_vencimiento=?. id_pais=? where id_cliente=?";
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query);
		ps.setString(1, cliente.getPasaporte().getNumero());
		ps.setString(2, cliente.getPasaporte().getAutoridadEmision());
		ps.setDate(3, Date.valueOf(cliente.getPasaporte().getFechaEmision()));
		ps.setDate(4, Date.valueOf(cliente.getPasaporte().getFechaVencimiento()));
		ps.setInt(5, cliente.getPasaporte().getPaisEmision().getId());
		ps.setInt(6, cliente.getId());
		int r = ps.executeUpdate();
		if(r==1) {
			return true;
		}
		ps.close();
		return false;
	}

	@Override
	public Pasaporte getPasaporte(Cliente cliente, Connection conn) throws SQLException {
		query = "SELECT * FROM Pasaporte where id_cliente=?";
		Pasaporte p = new Pasaporte();
		BuscadorUtil buscador = new BuscadorUtil();
		ps = conn.prepareStatement(query);
		ps.setInt(1, cliente.getId());
		rs = ps.executeQuery();
		while(rs.next()) {
			p.setId(rs.getInt(1));
			p.setNumero(rs.getString(2));
			p.setAutoridadEmision(rs.getString(3));
			p.setFechaEmision(Date.valueOf(rs.getString(4)).toLocalDate());
			p.setFechaVencimiento(Date.valueOf(rs.getString(5)).toLocalDate());
			p.setPaisEmision(buscador.getIDPais(rs.getInt(6)));
		}
		rs.close();
		ps.close();
		return p;
	}

}
