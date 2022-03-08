package metodos;

import java.util.GregorianCalendar;

import clases.Categoria;
import clases.CocheConv;
import clases.CocheElec;
import clases.Convencional;
import clases.Electrico;
import clases.Furgoneta;
import clases.Moto;
import clases.Vehiculo;

public class modificar_datos_vehiculo {

	public static void switch_modifica_datos_cocheconv(int posicion, CocheConv cc) {
		switch(posicion) {
			case 0:
				//MODIFICAR MATRICULA
				cambia_matricula(cc);
				break;
			case 1:
				//MODIFICAR MARCA
				cambia_marca(cc);
				break;
			case 2:
				//MODIFICAR MODELO
				cambia_modelo(cc);
				break;
			case 3:
				//MODIFICAR COLOR
				cambia_color(cc);
				break;
			case 4:
				//MODIFICAR FECHA ALTA/ADQUISICION
				cambia_fecha(cc);
				break;
			case 5:
				//MODIFICAR KMS
				cambia_kms(cc);
				break;
			case 6:
				//MODIFICAR CATEGORIA
				cambia_categoria(cc);
				break;
			case 7:
				//MODIFICAR UBICACION
				cambia_ubicacion(cc);
				break;
			case 8:
				//MODIFICAR CONSUMO
				cambia_consumo(cc);
				break;
			case 9:
				//MODIFICAR POTENCIA
				cambia_potencia(cc);
				break;
			case 10:
				//MODIFICAR NIVEL EMISIONES
				cambia_emisiones(cc);
				break;
			case 11:
				//MODIFICAR NUMERO DE PLAZAS
				cambia_num_plazas_cc(cc);
				break;
			case 12:
				//MODIFICAR TIPO
				cambia_tipo_cc(cc);
				break;
			case 13:
				//SALIR
				break;
		}
	}

	public static void switch_modifica_datos_furgoneta(int posicion, Furgoneta f) {
		switch(posicion) {
		case 0:
			//MODIFICAR MATRICULA
			cambia_matricula(f);
			break;
		case 1:
			//MODIFICAR MARCA
			cambia_marca(f);
			break;
		case 2:
			//MODIFICAR MODELO");
			cambia_modelo(f);
			break;
		case 3:
			//MODIFICAR COLOR
			cambia_color(f);
			break;
		case 4:
			//MODIFICAR FECHA ALTA/ADQUISICION
			cambia_fecha(f);
			break;
		case 5:
			//MODIFICAR KMS
			cambia_kms(f);
			break;
		case 6:
			//MODIFICAR CATEGORIA
			cambia_categoria(f);
			break;
		case 7:
			//MODIFICAR UBICACION
			cambia_ubicacion(f);
			break;
		case 8:
			//MODIFICAR CONSUMO
			cambia_consumo(f);
			break;
		case 9:
			//MODIFICAR POTENCIA
			cambia_potencia(f);
			break;
		case 10:
			//MODIFICAR NIVEL EMISIONES
			cambia_emisiones(f);
			break;
		case 11:
			//MODIFICAR CAPACIDAD CARGA
			cambia_cap_carga_f(f);
			break;
		case 12:
			//MODIFICAR CARNET REQUERIDO
			cambia_carnet_req_f(f);
			break;
		case 13:
			//SALIR
			break;
		}	
	}

	public static void switch_modifica_datos_cocheelec(int posicion, CocheElec ce) {
		switch(posicion) {
		case 0:
			//MODIFICAR MATRICULA
			cambia_matricula(ce);
			break;
		case 1:
			//MODIFICAR MARCA
			cambia_marca(ce);
			break;
		case 2:
			//MODIFICAR MODELO");
			cambia_modelo(ce);
			break;
		case 3:
			//MODIFICAR COLOR
			cambia_color(ce);
			break;
		case 4:
			//MODIFICAR FECHA ALTA/ADQUISICION
			cambia_fecha(ce);
			break;
		case 5:
			//MODIFICAR KMS
			cambia_kms(ce);
			break;
		case 6:
			//MODIFICAR CATEGORIA
			cambia_categoria(ce);
			break;
		case 7:
			//MODIFICAR UBICACION
			cambia_ubicacion(ce);
			break;
		case 8:
			//MODIFICAR AUTONOMIA
			cambia_autonomia(ce);
			break;
		case 9:
			//MODIFICAR TIEMPO DE RECARGA
			cambia_tiempo_rec(ce);
			break;
		case 10:
			//MODIFICAR NUMERO DE PLAZAS
			cambia_num_plazas_ce(ce);
			break;
		case 11:
			//MODIFICAR TIPO
			cambia_tipo_ce(ce);
			break;
		case 12:
			//SALIR
			break;
		}	
	}

