package usal.edu.ar.dao.Implementacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

import usal.edu.ar.Util.PropertiesUtil;
import usal.edu.ar.dao.Interfaz.AlianzasDAO;

public class AlianzasDAOImplFileString implements AlianzasDAO{

	private File file;
	private Scanner sc;
	
	@Override
	public Hashtable<Integer, String> readAlianzas() throws IOException, FileNotFoundException {
		file = new File(PropertiesUtil.getPathGeneral(), PropertiesUtil.getFileAlianzas());
		sc = new Scanner(file);
		Hashtable<Integer, String> alianzas = new Hashtable<>();
		if(file.canRead()) {
			while(sc.hasNextLine()) {
				String [] aux = sc.nextLine().split(";");
				alianzas.put(Integer.valueOf(aux[0]), aux[1]);
			}
		}
		sc.close();
		return alianzas;
	}

}
