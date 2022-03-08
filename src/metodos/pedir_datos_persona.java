package metodos;

import java.util.GregorianCalendar;
import java.util.Scanner;

import clases.Oficina;
import main.main;
import validadores.valida_dni;

public class pedir_datos_persona {
	static Scanner leer = new Scanner(System.in);

	public static String pedir_dni() {
		String dni = "";
		boolean dato_valido = false;

		while (!dato_valido) {
			System.out.println("INTRODUCE EL DNI DE LA PERSONA");
			dni = leer.nextLine();
			dato_valido = valida_dni.validarDNI(dni);
		}
		return dni;
	}
	
	public static String pedir_nom() {
		System.out.println("INTRODUCE EL NOMBRE DE LA PERSONA");
		String nombre = leer.nextLine();
		return nombre;
	}
	
	public static String pedir_ape1() {
		System.out.println("INTRODUCE EL APELLIDO 1 DE LA PERSONA");
		String ape1 = leer.nextLine();
		return ape1;
	}
	
	public static String pedir_ape2() {
		System.out.println("INTRODUCE EL APELLIDO 2 DE LA PERSONA");
		String ape2 = leer.nextLine();
		return ape2;
	}
	
	public static GregorianCalendar pedir_f_nac() {
		GregorianCalendar fecha;
		int ano;
		int mes;
		int dia;
		System.out.println("INTRODUCE EL AÑO DE LA FECHA DE NACIMIENTO DE LA PERSONA");
		ano = leer.nextInt();
		leer.nextLine();
		System.out.println("INTRODUCE EL MES DE LA FECHA DE NACIMIENTO DE LA PERSONA");
		mes = leer.nextInt();
		leer.nextLine();
		System.out.println("INTRODUCE EL DÍA DE LA FECHA DE NACIMIENTO DE LA PERSONA");
		dia = leer.nextInt();
		leer.nextLine();
		fecha = new GregorianCalendar(ano, mes, dia);
		return fecha;
	}
	
	public static String pedir_carnet_cli() {
		System.out.println("INTRODUCE EL CARNET DEL QUE DISPONE EL CLIENTE");
		String carnet = leer.nextLine();
		return carnet;
	}
	
	public static String pedir_tarjeta_cli() {
		System.out.println("INTRODUCE LA TARJETA DE CLIENTE");
		String tarjeta = leer.nextLine();
		return tarjeta;
	}

	public static GregorianCalendar pedir_f_alta_emple() {
		GregorianCalendar fecha;
		int ano;
		int mes;
		int dia;
		System.out.println("INTRODUCE EL AÑO DE LA FECHA DE ALTA DEL EMPLEADO");
		ano = leer.nextInt();
		leer.nextLine();
		System.out.println("INTRODUCE EL MES DE LA FECHA DE ALTA DEL EMPLEADO");
		mes = leer.nextInt();
		leer.nextLine();
		System.out.println("INTRODUCE EL DÍA DE LA FECHA DE ALTA DEL EMPLEADO");
		dia = leer.nextInt();
		leer.nextLine();
		fecha = new GregorianCalendar(ano, mes, dia);
		return fecha;
	}

	public static String pedir_nom_ofi_empelado() {
		boolean encontrado = false;
		String ubicacion = "";
		
		while (!encontrado) {
			System.out.println("INTRODUCE EL CODIGO DE LA OFICINA DONDE ESTA UBICADO");
			ubicacion =  leer.nextLine();
			for (Oficina o : main.nuestra_empresa.getLista_oficinas()) {
				if (o.getCod_ofi().equalsIgnoreCase(ubicacion)) {
					encontrado = true;
					break;
				}
			}
			if (!encontrado) {
				System.out.println("ERROR AL INTRODUCIR EL CODIGO DE LA OFICINA");
			}
		}
		return ubicacion;
	}

}
