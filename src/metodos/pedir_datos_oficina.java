package metodos;

import java.util.GregorianCalendar;
import java.util.Scanner;

import validadores.valida_dni;

public class pedir_datos_oficina {
	static Scanner leer = new Scanner(System.in);
	
	public static String pedir_cod_ofi() {
		System.out.println("INTRODUCE EL CÓDIGO DE LA OFICINA");
		String cod_ofi = leer.nextLine();
		return cod_ofi;
	}
	
	public static String pedir_desc_ofi() {
		System.out.println("INTRODUCE LA DESCRIPCION DE LA OFICINA");
		String desc_ofi = leer.nextLine();
		return desc_ofi;
	}
	
	public static String pedir_localidad() {
		System.out.println("INTRODUCE LA LOCALIDAD DONDE ESTA UBICADA LA OFICINA");
		String localidad = leer.nextLine();
		return localidad;
	}
	
	public static String pedir_provincia() {
		System.out.println("INTRODUCE LA PROVINCIA DONDE ESTA UBICADA LA OFICINA");
		String provincia = leer.nextLine();
		return provincia;
	}
	
	public static boolean pedir_ofi_aeropuerto() {
		System.out.println("¿LA OFICINA SE UBICA EN UN AEROPUERTO?");
		System.out.println("1-> SI || 2-> NO");
		int pregunta = leer.nextInt();
		leer.nextLine();
		boolean ofi_aeropuerto = false;
		if (pregunta == 1) {
			ofi_aeropuerto = true;
		}
		return ofi_aeropuerto;
	}

}
