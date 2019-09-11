package usal.edu.ar.dao.Implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import usal.edu.ar.dao.Interfaz.TelefonoDAO;
import usal.edu.ar.dao.Negocio.Cliente;
import usal.edu.ar.dao.Negocio.Telefono;

public class TelefonoDAOImplSql implements TelefonoDAO {
	
	private String query;
	private PreparedStatement ps;
	private ResultSet rs;

	@Override
	public boolean saveTelefono(Cliente cliente, Connection conn) throws SQLException {
		query = "Insert into Telefono values (?,?,?,?)";
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		ps.setInt(1, cliente.getId());
		ps.setString(2, cliente.getTelefono().getNumeroPersonal());
		ps.setString(3, cliente.getTelefono().getNumeroCelular());
		ps.setString(4, cliente.getTelefono().getNumeroLaboral());
		int r = ps.executeUpdate();
		rs = ps.getGeneratedKeys();
		while(rs.next()) {
			cliente.getTelefono().setId(rs.getInt(1));
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
	public boolean deleteTelefono(Cliente cliente, Connection conn) throws SQLException {
		query = "DELETE * FROM Telefono where id_Cliente=?";
		
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(query);
			ps.setInt(1, cliente.getId());
			int r = ps.executeUpdate();
			
			if(r==1) {
				return true;
			}else {
				conn.rollback();
			}
		return false;
	}

	@Override
	public boolean updateTelefono(Cliente cliente, Connection conn) throws SQLException {
		query = "UPDATE Telefono SET personal=?, celular=?, laboral=? where id_Cliente=?";
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query);
		ps.setString(1, cliente.getTelefono().getNumeroPersonal());
		ps.setString(2, cliente.getTelefono().getNumeroCelular());
		ps.setString(3, cliente.getTelefono().getNumeroLaboral());
		ps.setInt(4, cliente.getId());
		int r = ps.executeUpdate();
		if(r==1) {
			return true;
		}
		ps.close();
		return false;
	}

	@Override
	public Telefono getTelefono(Cliente cliente, Connection conn) throws SQLException {
		query = "SELECT * FROM Telefono where id_Cliente=?";
		Telefono t = new Telefono();
		ps = conn.prepareStatement(query);
		ps.setInt(1, cliente.getId());
		rs = ps.executeQuery();
		while(rs.next()) {
			t.setId(rs.getInt(1));
			t.setNumeroPersonal(rs.getString(3));
			t.setNumeroCelular(rs.getString(4));
			t.setNumeroLaboral(rs.getString(5));
		}
		rs.close();
		ps.close();
		return t;
	}

}
