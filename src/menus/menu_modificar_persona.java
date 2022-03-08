package menus;

import java.util.ArrayList;

import clases.Cliente;
import clases.CocheConv;
import clases.CocheElec;
import clases.Empleado;
import clases.Furgoneta;
import clases.Moto;
import clases.Persona;
import clases.Vehiculo;
import metodos.modificar_datos_persona;
import metodos.modificar_datos_vehiculo;

public class menu_modificar_persona {

	static boolean iscliente = false;
	static boolean isempleado = false;
	
	public static void construirMenuModificarPersona (String clase_final, Persona p) {
		
		int posicion = -1;
		ArrayList<String> opcionesvalidas = new ArrayList<String>();
		opcionesvalidas.add("MODIFICAR NOMBRE");
		opcionesvalidas.add("MODIFICAR APELLIDO 1");
		opcionesvalidas.add("MODIFICAR APELLIDO 2");
		opcionesvalidas.add("MODIFICAR FECHA NACIMIENTO");
		
		if (clase_final.equalsIgnoreCase("cliente")) {
			opcionesvalidas.add("MODIFICAR CARNET CONDUCIR");
			opcionesvalidas.add("MODIFICAR TARJETA DE CLIENTE");
			iscliente = true;
		} else if (clase_final.equalsIgnoreCase("empleado")) {
			opcionesvalidas.add("MODIFICAR FECHA DE ALTA");
			opcionesvalidas.add("MODIFICAR NOMBRE OFICINA");
			isempleado = true;
		}
		opcionesvalidas.add("SALIR");
		
		int total_opciones = opcionesvalidas.size();
		ArrayList<String> indice = new ArrayList<String>();
		
		for (int i=0; i<total_opciones; i++) {
			indice.add(""+(i+1));
		}
		
		while (posicion != total_opciones) {
//			interfaz.mostrarOpcionesMenu(opcionesvalidas, indice);
//			posicion = comprobarOpcion (indice, interfaz.pedirOpcionMenu());
			posicion = leer_comprobar_opcion.leer_comprobar_opcion_menu(opcionesvalidas, indice);
			opcionEscogidaMenuModificarPersona(posicion, p);
		}
	}
	
	private static void opcionEscogidaMenuModificarPersona(int posicion, Persona p) {
		if (iscliente) {
			Cliente cli = (Cliente)p;
			modificar_datos_persona.switch_modifica_datos_cliente(posicion, cli);
		} else if (isempleado) {
			Empleado emp = (Empleado)p;
			modificar_datos_persona.switch_modifica_datos_empleado(posicion, emp);
		}
	}
}
