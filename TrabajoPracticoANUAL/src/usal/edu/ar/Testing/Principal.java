package usal.edu.ar.Testing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import javax.swing.JOptionPane;

import usal.edu.ar.Util.BuscadorUtil;
import usal.edu.ar.Util.Conexion;
import usal.edu.ar.Util.PropertiesUtil;
import usal.edu.ar.dao.Factory.AerolineasFactory;
import usal.edu.ar.dao.Factory.AlianzasFactory;
import usal.edu.ar.dao.Factory.ClienteFactory;
import usal.edu.ar.dao.Factory.LineaAereaFactory;
import usal.edu.ar.dao.Factory.PaisesFactory;
import usal.edu.ar.dao.Factory.ProvinciaFactory;
import usal.edu.ar.dao.Factory.VentasFactory;
import usal.edu.ar.dao.Factory.VueloFactory;
import usal.edu.ar.dao.Interfaz.AerolineasDAO;
import usal.edu.ar.dao.Interfaz.AlianzasDAO;
import usal.edu.ar.dao.Interfaz.ClienteDAO;
import usal.edu.ar.dao.Interfaz.LineaAereaDAO;
import usal.edu.ar.dao.Interfaz.PaisesDAO;
import usal.edu.ar.dao.Interfaz.ProvinciasDAO;
import usal.edu.ar.dao.Interfaz.VentasDAO;
import usal.edu.ar.dao.Interfaz.VueloDAO;
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
import usal.edu.ar.dao.Negocio.Venta;
import usal.edu.ar.dao.Negocio.Vuelo;

public class Principal {

