package metodos;

import java.util.GregorianCalendar;
import java.util.Scanner;

import clases.Categoria;
import clases.Empresa;
import clases.Oficina;
import validadores.*;
import main.*;

public class pedir_datos_vehiculo {
	static Scanner leer = new Scanner(System.in);
	
	public static String pedir_matricula() {
		String matricula;
		System.out.println("INTRODUCE LA MATRICULA DEL VEHICULO");
		matricula = leer.nextLine();
		return matricula;
	}
	
	public static String pedir_marca() {
		String marca;
		System.out.println("INTRODUCE LA MARCA DEL VEHICULO");
		marca = leer.nextLine();
		return marca;
	}
	
	public static String pedir_modelo() {
		String modelo;
		System.out.println("INTRODUCE EL MODELO DEL VEHICULO");
		modelo = leer.nextLine();
		return modelo;
	}
	
	public static String pedir_color() {
		String color;
		System.out.println("INTRODUCE EL COLOR DEL VEHICULO");
		color = leer.nextLine();
		return color;
	}

	
	public static GregorianCalendar pedir_fec_general() {
		GregorianCalendar fecha;
		int ano;
		int mes;
		int dia;
		System.out.println("INTRODUCE EL AÑO DE LA FECHA DE ALTA DEL VEHICULO");
		ano = leer.nextInt();
		leer.nextLine();
		System.out.println("INTRODUCE EL MES DE LA FECHA DE ALTA DEL VEHICULO");
		mes = leer.nextInt();
		leer.nextLine();
		System.out.println("INTRODUCE EL DÍA DE LA FECHA DE ALTA DEL VEHICULO");
		dia = leer.nextInt();
		leer.nextLine();
		fecha = new GregorianCalendar(ano, mes, dia);
		return fecha;
	}

	public static int pedir_km() {
		int km;
		System.out.println("INTRODUCE LOS KMS QUE TIENE EL VEHICULO");
		km = leer.nextInt();
		leer.nextLine();
		return 0;
	}

	public static Categoria pedir_categoria() {
		Categoria categoria;
		String cod="";
		String descripcion="";
		int porcentaje;
		boolean dato_valido = false;
		
		while (!dato_valido) {
			System.out.println("INTRODUCE EL CODIGO DE LA CATEGORIA DEL VEHICULO");
			System.out.println("SOLO VALIDOS LOS CODIGOS: A / B / C / D");
			cod = leer.nextLine();
			dato_valido = generales.valida_cod_categoria(cod);
		}
		
		dato_valido = false;
		while (!dato_valido) {
			System.out.println("INTRODUCE LA DESCRIPCION DE LA CATEGORIA DEL VEHICULO");
			System.out.println("SOLO VALIDOS LOS VALORES: ECONOMICO / MEDIO / PREMIUM");
			descripcion = leer.nextLine();
			dato_valido = generales.valida_desc_categoria(descripcion);
		}
		
		System.out.println("INTRODUCE EL PORCENTAJE "
				+ "DE RECARGO QUE SUPONE EN LOS "
				+ "ALQUILERES DE LA CATEGORIA DEL VEHICULO");
		porcentaje = leer.nextInt();
		leer.nextLine();
		return (categoria = new Categoria(cod, descripcion, porcentaje));
	}

	public static String pedir_ubi() {
		boolean encontrado = false;
		String ubicacion = "";
		
		while (!encontrado) {
			System.out.println("INTRODUCE EL NOMBRE DE LA OFICINA DONDE ESTA UBICADO");
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

	public static Double pedir_con() {
		double consumo_km_litro;
		System.out.println("INTRODUCE EL CONSUMO EN KM/L DEL VEHICULO");
		consumo_km_litro = leer.nextDouble();
		leer.nextLine();
		return consumo_km_litro;
	}

	public static int pedir_pot() {
		int potencia;
		System.out.println("INTRODUCE LA POTENCIA DEL VEHICULO EN CV");
		potencia = leer.nextInt();
		leer.nextLine();
		return potencia;
	}

	public static String pedir_emi() {
		boolean validado = false;
		String emisiones="";
		while (!validado) {
			System.out.println("INTRODUCE EL NIVEL DE EMISIONES DEL VEHICULO");
			System.out.println("SOLO VALIDOS LOS VALORES: A / B / C");
			emisiones = leer.nextLine();
			validado = generales.valida_emisiones(emisiones);
		}
		return emisiones;
	}

	public static int pedir_plazas() {
		int plazas;
		System.out.println("INTRODUCE EL NUMERO DE PLAZAS DEL VEHICULO");
		plazas = leer.nextInt();
		leer.nextLine();
		return plazas;
	}
	
	public static String pedir_tip() {
		String tipo="";
		boolean validado = false;
		while (!validado) {
			System.out.println("INTRODUCE EL TIPO DE COCHE");
			System.out.println("LOS VALORES VALIDOS SON: DEPORTIVO, FAMILIAR, 4x4");
			tipo = leer.nextLine();
			validado = validadores.generales.valida_tipo_coche(tipo);
		}
		return tipo;
	}

	public static int pedir_cap() {
		int capacidad;
		System.out.println("INTRODUCE LA CAPACIDAD DE CARGA DEL VEHICULO");
		capacidad = leer.nextInt();
		leer.nextLine();
		return capacidad;
	}

	public static String pedir_car_req() {
		boolean validado = false;
		String carnet_requerido = "";
		while (!validado) {
			System.out.println("INTRODUCE EL CARNET DISPONIBLE");
			System.out.println("LOS VALORES VALIDOS SON: A / B / C");
			carnet_requerido = leer.nextLine();
			validado = validadores.generales.valida_carnet(carnet_requerido);
		}
		return carnet_requerido;
	}

	public static int pedir_aut() {
		Scanner leer = new Scanner(System.in);
		int autonomia;
		System.out.println("INTRODUCE LA AUTONOMIA DEL VEHICULO EN KM");
		autonomia = leer.nextInt();
		leer.nextLine();
		return autonomia;
	}

	public static int pedir_tiem_rec() {
		int tiempo_recarga;
		System.out.println("INTRODUCE EL TIEMPO DE RECARGA DEL VEHICULO EN MINS");
		tiempo_recarga = leer.nextInt();
		leer.nextLine();
		return tiempo_recarga;
	}

	public static int pedir_cil() {
		int cilindrada;
		System.out.println("INTRODUCE LA CILINDRADA DEL VEHICULO");
		cilindrada = leer.nextInt();
		leer.nextLine();
		return cilindrada;
	}

	public static String pedir_car_req2() {
		/*AM/A1/A2*/
		String carnet_requerido2 = "";
		boolean validado = false;
		while (!validado) {
			System.out.println("INTRODUCE EL CARNET DISPONIBLE");
			System.out.println("LOS VALORES VALIDOS SON: AM / A1 / A2");
			carnet_requerido2 = leer.nextLine();
			validado = validadores.generales.valida_carnet_req2(carnet_requerido2);
		}
		return carnet_requerido2;
	}
	
	
	
}
