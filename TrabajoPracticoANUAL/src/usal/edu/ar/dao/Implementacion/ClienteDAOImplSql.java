package usal.edu.ar.dao.Implementacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import usal.edu.ar.dao.Interfaz.ClienteDAO;
import usal.edu.ar.dao.Negocio.Cliente;

public class ClienteDAOImplSql implements ClienteDAO{
	
	private PreparedStatement ps;
	private ResultSet rs;
	private String query;
	
	@Override
	public boolean saveCliente(Cliente cliente,Connection conn) throws IOException, FileNotFoundException, SQLException {
		query = "insert into Cliente values (?,?,?,?,?,?)";
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query, java.sql.Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, cliente.getNombre());
		ps.setString(2, cliente.getApellido());
		ps.setInt(3, cliente.getDni());
		ps.setString(4,cliente.getCuitcuil());
		ps.setDate(5, Date.valueOf(cliente.getFechanacimiento()));
		ps.setString(6, cliente.getEmail());
		int r = ps.executeUpdate();
		rs = ps.getGeneratedKeys();
		while(rs.next()) {
			cliente.setId(rs.getInt(1));
		}
		if(r==1) {
				return true;
		}
		ps.close();

		return false;
	}
	 
	@Override
	public boolean updateCliente(Cliente cliente, Connection conn) throws IOException, FileNotFoundException, SQLException {
		query = "UPDATE Cliente SET nombre=?, apellido=?, cuit_cuil=?, fecha_nacimiento=?, email=? where dni=? ";
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query);
		ps.setString(1, cliente.getNombre());
		ps.setString(2, cliente.getApellido());
		ps.setString(3, cliente.getCuitcuil());
		ps.setDate(4, Date.valueOf(cliente.getFechanacimiento()));
		ps.setString(5, cliente.getEmail());
		ps.setInt(6, cliente.getDni());
		int r = ps.executeUpdate();
		if(r==1) {
			return true;
		}
		ps.close();
		return false;
	}
	@Override
	public boolean deleteCliente(Cliente cliente, Connection conn) throws IOException, FileNotFoundException, SQLException {
		query = "DELETE FROM Cliente where id_cliente=?";
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query);
		ps.setInt(1, cliente.getId());
		int r = ps.executeUpdate();
		if(r==1) {
			System.out.println("cliente true ");
			return true;
		}
		ps.close();
		return false;
	}
	@Override
	public List<Cliente> getAll(Connection conn) throws IOException, FileNotFoundException, SQLException {
		List<Cliente> lista = new ArrayList<>();
		query = "SELECT * FROM Cliente";
		ps = conn.prepareStatement(query);
		rs = ps.executeQuery();
		while(rs.next()) {
			Cliente c = new Cliente();
			c.setId(rs.getInt(1));
			c.setNombre(rs.getString(2));
			c.setApellido(rs.getString(3));
			c.setDni(rs.getInt(4));
			c.setCuitcuil(rs.getString(5));
			c.setFechanacimiento(Date.valueOf(rs.getString(6)).toLocalDate());
			c.setEmail(rs.getString(7));
			lista.add(c);
		}
		ps.close();
		return lista;
	}

	@Override
	public boolean commitCliente(Connection conn) throws SQLException {
		conn.commit();
		conn.close();
		return true;
	}

	@Override
	public boolean rollbackClinete(Connection conn){
		try {
			conn.rollback();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	
	

}
