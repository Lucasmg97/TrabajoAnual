package usal.edu.ar.dao.Interfaz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import usal.edu.ar.dao.Negocio.Venta;

public interface VentasDAO {
	
	boolean addVenta(Venta venta) throws IOException , FileNotFoundException;
	boolean deleteVenta(int id) throws IOException ,FileNotFoundException;
	boolean updateVenta(Venta venta) throws IOException ,FileNotFoundException;
	List<Venta> getAll() throws IOException , FileNotFoundException;
	
}
