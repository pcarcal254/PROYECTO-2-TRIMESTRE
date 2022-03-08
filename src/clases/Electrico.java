package clases;

import java.io.Serializable;

public class Electrico extends Vehiculo implements Serializable{
	private static final long serialVersionUID = 8;
	/*
	- Autonomia (kms)
	- Tiempo de recarga (min)
	 */
	
	private int autonomia;
	private int tiempo_recarga;
	
	/**
	 * Constructor de la clase Electrico que recoge los datos generales de Vehiculo
	 * @param v -> VEHICULO QUE NOS PROPORCIONA LOS DATOS GENERALES
	 * @param autonomia -> AUTONOMIA DE VEHICULO ELECTRICO EN KMS
	 * @param tiempo_recarga -> TIEMPO QUE TARDA EL VEHICULO ELECTRICO EN REGARGAR
	 */
	public Electrico(Vehiculo v, int autonomia, int tiempo_recarga) {
		super(v.getMatricula(), v.getMarca(), v.getModelo(), v.getColor(), v.getF_alta_vehi(),
				 v.getKms(), v.getCategoria(), v.getUbi_nom_ofi());		this.autonomia = autonomia;
		this.tiempo_recarga = tiempo_recarga;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	public int getTiempo_recarga() {
		return tiempo_recarga;
	}

	public void setTiempo_recarga(int tiempo_recarga) {
		this.tiempo_recarga = tiempo_recarga;
	}
	
	@Override
	public void fichaVehiculo() {
		super.fichaVehiculo();
		System.out.println("DE TIPO ELECTRICO CON UN TIEMPO DE RECARGA "+this.tiempo_recarga+" MINS Y UNA AUTONOMIA "+
				" DE "+this.autonomia+" KMS");
	}
	
}
