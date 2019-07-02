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
import usal.edu.ar.dao.Interfaz.VueloDAO;
import usal.edu.ar.dao.Negocio.Vuelo;

public class VueloDAOImplFileStream implements VueloDAO{

	private File file;
	private FileInputStream fin;
	private FileOutputStream fout;
	private ObjectOutputStream oout;
	private ObjectInputStream oin;
	private String path = PropertiesUtil.getPathVuelos();
	private String fileVuelos = PropertiesUtil.getFileVulos();
	
	@Override
	public boolean addVuelo(Vuelo vuelo) throws IOException, FileNotFoundException {
		List<Vuelo> lista = this.getAll();
		lista.add(vuelo);
		this.saveAll(lista);
		return true;
	}

	@Override
	public boolean deleteVuelo(Vuelo vuelo) throws IOException, FileNotFoundException {
		List<Vuelo> lista = this.getAll();
		for(Vuelo v: lista) {
			if(v.getId() == vuelo.getId()) {
				lista.remove(v);
				this.saveAll(lista);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateVuelo(Vuelo vuelo) throws IOException, FileNotFoundException {
		List<Vuelo> lista = this.getAll();
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).getId() == vuelo.getId()) {
				lista.set(i, vuelo);
				this.saveAll(lista);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Vuelo> getAll() throws IOException, FileNotFoundException {
		file = new File(path,fileVuelos);
		if(!file.exists()) {
			file = new File(path);
			file.mkdirs();
			file = new File(path,fileVuelos);
			file.createNewFile();
			file = new File(path,fileVuelos);
			return new ArrayList<Vuelo>();
		}
		fin = new FileInputStream(file);
		oin = new ObjectInputStream(fin);
		List<Vuelo> lista = new ArrayList<>();
		try {
			lista = (ArrayList<Vuelo>) oin.readObject();
			oin.close();
			fin.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	
	private void saveAll(List<Vuelo> lista)throws IOException , FileNotFoundException {
		file = new File(path,fileVuelos);
		fout = new FileOutputStream(file,false);
		oout = new ObjectOutputStream(fout);
		oout.writeObject(lista);
		oout.close();
		fout.close();
	}

}
