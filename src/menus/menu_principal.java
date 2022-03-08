package menus;

import java.util.ArrayList;

import clases.Empresa;
import metodos.interfaz;

public class menu_principal {
	
	public static void construirMenuPrincipal () {
			
			int posicion = -1;
			ArrayList<String> opcionesvalidas = new ArrayList<String>();
			opcionesvalidas.add("GESTIONAR EMPRESA");
			opcionesvalidas.add("LISTAR DATOS DE ALQUILERES");
			opcionesvalidas.add("LISTAR DATOS DE COCHES");
			opcionesvalidas.add("LISTAR DATOS DE CLIENTES");
			opcionesvalidas.add("LISTAR DATOS DE EMPLEADOS");
			opcionesvalidas.add("LISTAR DATOS DE OFICINA");
			opcionesvalidas.add("SALIR");
			
			ArrayList<String> indice = new ArrayList<String>();
			indice.add("1");
			indice.add("2");
			indice.add("3");
			indice.add("4");
			indice.add("5");
			indice.add("6");
			indice.add("7");
			
			while (posicion != 6) {
//				interfaz.mostrarOpcionesMenu(opcionesvalidas, indice);
//				posicion = comprobarOpcion (indice, interfaz.pedirOpcionMenu());
				posicion = leer_comprobar_opcion.leer_comprobar_opcion_menu(opcionesvalidas, indice);
				opcionEscogidaMenuPrincipal(posicion);
			}
		}
	
//	private static int comprobarOpcion (ArrayList<String> indice, String opcionpasada) {
//			
//			int posicion = - 1;
//			
//			for (int i = 0; i<indice.size(); i++) {
//				if (opcionpasada.equalsIgnoreCase(indice.get(i))){
//					posicion = i;
//					break;
//				}
//			}
//			return posicion;
//	}
	
	private static void opcionEscogidaMenuPrincipal(int posicion) {
		switch(posicion) {
		case 0:
			/**
			 * GESTIONA LA EMPRESA EN GENERAL
			 */
			//GESTIONAR EMPRESA
			menu_gestion.construirMenuGestion();
			//interfaz.continuarPregunta();
			break;
		case 1:
			/**
			 * LISTA TODOS LOS ALQUILERES
			 */
			//LISTAR DATOS DE ALQUILERES
			interfaz.continuarPregunta();
			break;
		case 2:
			/**
			 * LISTA TODOS LOS COCHES
			 */
			//LISTAR DATOS DE COCHES
			interfaz.mostrar_lista_vehiculos();
			//interfaz.continuarPregunta();
			break;
		case 3:
			/**
			 * LISTA TODOS LOS CLIENTES
			 */
			//LISTAR DATOS DE CLIENTES
			interfaz.mostrar_lista_clientes();
			//interfaz.continuarPregunta();
			break;
		case 4:
			/**
			 * LISTA TODOS LOS EMPLEADOS
			 */
			//LISTAR DATOS DE EMPLEADOS
			interfaz.mostrar_lista_empleado();
			//interfaz.continuarPregunta();
			break;
		case 5:
			/**
			 * LISTA TODOS LAS OFICINAS
			 */
			//LISTAR DATOS DE OFICINA
			interfaz.mostrar_lista_oficina();
			//interfaz.continuarPregunta();
			break;
		case 6:
			//SALIR
			Empresa.grabarEmpresa(main.main.nuestra_empresa);
			interfaz.finalPrograma();
			System.exit(0);
			break;
		}
	}

}
