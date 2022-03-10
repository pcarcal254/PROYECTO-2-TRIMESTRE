package menus;

import java.util.ArrayList;

import clases.CocheConv;
import clases.CocheElec;
import clases.Furgoneta;
import clases.Moto;
import clases.Vehiculo;
import metodos.interfaz;
import metodos.modificar_datos_vehiculo;

public class menu_modificar_vehiculo {
	
	static boolean iscocheconv = false;
	static boolean isfurgoneta = false;
	static boolean iscocheelec = false;
	static boolean ismoto = false;
	
	public static void construirMenuModificarVehiculo (String clase_tipo, String clase_final, Vehiculo v) {
		/*- Matrícula
		- Marca
		- Modelo
		- Color
		- Fecha alta/adquisición
		- Kms (que irán variando, según se explica más adelante, al darlo de alta pudiera ser que sea cero o que el vehículo ya venga con algunos kms)
		- Categoría (ver más adelante) FORMATO CATEGORIA
		- Ubicación*/
		
		int posicion = -1;
		ArrayList<String> opcionesvalidas = new ArrayList<String>();
		opcionesvalidas.add("MODIFICAR MATRICULA");
		opcionesvalidas.add("MODIFICAR MARCA");
		opcionesvalidas.add("MODIFICAR MODELO");
		opcionesvalidas.add("MODIFICAR COLOR");
		opcionesvalidas.add("MODIFICAR FECHA ALTA/ADQUISICION");
		opcionesvalidas.add("MODIFICAR KMS");
		opcionesvalidas.add("MODIFICAR CATEGORIA");
		opcionesvalidas.add("MODIFICAR UBICACION");
		
		if (clase_tipo.toString().equalsIgnoreCase("CLASES.CONVENCIONAL")) {
			opcionesvalidas.add("MODIFICAR CONSUMO");
			opcionesvalidas.add("MODIFICAR POTENCIA");
			opcionesvalidas.add("MODIFICAR NIVEL EMISIONES");
			if (clase_final.equalsIgnoreCase("CLASES.FURGONETA")) {
				opcionesvalidas.add("MODIFICAR CAPACIDAD DE CARGA");
				opcionesvalidas.add("MODIFICAR CARNET REQUERIDO");
				isfurgoneta = true;
			} else if (clase_final.equalsIgnoreCase("CLASES.COCHECONV")) {
				opcionesvalidas.add("MODIFICAR NUMERO DE PLAZAS");
				opcionesvalidas.add("MODIFICAR TIPO");
				iscocheconv = true;
			}
		} else if (clase_tipo.equalsIgnoreCase("CLASES.ELECTRICO")) {
			opcionesvalidas.add("MODIFICAR AUTONOMIA");
			opcionesvalidas.add("MODIFICAR TIEMPO DE RECARGA");
			if (clase_final.equalsIgnoreCase("CLASES.MOTO")) {
				opcionesvalidas.add("MODIFICAR CILINDRADA");
				opcionesvalidas.add("MODIFICAR CARNET REQUERIDO");
				ismoto = true;
			} else if (clase_final.equalsIgnoreCase("CLASES.COCHEELEC")) {
				opcionesvalidas.add("MODIFICAR NUMERO DE PLAZAS");
				opcionesvalidas.add("MODIFICAR TIPO");
				iscocheelec = true;
			}
		}
		
		opcionesvalidas.add("SALIR");
		
		int total_opciones = opcionesvalidas.size();
		ArrayList<String> indice = new ArrayList<String>();
		
		for (int i=0; i<total_opciones; i++) {
			indice.add(""+(i+1));
		}
		
		while (posicion != (total_opciones-1)) {
//			interfaz.mostrarOpcionesMenu(opcionesvalidas, indice);
//			posicion = comprobarOpcion (indice, interfaz.pedirOpcionMenu());
			posicion = leer_comprobar_opcion.leer_comprobar_opcion_menu(opcionesvalidas, indice);
			opcionEscogidaMenuModificarVehiculo(posicion, v);
		}
	}
	
	private static void opcionEscogidaMenuModificarVehiculo(int posicion, Vehiculo v) {
		if (iscocheconv) {
			CocheConv cc  = (CocheConv)v;
			modificar_datos_vehiculo.switch_modifica_datos_cocheconv(posicion, cc);
		} else if (isfurgoneta) {
			Furgoneta f = (Furgoneta)v;
			modificar_datos_vehiculo.switch_modifica_datos_furgoneta(posicion, f);
		} else if (iscocheelec) {
			CocheElec ce = (CocheElec)v;
			modificar_datos_vehiculo.switch_modifica_datos_cocheelec(posicion, ce);
		} else if (ismoto) {
			Moto m = (Moto)v;
			modificar_datos_vehiculo.switch_modifica_datos_moto(posicion, m);
		}
	}
	
}