	public static void switch_modifica_datos_moto(int posicion, Moto m) {
		switch(posicion) {
		case 0:
			//MODIFICAR MATRICULA
			cambia_matricula(m);
			break;
		case 1:
			//MODIFICAR MARCA
			cambia_marca(m);
			break;
		case 2:
			//MODIFICAR MODELO");
			cambia_modelo(m);
			break;
		case 3:
			//MODIFICAR COLOR
			cambia_color(m);
			break;
		case 4:
			//MODIFICAR FECHA ALTA/ADQUISICION
			cambia_fecha(m);
			break;
		case 5:
			//MODIFICAR KMS
			cambia_kms(m);
			break;
		case 6:
			//MODIFICAR CATEGORIA
			cambia_categoria(m);
			break;
		case 7:
			//MODIFICAR UBICACION
			cambia_ubicacion(m);
			break;
		case 8:
			//MODIFICAR AUTONOMIA
			cambia_autonomia(m);
			break;
		case 9:
			//MODIFICAR TIEMPO DE RECARGA
			cambia_tiempo_rec(m);
			break;
		case 10:
			//MODIFICAR CILINDRADA
			cambia_cilindrada_m(m);
			break;
		case 11:
			//MODIFICAR CARNET REQUERIDO
			cambia_carnet_req_m(m);
			break;
		case 12:
			//SALIR
			break;
		}	
	}

	public static void cambia_matricula(Vehiculo v) {
		String matricula = pedir_datos_vehiculo.pedir_matricula();
		v.setMatricula(matricula);
	}

	public static void cambia_marca(Vehiculo v) {
		String marca = pedir_datos_vehiculo.pedir_marca();
		v.setMarca(marca);
	}

	public static void cambia_modelo(Vehiculo v) {
		String modelo = pedir_datos_vehiculo.pedir_modelo();
		v.setModelo(modelo);
	}

	public static void cambia_color(Vehiculo v) {
		String color = pedir_datos_vehiculo.pedir_color();
		v.setColor(color);
	}

	public static void cambia_fecha(Vehiculo v) {
		GregorianCalendar fecha = pedir_datos_vehiculo.pedir_fec_general();
		v.setF_alta_vehi(fecha);
	}

	public static void cambia_kms(Vehiculo v) {
		int kms = pedir_datos_vehiculo.pedir_km();
		v.setKms(kms);
	}

	public static void cambia_categoria(Vehiculo v) {
		Categoria cat = pedir_datos_vehiculo.pedir_categoria();
		v.setCategoria(cat);
	}

	public static void cambia_ubicacion(Vehiculo v) {
		String ubi = pedir_datos_vehiculo.pedir_ubi();
		v.setUbi_nom_ofi(ubi);
	}
	
	public static void cambia_consumo(Convencional c) {
		Double consumo = pedir_datos_vehiculo.pedir_con();
		c.setLitros_km(consumo);
	}
	
	public static void cambia_potencia(Convencional c) {
		int potencia = pedir_datos_vehiculo.pedir_pot();
		c.setPotencia(potencia);
	}
	
	public static void cambia_emisiones(Convencional c) {
		String emisiones = pedir_datos_vehiculo.pedir_emi();
		c.setLvl_emisiones(emisiones);
	}
	
	public static void cambia_num_plazas_cc(CocheConv c) {
		int plazas = pedir_datos_vehiculo.pedir_plazas();
		c.setNum_plazas(plazas);
	}
	
	public static void cambia_tipo_cc(CocheConv c) {
		String tipo = pedir_datos_vehiculo.pedir_tip();
		c.setTipo(tipo);
	}
	
	public static void cambia_cap_carga_f(Furgoneta f) {
		int cap_carga = pedir_datos_vehiculo.pedir_cap();
		f.setCap_carga(cap_carga);
	}
	
	public static void cambia_carnet_req_f(Furgoneta f) {
		String carnet = pedir_datos_vehiculo.pedir_car_req();
		f.setCarnet_requerido(carnet);
	}
	
	public static void cambia_autonomia(Electrico e) {
		int autonomia = pedir_datos_vehiculo.pedir_aut();
		e.setAutonomia(autonomia);
	}
	
	public static void cambia_tiempo_rec(Electrico e) {
		int tiempo = pedir_datos_vehiculo.pedir_tiem_rec();
		e.setTiempo_recarga(tiempo);
	}
	
	public static void cambia_num_plazas_ce(CocheElec ce) {
		int plazas = pedir_datos_vehiculo.pedir_plazas();
		ce.setNum_plazas_elec(plazas);
	}
	
	public static void cambia_tipo_ce(CocheElec ce) {
		String tipo = pedir_datos_vehiculo.pedir_tip();
		ce.setTipo_elec(tipo);
	}
	
	public static void cambia_cilindrada_m(Moto m) {
		int cilindrada = pedir_datos_vehiculo.pedir_cil();
		m.setCilindrada(cilindrada);
	}
	
	public static void cambia_carnet_req_m(Moto m) {
		String carnet = pedir_datos_vehiculo.pedir_car_req2();
		m.setCarnet_req(carnet);
	}

}