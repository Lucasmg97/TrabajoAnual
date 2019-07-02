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
import usal.edu.ar.dao.Interfaz.ClienteDAO;
import usal.edu.ar.dao.Negocio.Cliente;

public class ClienteDAOImplFileStream implements ClienteDAO{
	
	private File file;
	private FileInputStream fin;
	private FileOutputStream fout;
	private ObjectInputStream oin;
	private ObjectOutputStream oout;
	private String path = PropertiesUtil.getPathClientes();
	private String nameFile = PropertiesUtil.getFileClientes();

	@Override
	public boolean saveCliente(Cliente cliente) throws IOException, FileNotFoundException {
		List<Cliente> lista = this.getAll();
		lista.add(cliente);
		this.saveAll(lista);	
		return true;
	}

	@Override
	public boolean updateCliente(Cliente cliente) throws IOException, FileNotFoundException {
		List<Cliente> lista = this.getAll();
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).getDni() == cliente.getDni()) {
				lista.set(i, cliente);
				this.saveAll(lista);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteCliente(int id) throws IOException, FileNotFoundException {
		List<Cliente> lista = this.getAll();
		for(Cliente c : lista) {
			if(c.getId() == id) {
				lista.remove(c);
				this.saveAll(lista);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Cliente> getAll() throws IOException, FileNotFoundException {
		file = new File(path,nameFile);
		if(!file.exists()) {
			file = new File(path);
			file.mkdirs();
			file = new File(path,nameFile);
			file.createNewFile();
			file = new File(path,nameFile);
			return new ArrayList<Cliente>();
		}
		fin = new FileInputStream(file);
		oin = new ObjectInputStream(fin);
		List<Cliente> lista = new ArrayList<>();
		try {
			lista = (ArrayList<Cliente>) oin.readObject();
			oin.close();
			fin.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	
	private void saveAll(List<Cliente> lista) throws IOException, FileNotFoundException{
		file = new File(path,nameFile);
		fout = new FileOutputStream(file,false);
		oout = new ObjectOutputStream(fout);
		oout.writeObject(lista);
		oout.close();
		fout.close();
	}

}
