package usal.edu.ar.dao.Implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import usal.edu.ar.Util.BuscadorUtil;
import usal.edu.ar.dao.Interfaz.PasajeroFrecuenteDAO;
import usal.edu.ar.dao.Negocio.Alianza;
import usal.edu.ar.dao.Negocio.Cliente;
import usal.edu.ar.dao.Negocio.PasajeroFrecuente;

public class PasajeroFrecuenteDAOImplSql implements PasajeroFrecuenteDAO{
	
	private String query;
	private PreparedStatement ps;
	private ResultSet rs;

	@Override
	public boolean addPasajeroFrecuente(Cliente cliente, Connection conn) throws SQLException {
		query = "INSERT INTO Pasajero_frecuente values(?,?,?,?,?)";
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
		ps.setString(1, cliente.getPasajeroFrecuente().getAlianza().toString());
		ps.setString(2, cliente.getPasajeroFrecuente().getNumero());
		ps.setString(3, cliente.getPasajeroFrecuente().getCategoria());
		ps.setInt(4, cliente.getId());
		ps.setInt(5, cliente.getPasajeroFrecuente().getLineaAerea().getId());
		int r = ps.executeUpdate();
		rs = ps.getGeneratedKeys();
		while(rs.next()) {
			cliente.getPasajeroFrecuente().setId(rs.getInt(1));
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
	public boolean deletePasajeroFrecuente(Cliente cliente, Connection conn) throws SQLException {
		query = "DELETE  FROM Pasajero_frecuente where id_cliente=?";
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query);
		ps.setInt(1, cliente.getId());
		int r = ps.executeUpdate();
		if(r==1) {
			System.out.println("PF true");
			return true;
		}else {
			conn.rollback();
		}
		ps.close();
		return false;
	}

	@Override
	public boolean updatePasajeroFrecuente(Cliente cliente, Connection conn) throws SQLException {
		query = "UPDATE Pasajero_frecuente SET  alianza=?, numero=?, categoria=?, id_aerolinea=? where id_cliente=?";
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(query);
		ps.setString(1, cliente.getPasajeroFrecuente().getAlianza().toString());
		ps.setString(2, cliente.getPasajeroFrecuente().getNumero());
		ps.setString(3, cliente.getPasajeroFrecuente().getCategoria());
		ps.setInt(4, cliente.getPasajeroFrecuente().getLineaAerea().getId());
		ps.setInt(5, cliente.getId());
		int r = ps.executeUpdate();
		if(r==1) {
			return true;
		}
		ps.close();
		return false;
	}

	@Override
	public PasajeroFrecuente getPasajeroFrecuente(Cliente cliente, Connection conn) throws SQLException {
		query = "SELECT * FROM Pasajero_frecuente where id_cliente=?";
		PasajeroFrecuente pf = new PasajeroFrecuente();
		BuscadorUtil buscador = new BuscadorUtil();
		ps = conn.prepareStatement(query);
		ps.setInt(1, cliente.getId());
		rs = ps.executeQuery();
		while(rs.next()) {
			pf.setId(rs.getInt(1));
			pf.setAlianza(Alianza.valueOf(rs.getString(2)));
			pf.setNumero(rs.getString(3));
			pf.setCategoria(rs.getString(4));
			pf.setLineaAerea(buscador.getIDLineaAerea(rs.getInt(6)));
		}
		rs.close();
		ps.close();
		return pf;
	}

}
