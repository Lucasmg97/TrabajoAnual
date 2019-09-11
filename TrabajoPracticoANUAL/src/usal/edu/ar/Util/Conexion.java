package usal.edu.ar.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName(PropertiesUtil.getDriver());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = PropertiesUtil.getUrl()+PropertiesUtil.getIP()+PropertiesUtil.getPuerto()+PropertiesUtil.getBase();
		try {
			conn = DriverManager.getConnection(url,PropertiesUtil.getUser(),PropertiesUtil.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}


}
