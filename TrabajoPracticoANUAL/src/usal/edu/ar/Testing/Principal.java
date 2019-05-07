package usal.edu.ar.Testing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

import usal.edu.ar.Util.PropertiesUtil;
import usal.edu.ar.dao.Factory.ProvinciaFactory;
import usal.edu.ar.dao.Interfaz.ProvinciasDAO;

public class Principal {

	public static void main(String[] args) {
		 // Provincias . 
		/*
		 * Se testea que se puedan cargar las provincias que estan alojadas en un archivo de texto
		 */
		
		ProvinciasDAO provString = ProvinciaFactory.getImplementacion();
		
		try {
			Hashtable<Integer, String> provincias = provString.readProvincias();
			Enumeration<String> enumeration = provincias.elements();
			while(enumeration.hasMoreElements()) {
				System.out.println("Provincia: "+ enumeration.nextElement());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
