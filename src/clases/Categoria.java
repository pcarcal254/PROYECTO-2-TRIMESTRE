package clases;

import java.io.Serializable;

public class Categoria implements Serializable{
	private static final long serialVersionUID = 16;
	/*- cod (1 letra: A, B, C, D)
	- descripción (ECONOMICO, MEDIO, PREMIUM)
	- % de recargo que supone en los alquileres*/
	private String cod;
	private String descripcion;
	private int porcentaje;
	
	public Categoria(String cod, String descripcion, int porcentaje) {
		super();
		this.cod = cod;
		this.descripcion = descripcion;
		this.porcentaje = porcentaje;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	
}
