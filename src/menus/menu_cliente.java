package menus;

import java.util.ArrayList;

import metodos.interfaz;
import metodos.programa;

public class menu_cliente {

	public static void construirMenuCliente () {

		int posicion = -1;
		ArrayList<String> opcionesvalidas = new ArrayList<String>();
		opcionesvalidas.add("AÑADIR CLIENTE");
		opcionesvalidas.add("MODIFICAR CLIENTE");
		opcionesvalidas.add("BORRAR CLIENTE");
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
			opcionEscogidaMenuCliente(posicion);
		}
	}
	
	private static void opcionEscogidaMenuCliente(int posicion) {
		switch(posicion) {
		case 0:
			//AÑADIR CLIENTE
			programa.nuevo_cliente();
			interfaz.cliente_creado();
			break;
		case 1:
			//MODIFICAR CLIENTE
			programa.modificar_cliente();
			break;
		case 2:
			//BORRAR CLIENTE
			programa.elimina_cliente();
			break;
		case 3:
			//VOLVER
			break;
		}
	}
}
