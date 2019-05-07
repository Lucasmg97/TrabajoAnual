package usal.edu.ar.dao.Implementacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

import usal.edu.ar.Util.PropertiesUtil;
import usal.edu.ar.dao.Interfaz.ProvinciasDAO;

public class ProvinciasDAOImplFileString implements ProvinciasDAO{
	
	private File file;
	private Scanner sc;

	@Override
	public Hashtable<Integer, String> readProvincias() throws IOException, FileNotFoundException {
		file = new File(PropertiesUtil.getPathGeneral(), PropertiesUtil.getFileProvincias());
		sc = new Scanner(file);
		Hashtable<Integer, String> hash = new Hashtable<>();
		if(file.canRead()) {
			int i =0;
			while(sc.hasNextLine()) {
				String [] aux = sc.nextLine().split(";");
				hash.put(Integer.valueOf(aux[i]), aux[i+1]);
				i ++;
			}
			
		}
		return hash;
	}

}
