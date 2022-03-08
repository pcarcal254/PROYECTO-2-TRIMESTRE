package menus;

import java.util.ArrayList;

import clases.Empresa;
import metodos.interfaz;

public class menu_gestion {
	
	public static void construirMenuGestion () {
		
		int posicion = -1;
		ArrayList<String> opcionesvalidas = new ArrayList<String>();
		opcionesvalidas.add("GESTION VEHICULOS"); //HECHO COMPLETO
		opcionesvalidas.add("GESTION CLIENTES"); //HECHO COMPLETO
		opcionesvalidas.add("GESTION EMPLEADOS"); //HECHO COMPLETO
		opcionesvalidas.add("GESTION OFICINAS"); //HECHO COMPLETO
		opcionesvalidas.add("ALQUILAR VEHICULO");
		opcionesvalidas.add("DEVOLUCION VEHICULO");
		opcionesvalidas.add("VOLVER");
		
		ArrayList<String> indice = new ArrayList<String>();
		indice.add("1");
		indice.add("2");
		indice.add("3");
		indice.add("4");
		indice.add("5");
		indice.add("6");
		indice.add("7");
		
		while (posicion != 6) {
//			interfaz.mostrarOpcionesMenu(opcionesvalidas, indice);
//			posicion = comprobarOpcion (indice, interfaz.pedirOpcionMenu());
			posicion = leer_comprobar_opcion.leer_comprobar_opcion_menu(opcionesvalidas, indice);
			opcionEscogidaMenuGestion(posicion);
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
	
	private static void opcionEscogidaMenuGestion(int posicion) {
		switch(posicion) {
		case 0:
			//VEHICULOS
			menu_vehiculo.construirMenuVehiculo();
			break;
		case 1:
			//CLIENTES
			menu_cliente.construirMenuCliente();
			break;
		case 2:
			//EMPLEADOS
			menu_empleado.construirMenuEmpleado();
			break;
		case 3:
			//OFICINAS
			menu_oficina.construirMenuOficina();
			break;
		case 4:
			//ALQUILAR VEHICULO
			interfaz.continuarPregunta();
			break;
		case 5:
			//DEVOLUCION VEHICULO
			interfaz.continuarPregunta();
			break;
		case 6:
			//VOLVER
			break;
		}
	}

}
