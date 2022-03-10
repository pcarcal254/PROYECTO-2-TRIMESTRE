package clases;

import java.io.Serializable;

import metodos.interfaz;

public class Moto extends Electrico implements Serializable{
	private static final long serialVersionUID = 10;
	/*
	- Cilindrada
	- Carnet requerido (AM/A1/A2)
	*/
	
	private int cilindrada;
	private String carnet_req;
	
	/**
	 * Constructor de la clase Moto que recoge los datos generales de la clase Electrico
	 * @param v
	 * @param cilindrada
	 * @param carnet_req
	 */
	public Moto(Electrico v, int cilindrada, String carnet_req) {
		super(v, v.getAutonomia(), v.getTiempo_recarga());
		this.cilindrada = cilindrada;
		this.carnet_req = carnet_req;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getCarnet_req() {
		return carnet_req;
	}

	public void setCarnet_req(String carnet_req) {
		this.carnet_req = carnet_req;
	}
	
	@Override
	public void fichaVehiculo() {
		super.fichaVehiculo();
		System.out.println("ES UNA MOTO DE "+this.cilindrada
				+" CILINDRADAS Y REQUIERE DE UN CARNET DE TIPO "+this.carnet_req.toUpperCase());
		interfaz.pinta_raya();
	}
	
}
