package validadores;

<<<<<<< Updated upstream
=======
import java.util.ArrayList;

import clases.Alquiler;
import clases.Cliente;
import clases.Empleado;
import clases.Oficina;
import clases.Vehiculo;
import menus.menu_modificar_persona;
import metodos.interfaz;

>>>>>>> Stashed changes
public class generales {
	
	public static boolean valida_cod_categoria(String opcion) {
		String cadena = "ABCD";
		boolean validado;
		if (opcion.equalsIgnoreCase("a") ||
			opcion.equalsIgnoreCase("b") ||
			opcion.equalsIgnoreCase("c") ||
			opcion.equalsIgnoreCase("d")) {
			validado = true;
		} else {
			validado = false;
		}
		return validado;
	}
	
	public static boolean valida_desc_categoria(String opcion) {
		boolean validado;
		if (opcion.equalsIgnoreCase("ECONOMICO") ||
				opcion.equalsIgnoreCase("MEDIO") ||
				opcion.equalsIgnoreCase("PREMIUM")) {
			validado = true;
		} else {
			validado = false;
		}
		return validado;
	}
	
	public static boolean valida_emisiones(String opcion) {
		String cadena = "ABC";
		boolean validado;
		if (opcion.indexOf(cadena) > 0) {
			validado = true;
		} else {
			validado = false;
		}
		return validado;
	}

	public static boolean valida_carnet(String opcion) {
		String cadena = "ABC";
		boolean validado;
		if (opcion.indexOf(cadena) > 0) {
			validado = true;
		} else {
			validado = false;
		}
		return validado;
	}
	
	public static boolean valida_carnet_req2(String opcion) {
		boolean validado;
		if (opcion.equalsIgnoreCase("AM") ||
				opcion.equalsIgnoreCase("A1") ||
				opcion.equalsIgnoreCase("A2")) {
			validado = true;
		} else {
			validado = false;
		}
		return validado;
	}

	public static boolean valida_tipo_coche(String opcion) {
		boolean validado;
		if (opcion.equalsIgnoreCase("DEPORTIVO") ||
				opcion.equalsIgnoreCase("FAMILIAR") ||
				opcion.equalsIgnoreCase("4x4")) {
			validado = true;
		} else {
			validado = false;
		}
		return validado;
	}

<<<<<<< Updated upstream
=======
	public static boolean valida_matricula(ArrayList<Vehiculo> vehiculos, String matricula) {
		boolean dato_valido = false;
		for (Vehiculo v : vehiculos) {
			if (v.getMatricula().equalsIgnoreCase(matricula)) {
				dato_valido = true;
				break;
			}
		}
		return dato_valido;
	}

	public static boolean valida_nombre_emple(ArrayList<Empleado> empleados, String nombre) {
		boolean dato_valido = false;
		for (Empleado emp : empleados) {
			if (emp.getNom().equalsIgnoreCase(nombre)) {
				dato_valido = true;
				break;
			}
		}
		return dato_valido;
	}

	public static boolean valida_tarjeta_cliente(ArrayList<Cliente> clientes, String tarjeta) {
		boolean dato_valido = false;
		for (Cliente cli : clientes) {
			if (cli.getTarjeta().equalsIgnoreCase(tarjeta)) {
				dato_valido = true;
				break;
			}
		}
		return dato_valido;
	}

	public static boolean valida_cod_ofi(ArrayList<Oficina> oficinas, String cod_ofi) {
		boolean dato_valido = false;
		for (Oficina ofi : oficinas) {
			if (ofi.getCod_ofi().equalsIgnoreCase(cod_ofi)) {
				dato_valido = true;
				break;
			}
		}
		return dato_valido;
	}
	
	public static boolean valida_vehiculo_ya_alquilado(ArrayList<Alquiler> alquileres, String matricula) {
		boolean dato_valido = false;
		for (Alquiler alq : alquileres) {
			if (alq.getMatricula().equalsIgnoreCase(matricula)) {
				dato_valido = true;
				break;
			}
		}
		return dato_valido;
	}

>>>>>>> Stashed changes
}
