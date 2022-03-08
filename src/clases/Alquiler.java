package clases;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Alquiler implements Serializable{
	private static final long serialVersionUID = 17;
	
	private String matricula;
	private String nom_emple;
	private String tarjeta_cliente;
	private GregorianCalendar f_inicio;
	private GregorianCalendar f_fin;
	private String cod_ofi_dev;
	private int porcentaje_categoria;
	private String tipo_vehiculo;
	private double precio_final;
	
	/**
	 * CREA LA FICHA DEL ALQUILER DEL COCHE
	 * @param matricula -> MATRICULA DEL COCHE A ALQUILAR
	 * @param nom_emple -> NOMBRE DEL EMPLEADO QUE ALQUILA EL COCHE
	 * @param tarjeta_cliente -> TARJETA DEL CLIENTE QUE ALQUILA EL COCHE
	 * @param f_inicio -> FECHA DE INICIO EN LA QUE SE ALQUILA EL COCHE
	 * @param f_fin -> FECHA DE FIN EN LA QUE ALQUILA EL COCHE
	 * @param cod_ofi_dev -> CODIGO DE LA OFICINA DE DEVOLUCION
	 * @param categoria_vehiculo 
	 * @param tipo_vehiculo -> TIPO DE VEHICULO: COCHECONV / FURGONETA / COCHEELEC / MOTO
	 * @param precio_final -> PRECIO FINAL DEL ALQUILER TRAS EL CALCULO TOTAL DE %
	 */
	public Alquiler(String matricula, String nom_emple, String tarjeta_cliente, GregorianCalendar f_inicio,
			GregorianCalendar f_fin, String cod_ofi_dev, int porcentaje_categoria, String tipo_vehiculo, double precio_final) {
		super();
		this.matricula = matricula;
		this.nom_emple = nom_emple;
		this.tarjeta_cliente = tarjeta_cliente;
		this.f_inicio = f_inicio;
		this.f_fin = f_fin;
		this.cod_ofi_dev = cod_ofi_dev;
		this.porcentaje_categoria = porcentaje_categoria;
		this.tipo_vehiculo = tipo_vehiculo;
		this.precio_final = precio_final;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNom_emple() {
		return nom_emple;
	}

	public String getTarjeta_cliente() {
		return tarjeta_cliente;
	}

	public GregorianCalendar getF_inicio() {
		return f_inicio;
	}

	public GregorianCalendar getF_fin() {
		return f_fin;
	}

	public String getCod_ofi_dev() {
		return cod_ofi_dev;
	}

	public int getPorcentaje_categoria() {
		return porcentaje_categoria;
	}

	public String getTipo_vehiculo() {
		return tipo_vehiculo;
	}

	public double getPrecio_final() {
		return precio_final;
	}
	
}
