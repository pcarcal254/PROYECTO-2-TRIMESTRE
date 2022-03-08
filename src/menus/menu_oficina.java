package menus;

import java.util.ArrayList;

import metodos.interfaz;
import metodos.programa;

public class menu_oficina {

	public static void construirMenuOficina () {

		int posicion = -1;
		ArrayList<String> opcionesvalidas = new ArrayList<String>();
		opcionesvalidas.add("AÑADIR OFICINA");
		opcionesvalidas.add("BORRAR OFICINA");
		opcionesvalidas.add("VOLVER");

		ArrayList<String> indice = new ArrayList<String>();
		indice.add("1");
		indice.add("2");
		indice.add("3");

		while (posicion != 2) {
			//			interfaz.mostrarOpcionesMenu(opcionesvalidas, indice);
			//			posicion = comprobarOpcion (indice, interfaz.pedirOpcionMenu());
			posicion = leer_comprobar_opcion.leer_comprobar_opcion_menu(opcionesvalidas, indice);
			opcionEscogidaMenuOficina(posicion);
		}
	}
	
	private static void opcionEscogidaMenuOficina(int posicion) {
		switch(posicion) {
		case 0:
			//AÑADIR EMPLEADO
			programa.nueva_oficina();
			interfaz.oficina_creado();
			break;
		case 1:
			//BORRAR EMPLEADO
			programa.elimina_oficina();
			break;
		case 2:
			//VOLVER
			break;
		}
	}
}
