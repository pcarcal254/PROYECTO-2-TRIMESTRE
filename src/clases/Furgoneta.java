package clases;

import java.io.Serializable;

public class Furgoneta extends Convencional implements Serializable{
	private static final long serialVersionUID = 13;
	/*
	- Capacidad de carga (m³)
	- Carnet requerido (B/C/D)
	 */
	
	private int cap_carga;
	private String carnet_requerido;
	
	/**
	 * Constructor de la clase Furgoneta que recoge los datos generales de la clase Convencional
	 * @param v
	 * @param cap_carga
	 * @param carnet_requerido
	 */
	public Furgoneta(Convencional v, int cap_carga, String carnet_requerido) {
		super(v, v.getLitros_km(), v.getPotencia(), v.getLvl_emisiones());
		this.cap_carga = cap_carga;
		this.carnet_requerido = carnet_requerido;
	}

	public int getCap_carga() {
		return cap_carga;
	}

	public void setCap_carga(int cap_carga) {
		this.cap_carga = cap_carga;
	}

	public String getCarnet_requerido() {
		return carnet_requerido;
	}

	public void setCarnet_requerido(String carnet_requerido) {
		this.carnet_requerido = carnet_requerido;
	}
	
	@Override
	public void fichaVehiculo() {
		super.fichaVehiculo();
		System.out.println("ES UNA FURGONETA CON UNA CAPACIDAD DE CARGA DE "+this.cap_carga+
				" Y REQUIERE DE UN CARNET DE TIPO "+this.carnet_requerido.toUpperCase());
	}
	
}
