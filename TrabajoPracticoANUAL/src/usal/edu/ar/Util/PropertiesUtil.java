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
}
	
