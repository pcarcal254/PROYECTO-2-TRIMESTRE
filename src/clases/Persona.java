package clases;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

import metodos.interfaz;

public class Persona implements Serializable{
	private static final long serialVersionUID = 3;
	
	private String dni;
	private String nom;
	private String ape1;
	private String ape2;
	private GregorianCalendar f_nac;
	
	/**
	 * Constructor de la clase Persona
	 * @param dni -> DNI DE UNA PERSONA
	 * @param nom -> NOMBRE DE UNA PERSONA
	 * @param ape1 -> APELLIDO 1 DE UNA PERSONA
	 * @param ape2 -> APELLIDO 2 DE UNA PERSONA
	 * @param f_nac -> FECHA DE NACIMIENTO DE UNA PERSONA
	 */
	public Persona(String dni, String nom, String ape1, String ape2, GregorianCalendar f_nac) {
		super();
		this.dni = dni;
		this.nom = nom;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.f_nac = f_nac;
	}

	public Persona(String dni, String nom, String ape1) {
		super();
		this.dni = dni;
		this.nom = nom;
		this.ape1 = ape1;
	}
	
//	public Persona(Persona p) {
//		Persona b = new Persona(p.getDni(), p.getNom(), p.getApe1(), p.getApe2(), p);
//	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public String getDni() {
		return dni;
	}
	
	public void setF_nac(GregorianCalendar f_nac) {
		this.f_nac = f_nac;
	}

	public GregorianCalendar getF_nac() {
		return f_nac;
	}
	
//	@Override
	public boolean equals(Persona a) {
//		Persona a = (Persona) obj;
		if (a.getDni().equals(this.dni)){
			return true;
		} else {
			return false;
		}
	}
	
	public String nombreCompleto() {
		String nombre;
		nombre = ape1+", "+nom;
		return nombre;
	}
	
	@Override
	public String toString() {
		String cadena = nombreCompleto().toUpperCase()+" CON DNI: "+this.dni;
		return cadena;
	}
	
	public void fichaPersona() {
		interfaz.pinta_raya();
		System.out.println("DNI: "+this.dni.toUpperCase()+" NOMBRE: "+this.nom.toUpperCase()+" APELLIDO 1: "+this.ape1.toUpperCase()+" APELLIDO 2: "+this.ape2.toUpperCase()+" FECHA DE NACIMIENTO: "+this.f_nac);
	}
	
	public int compareTo(Persona p) {
		int resultado=0;
		resultado = this.nombreCompleto().compareTo(p.nombreCompleto());
		return resultado;
	}
	
	public int getEdad() {
		int edad=0;
		edad = GregorianCalendar.YEAR - this.f_nac.get(Calendar.YEAR);
		return edad;
	}

}
