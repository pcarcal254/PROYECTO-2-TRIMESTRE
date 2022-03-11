package menus;

import java.util.ArrayList;

import clases.Empresa;
import metodos.interfaz;
import metodos.programa;

public class menu_vehiculo_tipo {
	
	public static void construirMenuVehiculoTipo () {
		
		int posicion = -1;
		ArrayList<String> opcionesvalidas = new ArrayList<String>();
		opcionesvalidas.add("CONVENCIONAL");
		opcionesvalidas.add("ELÉCTRICO");
		opcionesvalidas.add("VOLVER");
		
		ArrayList<String> indice = new ArrayList<String>();
		indice.add("1");
		indice.add("2");
		indice.add("3");
		
		while (posicion != 2) {
//			interfaz.mostrarOpcionesMenu(opcionesvalidas, indice);
//			posicion = comprobarOpcion (indice, interfaz.pedirOpcionMenu());
			posicion = leer_comprobar_opcion.leer_comprobar_opcion_menu(opcionesvalidas, indice);
			opcionEscogidaMenuVehiculoTipo(posicion);
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
	
	private static void opcionEscogidaMenuVehiculoTipo(int posicion) {
		switch(posicion) {
		case 0:
			//CONVENCIONAL
			menu_vehiculo_tipo_conv.construirMenuVehiculoTipoConv();
			break;
		case 1:
			//ELECTRICO
			menu_vehiculo_tipo_elec.construirMenuVehiculoTipoElec();
			break;
		case 2:
			//VOLVER
			break;
		}
	}

}