	public static void main(String[] args) {
		
		//TESTING BUSCADOR -> REVISAR COMO TRAER DE LA BD CON EL METODO READ DE PAISES QUE LO TRAE COMO HASH.
		
		BuscadorUtil buscador = new BuscadorUtil();
//		String p = JOptionPane.showInputDialog("Ingrese Pais ");
//		try {
//			Pais pais1 = buscador.getPais(p);
//			System.out.println(pais1.toString());
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
//		String nombre = JOptionPane.showInputDialog("Ingrese Aerolinea");
//		LineaAerea ln;
//		try {
//			ln = buscador.getAerolinea(nombre);
//			System.out.println(ln.toString());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		String provinciaNombre = JOptionPane.showInputDialog("Ingrese provincia :");
//		try {
//			Provincia provincia1 = buscador.getProvincia(provinciaNombre);
//			System.out.println(provincia1.toString());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		/*
		 * TEST CONEXION A BASE DE DATOS
		 */
		
//		Connection conn = Conexion.getConnection();
//		try {
//			if(!conn.isClosed()) {
//				System.out.println("Conexion establecida");
//				conn.close();
//				System.out.println("Conexion cerrada");
//			}else {
//				System.out.println("No se pudo establecer la conexion");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		///// TESTEO TRAYENDO AEROLINEAS DESDE LA BASE DE DATOS. 
		
//		AerolineasDAO aeroSql = AerolineasFactory.getImplementacion("sql");
//		try {
//			Hashtable<Integer, String> aerolineas = aeroSql.readAerolineas();
//			for(int i=1; i<aerolineas.size(); i++) {
//				System.out.println(aerolineas.get(i));
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		//////////////TESTEO TRAYENDO PAISES DESDE LA BASE DE DATOS. 
//			PaisesDAO paisesSql = PaisesFactory.getImplementacion("sql");
//		try {
//			Hashtable<Integer, String> paises = paisesSql.readPaises();
//			for(int i=1; i<paises.size(); i++) {
//				System.out.println(paises.get(i));
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	 
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
	
		
		LocalDate fechaemision = LocalDate.of(2019, 8, 21);
		LocalDate fechavencimiento = LocalDate.of(2019, 9, 21);
		LocalDate fechanacimiento = LocalDate.of(1997, 7, 6);
		Pais pais = new Pais(1,"Argentina");
		List<Vuelo> vuelos = new ArrayList<>();
		LineaAerea lineaAerea = new LineaAerea(1,"Aerolineas Argentinas",Alianza.Oneworld,vuelos);
		Alianza alianza ;
		Provincia provincia = new Provincia(1,"BS AS");
		Pasaporte pasaporte = new Pasaporte(1,"AOF123",pais,"Argen",fechaemision, fechavencimiento);
		PasajeroFrecuente pasajeroFrecuente = new PasajeroFrecuente(1,Alianza.Oneworld,lineaAerea,"12","Economica");
		Direccion direccion = new Direccion("Av espa�a","1154","Lujan",provincia,pais,"6700");
		Telefono telefono = new Telefono("2323524566","2323123432","232305054");
		Cliente cliente = new Cliente(2,"Manuel","Martinez Gomez",42580890, pasaporte,"40580890",fechanacimiento,"Manuel.martinezgomez@usal.edu.ar",telefono , pasajeroFrecuente, direccion);
		
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
//			if(clienteStream.deleteCliente(2)) {
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
		
		Cliente cliente2 = new Cliente(2,"Rodolfo","Liz",42580890, pasaporte,"40580890",fechanacimiento,"Lucas.martinezgomez@usal.edu.ar",telefono , pasajeroFrecuente, direccion);
		
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
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//////////////////////////AEROLINEAS
		//List<Vuelo> vuelos = new ArrayList<>(); // Lista vacia , FALTA GENERAR VUELOS PARA AGREGARLOS.
		LineaAerea aerolinea = new LineaAerea(0,"GOL",Alianza.Skyteam,vuelos);
		LineaAerea aerolinea1 = new LineaAerea(1,"AER",Alianza.Skyteam,vuelos);
		LineaAereaDAO aeroStream = LineaAereaFactory.getImplementacion("Stream");
		
		//AGREGAR
//		try {
//			if(aeroStream.addAerolinea(aerolinea1)) {
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
		//Borrar
		
//		try {
//			if(aeroStream.deleteAerolinea(0)) {
//				System.out.println("Se borro una aerolinea con exito");
//			}else {
//				System.out.println("no se pudo borrar la aerolinea");
//			}
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
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
		
		//////////////////////// VUELOS
//		String tiempo = "6";
//		Date horasalida = new Date(119, 5, 5, 12, 0);
//		Date horallegada = new Date(119,5,5,horasalida.getHours()+Integer.valueOf(tiempo),0);
//		Aeropuerto aeropuertosalida = new Aeropuerto(1, "MDQ","mar del plata", provincia,pais);
//		Aeropuerto aeropuertollegada = new Aeropuerto(1,"GES","gesell",provincia,pais);
//		List<Cliente> clientes = new ArrayList<>();
//		Vuelo vuelo = new Vuelo(1,"AEE123",aerolinea,50,aeropuertosalida,aeropuertollegada,horasalida,horallegada,tiempo,clientes);
//		
		VueloDAO vueloStream = VueloFactory.getImplementacion("Stream");
		//Agregar
//		try {
//			if(vueloStream.addVuelo(vuelo)) {
//				System.out.println("Se agrego un vuelo");
//			}else {
//				System.out.println("No se pudo agregar un vuelo");
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
//			if(vueloStream.deleteVuelo(1)) {
//				System.out.println("Se elimino el vuel");
//			}else {
//				System.out.println("no se elimino");
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
//			List<Vuelo> lista = vueloStream.getAll();
//			if(lista.isEmpty()) {
//				System.out.println("La lista de vuelos se encuentra vacia");
//			}else{
//				for(Vuelo v :lista) {
//					System.out.println(v.toString());
//				}
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		/////////////////////////////VENTAS
//		Date fechahoraventa= new Date(119,5,6,20,30);
//		Venta venta = new Venta(1,cliente,vuelo,lineaAerea,fechahoraventa,"Efectivo",1,"40000");
//		VentasDAO ventaStream = VentasFactory.getImplementacion("Stream");
		
		//AGREGAR
//		try {
//			if(ventaStream.addVenta(venta)) {
//				System.out.println("Se genero una venta");
//			}else {
//				System.out.println("No se pudo guardar la venta");
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//ELIMINAR
		
//		try {
//			if(ventaStream.deleteVenta(1)) {
//				System.out.println("Se elimino la venta");
//			}else {
//				System.out.println("No se pudo eliminar la venta");
//			}
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		// MOSTRAR
//		
//		try {
//			List<Venta> lista = ventaStream.getAll();
//			if(lista.isEmpty()) {
//				System.out.println("La lista se encuentra vacia");
//			}else {
//				for(Venta v: lista) {
//					System.out.println(v.toString());
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
