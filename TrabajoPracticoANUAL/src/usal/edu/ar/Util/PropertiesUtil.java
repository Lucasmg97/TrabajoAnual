package usal.edu.ar.Util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	private static Properties config = loadProperties();
	
	private static Properties loadProperties() {
		config = new Properties();
		
		try {
			config.load(new FileReader("config.properties")); //DAO
			//config.load(ClassLoader.getSystemResourceAsStream("config.properties"));// MVC 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return config;
	}
	
	public static String getPathGeneral() {
		return config.getProperty("pathGeneral");
	}
	
	public static String getFilePaises() {
		return config.getProperty("filePaises");
	}
	
	public static String getFileProvincias() {
		return config.getProperty("fileProvincias");
	}
	
	public static String getFileAlianzas() {
		return config.getProperty("fileAlianzas");
	}
	
	public static String getPathClientes() {
		return config.getProperty("pathClientes");
	}
	public static String getFileClientes() {
		return config.getProperty("fileClientes");
	}
	public static String getFileAerolineas() {
		return config.getProperty("fileAerolineas");
	}
	
	public static String getPathAerolineas() {
		return config.getProperty("pathLineaAerea");
	}
	public static String getFileAerolineasObject() {
		return config.getProperty("fileLineaAerea");
	}
	
	public static String getPathVuelos() {
		return config.getProperty("pathVuelos");
	}
	public static String getFileVulos() {
		return config.getProperty("fileVuelos");
	}
	public static String getPathVentas() {
		return config.getProperty("pathVentas");
	}
	public static String getFileVentas() {
		return config.getProperty("fileVentas");
	}
	
	// Base de datos
	
	public static String getDriver() {
		return config.getProperty("driver");
	}
	public static String getUrl() {
		return config.getProperty("url");
	}
	
	public static String getIP() {
		return config.getProperty("ip");
	}
	
	public static String getPuerto() {
		return config.getProperty("puerto");
	}
	
	public static String getBase() {
		return config.getProperty("base");
	}
	
	public static String getUser() {
		return config.getProperty("user");
	}
	
	public static String getPassword() {
		return config.getProperty("password");
	}
}
	
