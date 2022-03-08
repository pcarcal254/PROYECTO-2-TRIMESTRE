package clases;

import metodos.interfaz;

public class Cliente extends Persona{
	private static final long serialVersionUID = 5;
	
	private String carnet;
	private String tarjeta;
	
	/**
	 * Constructor de la clase Cliente que recoge los datos generales de la clase Persona
	 * @param p -> PERSONA QUE NOS PROPORCIONA LOS DATOS GENERALES DE UNA PERSONA
	 * @param carnet -> CARNET DE CONDUCIR DEL CLIENTE
	 * @param tarjeta -> TARJETA DE CLIENTE
	 */
	public Cliente(Persona p, String carnet, String tarjeta) {
		super(p.getDni(), p.getNom(), p.getApe1(), p.getApe2(), p.getF_nac());
		this.carnet = carnet;
		this.tarjeta = tarjeta;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	@Override
	public String toString() {
		String cadena = nombreCompleto().toUpperCase()+" CON DNI: "+this.getDni()+" CON TARJETA DE CLIENTE: "+this.tarjeta;
		return cadena;
	}
	
	/**
	 * Escribe por pantalla la ficha del cliente
	 */
	@Override
	public void fichaPersona() {
		super.fichaPersona();
		System.out.println("ES CLIENTE CON CARNET: "+this.carnet.toUpperCase()+" Y SU TARJETA DE CLIENTE ES "+this.tarjeta.toUpperCase());
		interfaz.pinta_raya();
	}
	
}
