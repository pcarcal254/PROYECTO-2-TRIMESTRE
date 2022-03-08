package clases;

import java.io.Serializable;
import java.util.GregorianCalendar;

import metodos.interfaz;

public class Empleado extends Persona implements Serializable{
	private static final long serialVersionUID = 6;
	
	private GregorianCalendar f_alta;
	private String nom_ofi;
	
	public Empleado(Persona p, GregorianCalendar f_alta, String nom_ofi) {
		super(p.getDni(), p.getNom(), p.getApe1(), p.getApe2(), p.getF_nac());
		this.f_alta = f_alta;
		this.nom_ofi = nom_ofi;
	}

	public GregorianCalendar getF_alta() {
		return f_alta;
	}

	public void setF_alta(GregorianCalendar f_alta) {
		this.f_alta = f_alta;
	}

	public String getNom_ofi() {
		return nom_ofi;
	}

	public void setNom_ofi(String nom_ofi) {
		this.nom_ofi = nom_ofi;
	}
	
	@Override
	public String toString() {
		String cadena = nombreCompleto().toUpperCase()+" CON DNI: "+this.getDni()+" TRABAJA EN LA OFICINA: "+this.nom_ofi;
		return cadena;
	}
	
	@Override
	public void fichaPersona() {
		super.fichaPersona();
		System.out.println("ES EMPLEADO DE LA OFICINA "+this.nom_ofi.toUpperCase()+" DADO DE ALTA EN "+this.f_alta);
		interfaz.pinta_raya();
	}
	
}
