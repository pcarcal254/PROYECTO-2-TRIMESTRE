package metodos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

import clases.Alquiler;
import clases.Categoria;
import clases.Cliente;
import clases.CocheConv;
import clases.CocheElec;
import clases.Convencional;
import clases.Electrico;
import clases.Empleado;
import clases.Empresa;
import clases.Furgoneta;
import clases.Oficina;
import clases.Persona;
import clases.Vehiculo;
import main.main;
import menus.menu_gestion;
import menus.menu_modificar_persona;

public class programa {
	
//	Scanner leer = new Scanner(System.in);
	
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private static ArrayList<Oficina> oficinas = new ArrayList<Oficina>();
	private static ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
	
	//COMPROBACION EMPRESA CREADA
	public static boolean comprobacion_fichero() {
		File empresa;
		empresa = new File("empresa.ser");
		return empresa.exists();
	}
	
	//SERIALIZACION O DESERIALIZACION
//	public static void recuperacion_empresa(boolean primera_vez) {
//		if (!primera_vez) {
//			Empresa nueva_empresa = programa.crear_empresa();
//			try {
//		         FileOutputStream fileOut =
//		         new FileOutputStream("empresa.ser");
//		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
//		         out.writeObject(nueva_empresa);
//		         out.close();
//		         fileOut.close();
//		      } catch (IOException i) {
//		         i.printStackTrace();
//		      }
//			main.nuestra_empresa = nueva_empresa;
//		} else {
//			Empresa nueva_empresa = programa.crear_empresa();
//			try {
//		         FileInputStream fileIn = new FileInputStream("empresa.ser");
//		         ObjectInputStream in = new ObjectInputStream(fileIn);
//		         nueva_empresa = (Empresa) in.readObject();
//		         in.close();
//		         fileIn.close();
//		      } catch (IOException i) {
//		         i.printStackTrace();
//		         return;
//		      } catch (ClassNotFoundException c) {
//		         System.out.println("CLASE EMPRESA NO CREADA");
//		         c.printStackTrace();
//		         return;
//		      }
//			main.nuestra_empresa = nueva_empresa;
//			volcado_de_datos();
//		}
//	}
	
	public static void volcado_de_datos(Empresa nueva_empresa) {
		vehiculos = nueva_empresa.getLista_vehiculos();
		clientes = nueva_empresa.getLista_clientes();
		empleados = nueva_empresa.getPlantilla_emple();
		oficinas = nueva_empresa.getLista_oficinas();
		alquileres = nueva_empresa.getLista_alquileres();
	}
	
	//EMPRESA
	public static Empresa crear_empresa() {
		String nom_empresa = interfaz.pedir_empresa();
		Empresa emp = new Empresa(nom_empresa);
		return emp;
	}
	
	//VEHICULO

	public static Vehiculo nuevo_vehiculo() {
		String mat = pedir_datos_vehiculo.pedir_matricula();
		String mar = pedir_datos_vehiculo.pedir_marca();
		String mod = pedir_datos_vehiculo.pedir_modelo();
		String col = pedir_datos_vehiculo.pedir_color();
		GregorianCalendar fec_alt = pedir_datos_vehiculo.pedir_fec_general();
		int km = pedir_datos_vehiculo.pedir_km();
		Categoria cat = pedir_datos_vehiculo.pedir_categoria();
		String ubi = pedir_datos_vehiculo.pedir_ubi();
		Vehiculo v = new Vehiculo(mat, mar, mod, col, fec_alt, km, cat, ubi);
		return v;
	}
	
	private static Convencional nuevo_vehi_con(Vehiculo v) {
		double con = pedir_datos_vehiculo.pedir_con();
		int pot = pedir_datos_vehiculo.pedir_pot();
		String emi = pedir_datos_vehiculo.pedir_emi();
		Convencional conv = new Convencional(v, con, pot, emi);
		return conv;
	}
	
	public static void nuevo_coche_conv() {
		Vehiculo vehi = nuevo_vehiculo();
		Convencional vehi_conv = nuevo_vehi_con(vehi);
		int pla = pedir_datos_vehiculo.pedir_plazas();
		String tip = pedir_datos_vehiculo.pedir_tip();
		CocheConv c = new CocheConv(vehi_conv,pla,tip);
		main.nuestra_empresa.anade_vehiculo(c);
	}

