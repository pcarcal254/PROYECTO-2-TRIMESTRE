package menus;

import java.util.ArrayList;

import clases.Empresa;
import metodos.*;

public class menu_vehiculo {
	
	public static void construirMenuVehiculo () {
		
		int posicion = -1;
		ArrayList<String> opcionesvalidas = new ArrayList<String>();
		opcionesvalidas.add("AÑADIR VEHICULO");
		opcionesvalidas.add("MODIFICAR VEHICULO");
		opcionesvalidas.add("BORRAR VEHICULO");
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
			opcionEscogidaMenuVehiculo(posicion);
		}
	}

//	private static int comprobarOpcion (ArrayList<String> indice, String opcionpasada) {
//		
//		int posicion = - 1;
//		
//		for (int i = 0; i<indice.size(); i++) {
//			if (opcionpasada.equalsIgnoreCase(indice.get(i))){
//				posicion = i;
//				break;
//			}
//		}
//		return posicion;
//	}
	
	private static void opcionEscogidaMenuVehiculo(int posicion) {
		switch(posicion) {
		case 0:
			//AÑADIR VEHICULO
			menu_vehiculo_tipo.construirMenuVehiculoTipo();
			break;
		case 1:
			//MODIFICAR VEHICULO
			programa.modificar_vehiculo();
			break;
		case 2:
			//BORRAR VEHICULO
			programa.elimina_vehiculo();
			break;
		case 3:
			//VOLVER
			break;
		}
	}

}
