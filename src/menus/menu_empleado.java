package menus;

import java.util.ArrayList;

import metodos.interfaz;
import metodos.programa;

public class menu_empleado {

	public static void construirMenuEmpleado () {

		int posicion = -1;
		ArrayList<String> opcionesvalidas = new ArrayList<String>();
		opcionesvalidas.add("AÑADIR EMPLEADO");
		opcionesvalidas.add("MODIFICAR EMPLEADO");
		opcionesvalidas.add("BORRAR EMPLEADO");
		opcionesvalidas.add("VOLVER");

		ArrayList<String> indice = new ArrayList<String>();
		indice.add("1");
		indice.add("2");
		indice.add("3");
		indice.add("4");

		while (posicion != 3) {
			//			interfaz.mostrarOpcionesMenu(opcionesvalidas, indice);
			//			posicion = comprobarOpcion (indice, interfaz.pedirOpcionMenu());
			posicion = leer_comprobar_opcion.leer_comprobar_opcion_menu(opcionesvalidas, indice);
			opcionEscogidaMenuEmpleado(posicion);
		}
	}
	
	private static void opcionEscogidaMenuEmpleado(int posicion) {
		switch(posicion) {
		case 0:
			//AÑADIR EMPLEADO
			programa.nuevo_empleado();
			interfaz.empleado_creado();
			break;
		case 1:
			//MODIFICAR EMPLEADO
			programa.modificar_empleado();
			break;
		case 2:
			//BORRAR EMPLEADO
			programa.elimina_empleado();
			break;
		case 3:
			//VOLVER
			break;
		}
	}
}
