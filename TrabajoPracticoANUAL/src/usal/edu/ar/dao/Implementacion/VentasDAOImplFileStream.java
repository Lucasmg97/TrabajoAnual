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
import usal.edu.ar.dao.Interfaz.VentasDAO;
import usal.edu.ar.dao.Negocio.Venta;

public class VentasDAOImplFileStream implements VentasDAO {
	
	private File file;
	private FileInputStream fin;
	private FileOutputStream fout;
	private ObjectInputStream oin;
	private ObjectOutputStream oout;
	private String path = PropertiesUtil.getPathVentas();
	private String fileVentas = PropertiesUtil.getFileVentas();

	@Override
	public boolean addVenta(Venta venta) throws IOException, FileNotFoundException {
		List<Venta> lista = this.getAll();
		lista.add(venta);
		this.saveAll(lista);
		return true;
	}

	@Override
	public boolean deleteVenta(Venta venta) throws IOException, FileNotFoundException {
		List<Venta> lista = this.getAll();
		for(Venta v: lista) {
			if(v.getId() == venta.getId()) {
				lista.remove(v);
				this.saveAll(lista);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateVenta(Venta venta) throws IOException, FileNotFoundException {
		List<Venta> lista = this.getAll();
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).getId() == venta.getId()) {
				lista.set(i, venta);
				this.saveAll(lista);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Venta> getAll() throws IOException, FileNotFoundException {
		file = new File(path,fileVentas);
		if(!file.exists()) {
			file = new File(path);
			file.mkdirs();
			file = new File(path,fileVentas);
			file.createNewFile();
			file = new File(path,fileVentas);
			return new ArrayList<Venta>();
		}
		fin = new FileInputStream(file);
		oin = new ObjectInputStream(fin);
		List<Venta> lista = new ArrayList<>();
		try {
			lista = (ArrayList<Venta>) oin.readObject();
			oin.close();
			fin.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
	
	private void saveAll(List<Venta> lista ) throws IOException ,FileNotFoundException{
		file = new File(path,fileVentas);
		fout = new FileOutputStream(file,false);
		oout = new ObjectOutputStream(fout);
		oout.writeObject(lista);
		oout.close();
		fout.close();
	}

}
