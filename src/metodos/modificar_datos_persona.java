package metodos;

import java.util.GregorianCalendar;

import clases.Cliente;
import clases.CocheConv;
import clases.Empleado;
import clases.Persona;

public class modificar_datos_persona {

	//MODIFICAR DATOS DE CLIENTE
	public static void switch_modifica_datos_cliente(int posicion, Cliente cli) {
		switch(posicion) {
			case 0:
				//MODIFICAR NOMBRE
				cambia_nombre(cli);
				break;
			case 1:
				//MODIFICAR APELLIDO 1
				cambia_ape1(cli);
				break;
			case 2:
				//MODIFICAR APELLIDO 2
				cambia_ape2(cli);
				break;
			case 3:
				//MODIFICAR FECHA NACIMIENTO
				cambia_f_nac(cli);
				break;
			case 4:
				//MODIFICAR CARNET DE CONDUCIR
				cambia_carnet_cli(cli);
				break;
			case 5:
				//MODIFICAR TARJETA CLIENTE
				cambia_tarjeta_cli(cli);
				break;
			case 6:
				//SALIR
				break;
		}
	}
	
	public static void cambia_nombre(Persona p) {
		String nombre = pedir_datos_persona.pedir_nom();
		p.setNom(nombre);
	}
	
	public static void cambia_carnet_cli(Cliente cli) {
		String carnet = pedir_datos_persona.pedir_carnet_cli();
		cli.setCarnet(carnet);
	}
	
	public static void cambia_tarjeta_cli(Cliente cli) {
		String tarjeta = pedir_datos_persona.pedir_tarjeta_cli();
		cli.setTarjeta(tarjeta);
	}

	
	//MODIFICAR DATOS EMPLEADO
	public static void switch_modifica_datos_empleado(int posicion, Empleado emp) {
		switch(posicion) {
		case 0:
			//MODIFICAR NOMBRE
			cambia_nombre(emp);
			break;
		case 1:
			//MODIFICAR APELLIDO 1
			cambia_ape1(emp);
			break;
		case 2:
			//MODIFICAR APELLIDO 2
			cambia_ape2(emp);
			break;
		case 3:
			//MODIFICAR FECHA NACIMIENTO
			cambia_f_nac(emp);
			break;
		case 4:
			//MODIFICAR FECHA ALTA
			cambia_f_alta_emple(emp);
			break;
		case 5:
			//MODIFICAR NOMBRE OFICINA
			cambia_nom_ofi_emple(emp);
			break;
		case 6:
			//SALIR
			break;
		}	
	}
	
	public static void cambia_f_alta_emple(Empleado emp) {
		GregorianCalendar fecha = pedir_datos_persona.pedir_f_alta_emple();
		emp.setF_alta(fecha);
	}
	
	public static void cambia_nom_ofi_emple(Empleado emp) {
		String ofi = pedir_datos_persona.pedir_nom_ofi_empelado();
		emp.setNom_ofi(ofi);
	}
	
	//MODIFICA DATOS GENERALES PERSONA
	public static void cambia_ape1(Persona p) {
		String ape1 = pedir_datos_persona.pedir_ape1();
		p.setApe1(ape1);
	}
	
	public static void cambia_ape2(Persona p) {
		String ape2 = pedir_datos_persona.pedir_ape2();
		p.setApe2(ape2);
	}
	
	public static void cambia_f_nac(Persona p) {
		GregorianCalendar fecha = pedir_datos_persona.pedir_f_nac();
		p.setF_nac(fecha);
	}
}
