package menus;

import java.util.ArrayList;

import clases.Empresa;
import metodos.interfaz;

public class menu_sino {
	
	public static void construirMenuSiNo () {
		
		int posicion = -1;
		ArrayList<String> opcionesvalidas = new ArrayList<String>();
		opcionesvalidas.add("SI");
		opcionesvalidas.add("NO");
		
		ArrayList<String> indice = new ArrayList<String>();
		indice.add("1");
		indice.add("2");
		
		while (posicion != 1) {
//			interfaz.mostrarOpcionesMenu(opcionesvalidas, indice);
//			posicion = comprobarOpcion (indice, interfaz.pedirOpcionMenu());
			posicion = leer_comprobar_opcion.leer_comprobar_opcion_menu(opcionesvalidas, indice);
			opcionEscogidaMenuSiNo(posicion);
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

	private static void opcionEscogidaMenuSiNo(int posicion) {
		switch(posicion) {
		case 0:
			menu_principal.construirMenuPrincipal();
			break;
		case 1:
			interfaz.finalPrograma();
			System.exit(0);
			break;
		}
	}
}