	public static void nuevo_furgoneta_conv() {
		Vehiculo vehi = nuevo_vehiculo();
		Convencional vehi_conv = nuevo_vehi_con(vehi);
		int cap = pedir_datos_vehiculo.pedir_cap();
		String car_req = pedir_datos_vehiculo.pedir_car_req();
		Furgoneta c = new Furgoneta(vehi_conv,cap,car_req);
		main.nuestra_empresa.anade_vehiculo(c);
	}
	
	private static Electrico nuevo_vehi_elec(Vehiculo v) {
		int aut = pedir_datos_vehiculo.pedir_aut();
		int tiem_rec = pedir_datos_vehiculo.pedir_tiem_rec();
		Electrico elec = new Electrico(v, aut, tiem_rec);
		return elec;
	}
	
	public static void nuevo_coche_elec() {
		Vehiculo vehi = nuevo_vehiculo();
		Electrico vehi_elec = nuevo_vehi_elec(vehi);
		int pla = pedir_datos_vehiculo.pedir_plazas();
		String tip = pedir_datos_vehiculo.pedir_tip();
		CocheElec c = new CocheElec(vehi_elec,pla,tip);
		main.nuestra_empresa.anade_vehiculo(c);
	}
	
	public static void nuevo_moto_elec() {
		Vehiculo vehi = nuevo_vehiculo();
		Electrico vehi_elec = nuevo_vehi_elec(vehi);
		int cil = pedir_datos_vehiculo.pedir_cil();
		String car_req2 = pedir_datos_vehiculo.pedir_car_req2();
		CocheElec c = new CocheElec(vehi_elec,cil,car_req2);
		main.nuestra_empresa.anade_vehiculo(c);
	}
	
	public static void modificar_vehiculo() {
		int num_total_vehiculos = vehiculos.size();
		interfaz.muestra_titulo_vehiculos_anadidos(num_total_vehiculos);
		String matricula = interfaz.muestra_pedir_matricula_vehiculo();
				
		for (Vehiculo v : vehiculos) {
			if (v.getMatricula().equalsIgnoreCase(matricula)) {
				//v.getClass().getCanonicalName(); 
				String clase_vehiculo_final = v.getClass().getCanonicalName();
				String clase_vehiculo_tipo = v.getClass().getSuperclass().getCanonicalName();
				interfaz.mostrar_clase_vehiculo(clase_vehiculo_final, matricula);
				menus.menu_modificar_vehiculo.construirMenuModificarVehiculo(clase_vehiculo_tipo, clase_vehiculo_final, v);
				break;
			}
		}
		
	}
	
	public static void elimina_vehiculo() {
		int num_total_vehiculos = vehiculos.size();
		interfaz.muestra_titulo_vehiculos_anadidos(num_total_vehiculos);
		String matricula = interfaz.muestra_pedir_matricula_vehiculo();
		
		int contador = 0;
		for (Vehiculo v : vehiculos) {
			if (v.getMatricula().equalsIgnoreCase(matricula)) {
				//v.getClass().getCanonicalName(); 
				String clase_vehiculo_final = v.getClass().getCanonicalName();
				//String clase_vehiculo_tipo = v.getClass().getSuperclass().getCanonicalName();
				int pregunta = interfaz.mostrar_elimina_vehiculo(clase_vehiculo_final, matricula);
				if (pregunta == 1) {
					vehiculos.remove(contador);
				} else {
					interfaz.mostrar_no_eliminado_vehiculo(clase_vehiculo_final, matricula);
				}
				break;
			}
			contador++;
		}
		if (contador == (num_total_vehiculos-1)){
			interfaz.error_encontrar_vehiculo(matricula);
		}
	}
	
