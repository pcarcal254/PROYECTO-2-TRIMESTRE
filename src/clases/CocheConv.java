package clases;

import java.io.Serializable;

import metodos.interfaz;

public class CocheConv extends Convencional implements Serializable{
	private static final long serialVersionUID = 12;
	/*
	- N.º de plazas
	- Tipo (Deportivo, Familiar, 4x4)
	 */
	private int num_plazas_conv;
	private String tipo_conv;
	
	/**
	 * Constructor de la clase CocheConv que recoge los datos generales de la clase Convencional
	 * @param v -> VEHICULO QUE NOS PROPORCIONA LOS DATOS GENERALES
	 * @param num_plazas -> NUMERO DE PLAZAS DEL COCHE CONVENCIONAL
	 * @param tipo -> TIPO COCHE CONVENCIONAL
	 */
	public CocheConv(Convencional v, int num_plazas, String tipo) {
		super(v, v.getLitros_km(), v.getPotencia(), v.getLvl_emisiones());
		this.num_plazas_conv = num_plazas;
		this.tipo_conv = tipo;
	}

	public int getNum_plazas() {
		return num_plazas_conv;
	}

	public void setNum_plazas(int num_plazas) {
		this.num_plazas_conv = num_plazas;
	}

	public String getTipo() {
		return tipo_conv;
	}

	public void setTipo(String tipo) {
		this.tipo_conv = tipo;
	}
	
	@Override
	public void fichaVehiculo() {
		super.fichaVehiculo();
		System.out.println("ES UN COCHE CONVENCIONAL DE "+this.num_plazas_conv+" NÚMERO DE PLAZAS Y DE TIPO "+this.tipo_conv);
		interfaz.pinta_raya();
	}
	
}
