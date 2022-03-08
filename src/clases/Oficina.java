package clases;

import java.io.Serializable;

import metodos.interfaz;

public class Oficina implements Serializable{
	
	private static final long serialVersionUID = 2;
	/*
	- Código (es un alfanumérico de 4 letras : JA01, MA10…)
	- Descripción (“Jaén estación de trenes”, “Málaga principal”
	- Localidad
	- Provincia
	- Si es o no oficina de aeropuerto (porque esto supone un recargo en los alquileres, según se explica más adelante)
	*/
	
	private String cod_ofi;
	private String desc_ofi;
	private String localidad;
	private String provincia;
	private boolean ofi_aeropuerto;
	
	/**
	 * Constructor de la clase Oficina
	 * @param cod_ofi
	 * @param desc_ofi
	 * @param localidad
	 * @param provincia
	 * @param ofi_aeropuerto
	 */
	public Oficina(String cod_ofi, String desc_ofi, String localidad, String provincia, boolean ofi_aeropuerto) {
		super();
		this.cod_ofi = cod_ofi;
		this.desc_ofi = desc_ofi;
		this.localidad = localidad;
		this.provincia = provincia;
		this.ofi_aeropuerto = ofi_aeropuerto;
	}

	public String getCod_ofi() {
		return cod_ofi;
	}

	public void setCod_ofi(String cod_ofi) {
		this.cod_ofi = cod_ofi;
	}

	public String getDesc_ofi() {
		return desc_ofi;
	}

	public void setDesc_ofi(String desc_ofi) {
		this.desc_ofi = desc_ofi;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public boolean isOfi_aeropuerto() {
		return ofi_aeropuerto;
	}

	public void setOfi_aeropuerto(boolean ofi_aeropuerto) {
		this.ofi_aeropuerto = ofi_aeropuerto;
	}
	
	public boolean equals(Oficina o) {
		if (o.getCod_ofi().equals(cod_ofi)){
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String cadena = "OFICINA CON CODIGO: "+this.cod_ofi+" SE ENCUENTRA EN "+this.localidad;
		return cadena;
	}
	
	public int compareTo(Oficina o) {
		int resultado=0;
		resultado = this.localidad.compareTo(o.getLocalidad());
		return resultado;
	}

	public void fichaOficina() {
		interfaz.pinta_raya();
		System.out.println("LA OFICINA CON CODIGO "+cod_ofi.toUpperCase()+" SE ENCUENTRA UBICADA EN "+
							"LA LOCALIDAD DE "+localidad.toUpperCase());
		interfaz.pinta_raya();
	}

}