	public static Persona nueva_persona() {
		String dni = pedir_datos_persona.pedir_dni();
		String nom = pedir_datos_persona.pedir_nom();
		String ape1 = pedir_datos_persona.pedir_ape1();
		String ape2 = pedir_datos_persona.pedir_ape2();
		GregorianCalendar f_nac = pedir_datos_persona.pedir_f_nac();
		Persona p = new Persona(dni, nom, ape1, ape2, f_nac);
		return p;
	}
	
	public static void nuevo_cliente() {
		Persona per = nueva_persona();
		String carnet = pedir_datos_persona.pedir_carnet_cli();
		String tarjeta = pedir_datos_persona.pedir_tarjeta_cli();
		Cliente cli = new Cliente(per, carnet, tarjeta);
		main.nuestra_empresa.anade_cliente(cli);
	}
	
	public static void modificar_cliente() {
		int num_total_clientes = clientes.size();
		interfaz.muestra_titulo_clientes_anadidos(num_total_clientes);
		String dni = interfaz.muestra_pedir_dni_persona();
				
		for (Cliente c : clientes) {
			if (c.getDni().equalsIgnoreCase(dni)) {
				//v.getClass().getCanonicalName(); 
				interfaz.mostrar_cliente_a_modificar(dni);
				String clase_persona_final = c.getClass().getCanonicalName();
				menu_modificar_persona.construirMenuModificarPersona(clase_persona_final, c);
				break;
			}
		}
	}
	
	public static void elimina_cliente() {
		int num_total_clientes = clientes.size();
		interfaz.muestra_titulo_clientes_anadidos(num_total_clientes);
		String dni = interfaz.muestra_pedir_dni_persona();
		
		int contador = 0;
		for (Cliente cli : clientes) {
			if (cli.getDni().equalsIgnoreCase(dni)) {
				String clase_persona_final = cli.getClass().getCanonicalName();
				int pregunta = interfaz.mostrar_elimina_persona(clase_persona_final, dni);
				if (pregunta == 1) {
					clientes.remove(contador);
				} else {
					interfaz.mostrar_no_eliminado_persona(clase_persona_final, dni);
				}
				break;
			}
			contador++;
		}
		if (contador == (num_total_clientes-1)){
			interfaz.error_encontrar_vehiculo(dni);
		}
	}
	
	public static void nuevo_empleado() {
		Persona per = nueva_persona();
		GregorianCalendar f_alta = pedir_datos_persona.pedir_f_alta_emple();
		String nom_ofi= pedir_datos_persona.pedir_nom_ofi_empelado();
		Empleado emple = new Empleado(per, f_alta, nom_ofi);
		main.nuestra_empresa.anade_empleado(emple);
	}

	public static void modificar_empleado() {
		int num_total_empleados = empleados.size();
		interfaz.muestra_titulo_empleados_anadidos(num_total_empleados);
		String dni = interfaz.muestra_pedir_dni_persona();
				
		for (Empleado emp : empleados) {
			if (emp.getDni().equalsIgnoreCase(dni)) {
				//v.getClass().getCanonicalName(); 
				interfaz.mostrar_empleado_a_modificar(dni);
				String clase_persona_final = emp.getClass().getCanonicalName();
				menu_modificar_persona.construirMenuModificarPersona(clase_persona_final, emp);
				break;
			}
		}
	}
	
	public static void elimina_empleado() {
		int num_total_empleados = empleados.size();
		interfaz.muestra_titulo_empleados_anadidos(num_total_empleados);
		String dni = interfaz.muestra_pedir_dni_persona();
		
		int contador = 0;
		for (Empleado emp : empleados) {
			if (emp.getDni().equalsIgnoreCase(dni)) {
				String clase_persona_final = emp.getClass().getCanonicalName();
				int pregunta = interfaz.mostrar_elimina_persona(clase_persona_final, dni);
				if (pregunta == 1) {
					empleados.remove(contador);
				} else {
					interfaz.mostrar_no_eliminado_persona(clase_persona_final, dni);
				}
				break;
			}
			contador++;
		}
		if (contador == (num_total_empleados-1)){
			interfaz.error_encontrar_persona(dni);
		}
	}
	
