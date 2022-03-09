package clases;

import java.io.Serializable;
import java.util.GregorianCalendar;

import metodos.interfaz;

public class Vehiculo implements Serializable{
	private static final long serialVersionUID = 4;
	
	/*- Matrícula
	- Marca
	- Modelo
	- Color
	- Fecha alta/adquisición
	- Kms (que irán variando, según se explica más adelante, al darlo de alta pudiera ser que sea cero o que el vehículo ya venga con algunos kms)
	- Categoría (ver más adelante) FORMATO CATEGORIA
	- Ubicación (Oficina) en que encuentra (cuando no está alquilado)*/

	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private GregorianCalendar f_alta_vehi;
	private int kms;
	private Categoria categoria;
	private String ubi_nom_ofi;
	
	/**
	 * CREA UN VEHICULO
	 * @param matricula -> MATRICULA DEL VEHICULO
	 * @param marca -> MARCA DEL VEHICULO
	 * @param modelo -> MODELO DEL VEHICULO
	 * @param color -> COLOR DEL VEHICULO
	 * @param f_alta_vehi -> FECHA EN LA QUE EL VEHICULO SE DA DEL ALTA
	 * @param kms -> KMS DEL VEHICULO
	 * @param categoria -> CATEGORIA DEL VEHICULO
	 * @param ubi_nom_ofi -> UBICACION DONDE SE ENCUENTRA DEL VEHICULO
	 */
	public Vehiculo(String matricula, String marca, String modelo, String color, GregorianCalendar f_alta_vehi,
			 int kms, Categoria categoria, String ubi_nom_ofi) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.f_alta_vehi = f_alta_vehi;
		this.kms = kms;
		this.categoria = categoria;
		this.ubi_nom_ofi = ubi_nom_ofi;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public GregorianCalendar getF_alta_vehi() {
		return f_alta_vehi;
	}

	public void setF_alta_vehi(GregorianCalendar f_alta_vehi) {
		this.f_alta_vehi = f_alta_vehi;
	}

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getUbi_nom_ofi() {
		return ubi_nom_ofi;
	}

	public void setUbi_nom_ofi(String ubi_nom_ofi) {
		this.ubi_nom_ofi = ubi_nom_ofi;
	}

	@Override
	public String toString() {
		String cadena = "VEHICULO CON MATRICULA: "+this.matricula+" MARCA: "+this.marca+" SE ENCUENTRA EN LA OFICINA: "+this.ubi_nom_ofi;
		return cadena;
	}
	
	@Override
	public boolean equals(Object obj) {
		Vehiculo a = (Vehiculo) obj;
		if (a.getMatricula().equals(this.matricula)){
			return true;
		} else {
			return false;
		}
	}
	
	public void fichaVehiculo() {
		interfaz.pinta_raya();
		System.out.println("VEHICULO CON MATRICULA: "+this.matricula+" MARCA: "+this.marca+" SE ENCUENTRA EN LA OFICINA: "+this.ubi_nom_ofi);
	}
	
	public int compareTo(Vehiculo v) {
		int resultado=0;
		resultado = this.matricula.compareTo(v.getMatricula());
		return resultado;
	}
	
}
