package clases;

import java.io.Serializable;

public class Convencional extends Vehiculo implements Serializable{
	private static final long serialVersionUID = 9;
	/*
	- Consumo (litros/100 kms)
	- Potencia (CV, es un entero)
	- Nivel de emisiones (A/B/C)
	 */
	private double litros_km;
	private int potencia;
	private String lvl_emisiones;
	
	/**
	 * Constructor de la clase Convencional que recoge los datos generales de Vehiculo
	 * @param v -> VEHICULO QUE NOS PROPORCIONA LOS DATOS GENERALES
	 * @param litros_km -> CONSUMO DEL VEHICULO CONVENCIONAL EN LITROS/KM
	 * @param potencia -> POTENCIA DEL VEHICULO CONVENCIONAL EN CV
	 * @param lvl_emisiones -> NIVEL DE EMISIONES DEL COCHE CONVENCIONAL
	 */
	public Convencional(Vehiculo v, double litros_km, int potencia, String lvl_emisiones) {
		super(v.getMatricula(), v.getMarca(), v.getModelo(), v.getColor(), v.getF_alta_vehi(),
			 v.getKms(), v.getCategoria(), v.getUbi_nom_ofi());
		this.litros_km = litros_km;
		this.potencia = potencia;
		this.lvl_emisiones = lvl_emisiones;
	}

	public double getLitros_km() {
		return litros_km;
	}

	public void setLitros_km(double litros_km) {
		this.litros_km = litros_km;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getLvl_emisiones() {
		return lvl_emisiones;
	}

	public void setLvl_emisiones(String lvl_emisiones) {
		this.lvl_emisiones = lvl_emisiones;
	}
	
	@Override
	public void fichaVehiculo() {
		super.fichaVehiculo();
		System.out.println("DE TIPO CONVENCIONAL CON UN CONSUMO DE "+this.litros_km+" L/KMS, UNA POTENCIA "+
				" DE "+this.potencia+" CVS Y UN NIVEL DE EMISIONES DE "+this.lvl_emisiones.toUpperCase());
	}
	
}