	public static void nueva_oficina() {
		String cod_ofi = pedir_datos_oficina.pedir_cod_ofi();
		String desc_ofi = pedir_datos_oficina.pedir_desc_ofi();
		String localidad = pedir_datos_oficina.pedir_localidad();
		String provincia = pedir_datos_oficina.pedir_provincia();
		boolean ofi_aeropuerto = pedir_datos_oficina.pedir_ofi_aeropuerto();
		Oficina o = new Oficina(cod_ofi, desc_ofi, localidad, provincia, ofi_aeropuerto);
		main.nuestra_empresa.anade_oficina(o);
	}
	
	public static void elimina_oficina() {
		int num_total_oficinas = oficinas.size();
		interfaz.muestra_titulo_oficinas_anadidas(num_total_oficinas);
		String cod_ofi = interfaz.muestra_pedir_cod_ofi();
		
		int contador = 0;
		for (Oficina o : oficinas) {
			if (o.getCod_ofi().equalsIgnoreCase(cod_ofi)) {
				int pregunta = interfaz.mostrar_elimina_oficina(cod_ofi);
				if (pregunta == 1) {
					oficinas.remove(contador);
				} else {
					interfaz.mostrar_no_eliminado_oficina(cod_ofi);
				}
				break;
			}
			contador++;
		}
		if (contador == (num_total_oficinas-1)){
			interfaz.error_encontrar_oficina(cod_ofi);
		}
	}

	public static void registrar_alquiler() {
		String matricula = pedir_datos_alquiler.pedir_matricula_alquiler(vehiculos);
		String nom_emple = pedir_datos_alquiler.pedir_nom_emple_alquiler(empleados);
		String tarjeta_cliente = pedir_datos_alquiler.pedir_tarjeta_cliente_alquiler(clientes);
		GregorianCalendar f_inicio = pedir_datos_alquiler.pedir_f_inicio_alquiler();
		GregorianCalendar f_fin = pedir_datos_alquiler.pedir_f_fin_alquiler();
		String cod_ofi_dev = pedir_datos_alquiler.pedir_cod_ofi_dev_alquiler(oficinas); 
		boolean aeropuerto_ofi = pedir_datos_alquiler.obtener_oficina_aeropuerto(oficinas,cod_ofi_dev);
		int porcentaje_categoria = pedir_datos_alquiler.obtener_categoria_vehiculo(vehiculos,matricula);
		String tipo_vehiculo = pedir_datos_alquiler.obtener_tipo_vehiculo(vehiculos,matricula);
		double precio_total = calcula_precio_alquiler(tipo_vehiculo, porcentaje_categoria, cod_ofi_dev, aeropuerto_ofi, f_inicio, f_fin);
		Alquiler alq = new Alquiler(matricula, nom_emple, tarjeta_cliente, f_inicio, f_fin, cod_ofi_dev, porcentaje_categoria, tipo_vehiculo, precio_total);
		main.nuestra_empresa.anade_alquiler(alq);
	}
	
	public static double calcula_precio_alquiler(String tipo_vehiculo, int porcentaje_categoria, String cod_ofi_dev, boolean aeropuerto_ofi, GregorianCalendar f_inicio, GregorianCalendar f_fin) {
		double precio=0;
		int dias_totales = daysBetween(f_inicio.getTime(), f_fin.getTime());
		double precio_dias_totales = 0;
		if (tipo_vehiculo.equalsIgnoreCase("moto")) {
			precio_dias_totales = (10*dias_totales)+((10*dias_totales)*0.15);
		} else if (tipo_vehiculo.equalsIgnoreCase("cocheelec")) {
			precio_dias_totales = (50*dias_totales)+((10*dias_totales)*0.15);
		} else if (tipo_vehiculo.equalsIgnoreCase("furgoneta")) {
			precio_dias_totales = (70*dias_totales);
		} else if (tipo_vehiculo.equalsIgnoreCase("cocheconv")) {
			precio_dias_totales = (50*dias_totales);
		}
		precio = precio_dias_totales + (precio_dias_totales*(porcentaje_categoria/100));
		if (aeropuerto_ofi) {
			precio = precio + (precio*0.1);
		}
		return precio;
	}
	
	public static int daysBetween(Date d1, Date d2) {
	    return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	  }
	
}
