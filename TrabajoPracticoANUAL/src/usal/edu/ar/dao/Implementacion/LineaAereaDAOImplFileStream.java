package usal.edu.ar.dao.Implementacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import usal.edu.ar.Util.PropertiesUtil;
import usal.edu.ar.dao.Interfaz.LineaAereaDAO;
import usal.edu.ar.dao.Negocio.LineaAerea;

public class LineaAereaDAOImplFileStream implements LineaAereaDAO{

	private File file;
	private FileInputStream fin;
	private FileOutputStream fout;
	private ObjectInputStream oin;
	private ObjectOutputStream oout;
	private String path = PropertiesUtil.getPathAerolineas();
	private String fileAerolineas = PropertiesUtil.getFileAerolineasObject();
	
	
	@Override
	public boolean addAerolinea(LineaAerea lineaAerea) throws IOException, FileNotFoundException {
		List<LineaAerea> aerolineas = this.getAll();
		aerolineas.add(lineaAerea);
		this.saveAll(aerolineas);
		return true;
	}

	@Override
	public boolean deleteAerolinea(LineaAerea lineaAerea) throws IOException, FileNotFoundException {
		List<LineaAerea> aerolineas = this.getAll();
		for(LineaAerea la : aerolineas) {
			if(la.getId() == lineaAerea.getId()) {
				aerolineas.remove(la);
				this.saveAll(aerolineas);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateAerolinea(LineaAerea lineaAerea) throws IOException, FileNotFoundException {
		List<LineaAerea> aerolineas = this.getAll();
		for(int i = 0; i<aerolineas.size(); i++) {
			if(aerolineas.get(i).getId() == lineaAerea.getId()) {
				aerolineas.set(i, lineaAerea);
				this.saveAll(aerolineas);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<LineaAerea> getAll() throws IOException, FileNotFoundException {
		file = new File(path,fileAerolineas);
		if(!file.exists()) {
			file = new File(path);
			file.mkdirs();
			file = new File(path,fileAerolineas);
			file.createNewFile();
			file = new File(path,fileAerolineas);
			return new ArrayList<LineaAerea>();
		}
		fin = new FileInputStream(file);
		oin = new ObjectInputStream(fin);
		List<LineaAerea> aerolineas = new ArrayList<>();
		try {
			aerolineas = (ArrayList<LineaAerea>) oin.readObject();
			oin.close();
			fin.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aerolineas;
	}
	
	private void saveAll(List<LineaAerea> lista) throws IOException ,FileNotFoundException{
		file = new File(path, fileAerolineas);
		fout = new FileOutputStream(file,false);
		oout = new ObjectOutputStream(fout);
		oout.writeObject(lista);
		oout.close();
		fout.close();
	}

}
