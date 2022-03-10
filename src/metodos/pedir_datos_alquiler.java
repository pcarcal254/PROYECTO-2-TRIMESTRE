package metodos;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

import clases.Cliente;
import clases.Empleado;
import clases.Oficina;
import clases.Vehiculo;
import validadores.*;

public class pedir_datos_alquiler {
	static Scanner leer = new Scanner(System.in);

	public static String pedir_matricula_alquiler(ArrayList<Vehiculo> vehiculos) {
		String matricula = "";
		boolean dato_valido = false;

		while (!dato_valido) {
			System.out.println("INTRODUCE LA MATRICULA DEL VEHICULO A ALQUILAR");
			matricula = leer.nextLine();
			dato_valido = generales.valida_matricula(vehiculos, matricula);
			if (!dato_valido) {
				System.out.println("MATRICULA NO VALIDA");
			}
		}
		return matricula;
	}

	public static String pedir_nom_emple_alquiler(ArrayList<Empleado> empleados) {
		String nombre = "";
		boolean dato_valido = false;

		while (!dato_valido) {
			System.out.println("INTRODUCE EL NOMBRE DEL EMPLEADO QUE VA A REALIZAR LA RESERVA");
			nombre = leer.nextLine();
			dato_valido = generales.valida_nombre_emple(empleados, nombre);
			if (!dato_valido) {
				System.out.println("EMPLEADO NO VALIDA");
			}
		}
		return nombre;
	}

	public static String pedir_tarjeta_cliente_alquiler(ArrayList<Cliente> clientes) {
		String tarjeta = "";
		boolean dato_valido = false;

		while (!dato_valido) {
			System.out.println("INTRODUCE LA TARJETA DEL CLIENTE AL QUE PERTENECE LA RESERVA");
			tarjeta = leer.nextLine();
			dato_valido = generales.valida_tarjeta_cliente(clientes, tarjeta);
			if (!dato_valido) {
				System.out.println("EMPLEADO NO VALIDA");
			}
		}
		return tarjeta;
	}

	public static GregorianCalendar pedir_f_inicio_alquiler() {
		GregorianCalendar fecha;
		int ano;
		int mes;
		int dia;
		System.out.println("INTRODUCE EL AÑO DE LA FECHA DE ALQUILER DEL VEHICULO");
		ano = leer.nextInt();
		leer.nextLine();
		System.out.println("INTRODUCE EL MES DE LA FECHA DE ALQUILER DEL VEHICULO");
		mes = leer.nextInt();
		leer.nextLine();
		System.out.println("INTRODUCE EL DÍA DE LA FECHA DE ALQUILER DEL VEHICULO");
		dia = leer.nextInt();
		leer.nextLine();
		fecha = new GregorianCalendar(ano, mes, dia);
		return fecha;
	}

	public static GregorianCalendar pedir_f_fin_alquiler() {
		GregorianCalendar fecha;
		int ano;
		int mes;
		int dia;
		System.out.println("INTRODUCE EL AÑO DE LA FECHA DE DEVOLUCION DEL VEHICULO");
		ano = leer.nextInt();
		leer.nextLine();
		System.out.println("INTRODUCE EL MES DE LA FECHA DE DEVOLUCION DEL VEHICULO");
		mes = leer.nextInt();
		leer.nextLine();
		System.out.println("INTRODUCE EL DÍA DE LA FECHA DE DEVOLUCION DEL VEHICULO");
		dia = leer.nextInt();
		leer.nextLine();
		fecha = new GregorianCalendar(ano, mes, dia);
		return fecha;
	}

	public static String pedir_cod_ofi_dev_alquiler(ArrayList<Oficina> oficinas) {
		String cod_ofi = "";
		boolean dato_valido = false;

		while (!dato_valido) {
			System.out.println("INTRODUCE LA OFICINA DONDE SE DEVOLVERA LA RESERVA");
			cod_ofi = leer.nextLine();
			dato_valido = generales.valida_cod_ofi(oficinas, cod_ofi);
			if (!dato_valido) {
				System.out.println("OFICINA NO VALIDA");
			}
		}
		return cod_ofi;
	}

	public static String obtener_tipo_vehiculo(ArrayList<Vehiculo> vehiculos, String matricula) {
		String tipo="";
		for (Vehiculo v : vehiculos) {
			if (v.getMatricula().equalsIgnoreCase(matricula)) {
				tipo = v.getClass().getCanonicalName();;
				break;
			}
		}
		return tipo;
	}

	public static int obtener_categoria_vehiculo(ArrayList<Vehiculo> vehiculos, String matricula) {
		int categoria=0;
		for (Vehiculo v : vehiculos) {
			if (v.getMatricula().equalsIgnoreCase(matricula)) {
				categoria = v.getCategoria().getPorcentaje();
				break;
			}
		}
		return categoria;
	}

	public static boolean obtener_oficina_aeropuerto(ArrayList<Oficina> oficinas, String cod_ofi_dev) {
		boolean si_no = false;
		boolean dato_valido = false;
		for (Oficina o : oficinas) {
			if (o.getCod_ofi().equalsIgnoreCase(cod_ofi_dev)) {
				si_no = o.isOfi_aeropuerto();
				break;
			}
		}
		return si_no;
	}

}
