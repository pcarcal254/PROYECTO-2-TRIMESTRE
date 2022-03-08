package menus;

import java.util.ArrayList;
import java.util.Scanner;

public class leer_comprobar_opcion {
	
	public static int leer_comprobar_opcion_menu(ArrayList<String> opcionesvalidas, ArrayList<String> indice) {
		
//		public static void mostrarOpcionesMenu (ArrayList<String> opcionesvalidas, ArrayList<String> indice) {
			System.out.println("SELECCIONA UNA OPCION DEL SIGUIENTE MENU");
			for (int i=0; i<opcionesvalidas.size(); i++) {
				System.out.print(indice.get(i) + " - ");
				System.out.println(opcionesvalidas.get(i));
			}
//		}
		
//		private static int comprobarOpcion (ArrayList<String> indice, String opcionpasada) {
			
			String opcionusuario;

			Scanner leer = new Scanner(System.in);

			opcionusuario = leer.nextLine();
			
			int posicion = - 1;
			
			for (int i = 0; i<indice.size(); i++) {
				if (opcionusuario.equalsIgnoreCase(indice.get(i))){
					posicion = i;
					break;
				}
			}
			return posicion;
//		}
		
	}

}
