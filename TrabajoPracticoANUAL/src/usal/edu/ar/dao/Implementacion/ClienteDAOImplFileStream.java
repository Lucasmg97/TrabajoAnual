package usal.edu.ar.dao.Implementacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import usal.edu.ar.Util.Conexion;
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
	public boolean saveCliente(Cliente cliente,Connection conn) throws IOException, FileNotFoundException, SQLException {
		List<Cliente> lista = this.getAll(conn);
		lista.add(cliente);
		this.saveAll(lista);	
		return true;
	}

	@Override
	public boolean updateCliente(Cliente cliente, Connection conn) throws IOException, FileNotFoundException, SQLException {
		List<Cliente> lista = this.getAll(conn);
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).getDni() == cliente.getDni()) {
				lista.set(i, cliente);
				this.saveAll(lista);
				return true;
			}
		}
		return false;
	}

	public boolean deleteCliente(int id, Connection conn) throws IOException, FileNotFoundException , SQLException{
		List<Cliente> lista = this.getAll(conn);
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
	public List<Cliente> getAll(Connection conn) throws IOException, FileNotFoundException, SQLException {
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

	@Override
	public boolean commitCliente(Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rollbackClinete(Connection conn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCliente(Cliente cliente, Connection conn)
			throws IOException, FileNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}



}
