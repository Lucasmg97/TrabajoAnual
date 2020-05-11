package usal.edu.ar.Testing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import usal.edu.ar.Util.BuscadorUtil;
import usal.edu.ar.Util.Conexion;
import usal.edu.ar.dao.Factory.AerolineasFactory;
import usal.edu.ar.dao.Factory.ClienteFactory;
import usal.edu.ar.dao.Implementacion.DireccionDAOImplSql;
import usal.edu.ar.dao.Implementacion.PasajeroFrecuenteDAOImplSql;
import usal.edu.ar.dao.Implementacion.PasaporteDAOImpSql;
import usal.edu.ar.dao.Implementacion.TelefonoDAOImplSql;
import usal.edu.ar.dao.Interfaz.AerolineasDAO;
import usal.edu.ar.dao.Interfaz.ClienteDAO;
import usal.edu.ar.dao.Interfaz.DireccionDAO;
import usal.edu.ar.dao.Interfaz.PasajeroFrecuenteDAO;
import usal.edu.ar.dao.Interfaz.PasaporteDAO;
import usal.edu.ar.dao.Interfaz.TelefonoDAO;
import usal.edu.ar.dao.Negocio.Aeropuerto;
import usal.edu.ar.dao.Negocio.Alianza;
import usal.edu.ar.dao.Negocio.Cliente;
import usal.edu.ar.dao.Negocio.Direccion;
import usal.edu.ar.dao.Negocio.LineaAerea;
import usal.edu.ar.dao.Negocio.Pais;
import usal.edu.ar.dao.Negocio.PasajeroFrecuente;
import usal.edu.ar.dao.Negocio.Pasaporte;
import usal.edu.ar.dao.Negocio.Provincia;
import usal.edu.ar.dao.Negocio.Telefono;
import usal.edu.ar.dao.Negocio.Vuelo;

public class PrincipalSQL {
	public static void main(String[] args) {
		
				//CONEXION//
		Connection conn = Conexion.getConnection();
		
		
		
		BuscadorUtil buscador = new BuscadorUtil();
//		LineaAerea ln1 = new LineaAerea("Avianca",Alianza.StarAlliance,null);
		AerolineasDAO aeroImple = AerolineasFactory.getImplementacion("SQL");
//		try {
//			if(aeroImple.addLineaAerea(ln1)) {
//				System.out.println("Se agrego la linea aerea a la base ");
//			}else {
//				System.out.println("No se pudo agreger , Rollback.");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			LineaAerea linea = buscador.getAerolinea("gol");
//			if(aeroImple.deleteLineaAerea(linea)){
//				System.out.println("Se elimino la Aerolinea");
//			}else {
//				System.out.println("No se pudo eliminar la aerolinea");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			List<LineaAerea> lista = aeroImple.getAllLineaAerea();
//			if(lista.isEmpty()) {
//				System.out.println("No hay elementos en la lista");
//			}else {
//				for(LineaAerea l : lista) {
//					System.out.println(l.toString());
//				}
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		///////////////////////CLIENTES/////////////////////////
	
		LocalDate fechaemision = LocalDate.of(2019, 9, 21);
		LocalDate fechavencimiento = LocalDate.of(2019, 10, 21);
		LocalDate fechanacimiento = LocalDate.of(1997, 8, 6);
		Pais pais = null;
		Provincia provincia = null;
		LineaAerea ln = null;
		try {
			pais = buscador.getPais("Argentina");
			provincia = buscador.getProvincia("Buenos Aires");
			ln = buscador.getAerolinea("Aerolineas Argentinas");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Vuelo> vuelos = new ArrayList<>();
		Pasaporte pasaporte = new Pasaporte("AOF123",pais,"Argen",fechaemision, fechavencimiento);
		PasajeroFrecuente pasajeroFrecuente = new PasajeroFrecuente(ln.getAlianza(),ln,"20","Economica");
		Direccion direccion = new Direccion("Av España","1154","Lujan",provincia,pais,"6700");
		Telefono telefono = new Telefono("2323524566","2323123432","232305054");
		Cliente cliente = new Cliente("Jose","Martinez Gomez",24010441, pasaporte,"40580890",fechanacimiento,"Jose.martinezgomez@usal.edu.ar",telefono , pasajeroFrecuente, direccion);
		
		ClienteDAO clienteImple = ClienteFactory.getImplementacion("SQL");
		PasaporteDAO pasaImple = new PasaporteDAOImpSql();
		TelefonoDAO teleImple = new TelefonoDAOImplSql();
		PasajeroFrecuenteDAO pasaFreImple = new PasajeroFrecuenteDAOImplSql();
		DireccionDAO direImple = new DireccionDAOImplSql();
		
//		try {	
//			if(clienteImple.saveCliente(cliente, conn)&&pasaImple.savePasaporte(cliente, conn) && teleImple.saveTelefono(cliente, conn)
//					&& pasaFreImple.addPasajeroFrecuente(cliente, conn) && direImple.saveDireccion(cliente, conn)) {
//				clienteImple.commitCliente(conn);
//				System.out.println("Se pudo guardar el cliente");
//			}else {
//				clienteImple.rollbackClinete(conn);
//				System.out.println("No se pudo guardar el cliente.");
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			clienteImple.rollbackClinete(conn);
//			System.out.println(e.getMessage());
//			System.out.println("SE HZO EL ROLLBACK");
//			
//			e.printStackTrace();
//		}
//		
//		try {
//			conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

	
		
		
//		
//		try {
//			if(clienteImple.deleteCliente(cliente, conn)) {
//				clienteImple.commitCliente(conn);
//				System.out.println("Se elimino el cliente.");
//			}else {
//				System.out.println("No se pudo eliminar el cliente. ");
//			}
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (SQLException e1) {
//			clienteImple.rollbackClinete(conn);
//			System.out.println("Se ejecuto el rollback. ");
//			e1.printStackTrace();
//		}
		
		Cliente cliente1 = new Cliente();
		try {
			cliente1 = buscador.getClienteByDNI(40580890, conn);
			if(pasaFreImple.deletePasajeroFrecuente(cliente1, conn) & direImple.deleteDireccion(cliente1, conn) & teleImple.deleteTelefono(cliente1, conn) & pasaImple.deletePasaporte(cliente1, conn)) {
				if(clienteImple.deleteCliente(cliente1, conn)) {
					clienteImple.commitCliente(conn);
					System.out.println("Se elimino el cliente. ");
				}
			}
		} catch (SQLException | IOException e) {
			clienteImple.rollbackClinete(conn);
			System.out.println("Se ejecuto el rollback.");
			e.printStackTrace();
		}
		
//		try {
//			List<Cliente> clientes = clienteImple.getAll(conn);
//			List<Cliente> lista = new ArrayList<>();
//			if(clientes.isEmpty()) {
//				System.out.println("No hay clientes en la base");
//			}else {
//				for(int i=0; i<clientes.size(); i++) {
//					PasajeroFrecuente pf = pasaFreImple.getPasajeroFrecuente(clientes.get(i), conn);
//					Telefono t = teleImple.getTelefono(clientes.get(i), conn);
//					Pasaporte p = pasaImple.getPasaporte(clientes.get(i), conn);
//					Direccion d = direImple.getDireccion(clientes.get(i), conn);
//					clientes.get(i).setPasajeroFrecuente(pf);
//					clientes.get(i).setTelefono(t);
//					clientes.get(i).setPasaporte(p);
//					clientes.get(i).setDireccion(d);
//					Cliente c = new Cliente();
//					c = clientes.get(i);
//					lista.add(c);
//					System.out.println(c.toString());
//				}
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		

	}

}
