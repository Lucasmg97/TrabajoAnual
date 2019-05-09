package usal.edu.ar.Testing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import usal.edu.ar.Util.PropertiesUtil;
import usal.edu.ar.dao.Factory.AerolineasFactory;
import usal.edu.ar.dao.Factory.AlianzasFactory;
import usal.edu.ar.dao.Factory.ClienteFactory;
import usal.edu.ar.dao.Factory.LineaAereaFactory;
import usal.edu.ar.dao.Factory.PaisesFactory;
import usal.edu.ar.dao.Factory.ProvinciaFactory;
import usal.edu.ar.dao.Interfaz.AerolineasDAO;
import usal.edu.ar.dao.Interfaz.AlianzasDAO;
import usal.edu.ar.dao.Interfaz.ClienteDAO;
import usal.edu.ar.dao.Interfaz.LineaAereaDAO;
import usal.edu.ar.dao.Interfaz.PaisesDAO;
import usal.edu.ar.dao.Interfaz.ProvinciasDAO;
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

public class Principal {

	public static void main(String[] args) {
	 
		/*
		 * Se testea que se puedan cargar las provincias, alianzas, paises que estan alojados en un archivo de texto
		 */
		
		 /////////////////// Provincias . 
		ProvinciasDAO provString = ProvinciaFactory.getImplementacion();
//		
//		try {
//			Hashtable<Integer, String> provincias = provString.readProvincias();
//			Enumeration<String> enumeration = provincias.elements();
//			while(enumeration.hasMoreElements()) {
//				System.out.println("Provincia: "+ enumeration.nextElement());
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		/////////////////Alianzas
//		AlianzasDAO aliString = AlianzasFactory.getImplementacion();
//		Hashtable<Integer, String> alianzas = new Hashtable<>();
//		
//		try {
//			alianzas = aliString.readAlianzas();
//			for(int i=0; i<alianzas.size(); i++) {
//				System.out.println("Alianza: "+alianzas.get(i));
//			}
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		//////////////// Paises
		
//		PaisesDAO paiString = PaisesFactory.getImplementacion();
//		try {
//			Hashtable<Integer, String> paises = paiString.readPaises();
//			for(int i=0; i<paises.size(); i++) {
//				System.out.println("Paises: "+paises.get(i));
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		/////////////////////Aerolineas
//		AerolineasDAO aeroString = AerolineasFactory.getImplementacion();
//		Hashtable<Integer, String> aerolineas = new Hashtable<>();
//		try {
//			aerolineas = aeroString.readAerolineas();
//			for(int i=0; i<aerolineas.size(); i++) {
//				System.out.println("Aerolineas: "+aerolineas.get(i));
//			}
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
		
		////////////////////////////////////////////// TESTEO CLIENTES
		Date fechaemision = new Date(119,4,7);
		Date fechavencimiento = new Date(120,4,7);
		Date fechanacimiento = new Date(97,7,6);
		Pais pais = new Pais(1,"Argentina");
		Alianza alianza ;
		Provincia provincia = new Provincia(1,"BS AS");
		Pasaporte pasaporte = new Pasaporte("AOF123",pais,"Argen",fechaemision, fechavencimiento);
		PasajeroFrecuente pasajeroFrecuente = new PasajeroFrecuente(Alianza.Oneworld,2,"12","Economica");
		Direccion direccion = new Direccion("Av españa","1154","Lujan",provincia,pais,"6700");
		Telefono telefono = new Telefono("2323524566","2323123432","232305054");
		Cliente cliente = new Cliente(1,"Lucas","Martinez Gomez",40580890, pasaporte,"40580890",fechanacimiento,"Lucas.martinezgomez@usal.edu.ar",telefono , pasajeroFrecuente, direccion);
		
		ClienteDAO clienteStream = ClienteFactory.getImplementacion("Stream");
		
		// Agregar
//		try {
//			if(clienteStream.saveCliente(cliente)) {
//				System.out.println("Se guardo el cliente ");
//			}else {
//				System.out.println("No se pudo guardar");
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//Eliminar
		
//		try {
//			if(clienteStream.deleteCliente(cliente)) {
//				System.out.println("Se elimino el cliente");
//			}else {
//				System.out.println("No se pudo eliminar el cliente");
//			}
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		//Actualizar
		
		Cliente cliente2 = new Cliente(1,"Lucas","Liz",40580890, pasaporte,"40580890",fechanacimiento,"Lucas.martinezgomez@usal.edu.ar",telefono , pasajeroFrecuente, direccion);
		
//		try {
//			if(clienteStream.updateCliente(cliente2)) {
//				System.out.println("Se actualizo el cliente");
//			}else {
//				System.out.println("No se pudo actualizar el cliente");
//			}
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		//Mostrar
//		try {
//			List<Cliente> clientes = clienteStream.getAll();
//			if(clientes.isEmpty()) {
//				System.out.println("La lista de clientes esta vacia");
//			}else {
//				for(Cliente c : clientes)
//				{
//					System.out.println(c.toString());
//				}
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//////////////////////////AEROLINEAS
		List<Vuelo> vuelos = new ArrayList<>(); // Lista vacia , FALTA GENERAR VUELOS PARA AGREGARLOS.
		LineaAerea aerolinea = new LineaAerea(0,"GOL",Alianza.Skyteam,vuelos);
		LineaAereaDAO aeroStream = LineaAereaFactory.getImplementacion("Stream");
		
		//AGREGAR
//		try {
//			if(aeroStream.addAerolinea(aerolinea)) {
//				System.out.println("Se agrego una aerolinea ");
//			}else {
//				System.out.println("No se pudo agregar una aerolinea ");
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//MOSTRAR
		
//		try {
//			List<LineaAerea> aerolineas = aeroStream.getAll();
//			if(aerolineas.isEmpty()) {
//				System.out.println("No hay aerolineas cargadas");
//			}else {
//				for(LineaAerea la : aerolineas) {
//					System.out.println(la.toString());
//				}
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
			
	}

}
