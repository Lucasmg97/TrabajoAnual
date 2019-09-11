package usal.edu.ar.dao.Implementacion;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;

import usal.edu.ar.Util.Conexion;
import usal.edu.ar.dao.Interfaz.PaisesDAO;

public class PaisesDAOImplSql implements PaisesDAO {
	
	private Connection conn;
	private PreparedStatement ps;
	private String query;

	@Override
	public Hashtable<Integer, String> readPaises() throws IOException, FileNotFoundException {
		Hashtable<Integer, String> paises = new Hashtable<>();
		query = "SELECT * FROM Paises";
		conn = Conexion.getConnection();
		
		try {
			ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				paises.put(rs.getInt(1), rs.getString(2));
			}
			ps.close();
			rs.close();
			conn.close();
			return paises;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
