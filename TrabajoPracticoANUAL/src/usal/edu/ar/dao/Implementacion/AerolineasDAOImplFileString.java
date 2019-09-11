package usal.edu.ar.dao.Implementacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

import usal.edu.ar.Util.PropertiesUtil;
import usal.edu.ar.dao.Interfaz.AerolineasDAO;
import usal.edu.ar.dao.Negocio.LineaAerea;

public class AerolineasDAOImplFileString implements AerolineasDAO{

	private File file;
	private Scanner sc;
	@Override
	public Hashtable<Integer, String> readAerolineas() throws IOException, FileNotFoundException {
		file = new File(PropertiesUtil.getPathGeneral(),PropertiesUtil.getFileAerolineas());
		sc = new Scanner(file);
		Hashtable<Integer, String> aerolineas = new Hashtable<>();
		if(file.canRead()) {
			while(sc.hasNextLine()) {
				String[] aux = sc.nextLine().split(";");
				aerolineas.put(Integer.valueOf(aux[0]), aux[1]);
				
			}
		}
		sc.close();
		return aerolineas;
	}
	@Override
	public boolean addLineaAerea(LineaAerea lineaAerea) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean updateLineaAerea(LineaAerea lineaAerea) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteLineaAerea(LineaAerea lineaAerea) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<LineaAerea> getAllLineaAerea() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
