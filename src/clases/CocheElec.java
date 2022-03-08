package clases;

import java.io.Serializable;

public class CocheElec extends Electrico implements Serializable{
	private static final long serialVersionUID = 11;
	/*
	- N.º de plazas
	- Tipo (Deportivo, Familiar, 4x4)
	*/
	
	private int num_plazas_elec;
	private String tipo_elec;
	
	/**
	 * Constructor de la clase CocheElec que recoge los datos generales de la clase Electrico
	 * @param v -> VEHICULO QUE NOS PROPORCIONA LOS DATOS GENERALES
	 * @param num_plazas -> NUMERO DE PLAZAS DEL COCHE CONVENCIONAL
	 * @param tipo -> TIPO COCHE CONVENCIONAL
	 */
	public CocheElec(Electrico v, int num_plazas, String tipo) {
		super(v, v.getAutonomia(), v.getTiempo_recarga());
		this.num_plazas_elec = num_plazas;
		this.tipo_elec = tipo;
	}

	public int getNum_plazas_elec() {
		return num_plazas_elec;
	}

	public void setNum_plazas_elec(int num_plazas_elec) {
		this.num_plazas_elec = num_plazas_elec;
	}

	public String getTipo_elec() {
		return tipo_elec;
	}

	public void setTipo_elec(String tipo_elec) {
		this.tipo_elec = tipo_elec;
	}
	
	@Override
	public void fichaVehiculo() {
		super.fichaVehiculo();
		System.out.println("ES UN COCHE ELÉCTRICO DE "+this.num_plazas_elec+" NÚMERO DE PLAZAS Y DE TIPO "+this.tipo_elec);
	}
	
}
