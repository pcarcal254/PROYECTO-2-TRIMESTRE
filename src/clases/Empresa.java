package clases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import main.main;
import metodos.interfaz;
import metodos.programa;

public class Empresa implements Serializable{
	private static final long serialVersionUID = 1;	
	
	private String nom_empresa;
	private ArrayList<Cliente> lista_clientes;
	private ArrayList<Empleado> plantilla_emple;
	private ArrayList<Oficina> lista_oficinas;
	private ArrayList<Vehiculo> lista_vehiculos;
	
	public Empresa(String nom_empresa, ArrayList<Cliente> lista_clientes, ArrayList<Empleado> plantilla_emple,
			ArrayList<Oficina> lista_oficinas, ArrayList<Vehiculo> lista_vehiculos) {
		super();
		this.nom_empresa = nom_empresa;
		this.lista_clientes = lista_clientes;
		this.plantilla_emple = plantilla_emple;
		this.lista_oficinas = lista_oficinas;
		this.lista_vehiculos = lista_vehiculos;
	}
	
	public Empresa(String nom_empresa) {
		this.nom_empresa = nom_empresa;
		lista_clientes = new ArrayList<Cliente>();
		plantilla_emple = new ArrayList<Empleado>();
		lista_oficinas = new ArrayList<Oficina>();
		lista_vehiculos = new ArrayList<Vehiculo>();
	}
	
	public String getNom_empresa() {
		return nom_empresa;
	}

	public ArrayList<Cliente> getLista_clientes() {
		return lista_clientes;
	}

	public void setLista_clientes(ArrayList<Cliente> lista_clientes) {
		this.lista_clientes = lista_clientes;
	}

	public ArrayList<Empleado> getPlantilla_emple() {
		return plantilla_emple;
	}

	public void setPlantilla_emple(ArrayList<Empleado> plantilla_emple) {
		this.plantilla_emple = plantilla_emple;
	}

	public ArrayList<Oficina> getLista_oficinas() {
		return lista_oficinas;
	}

	public void setLista_oficinas(ArrayList<Oficina> lista_oficinas) {
		this.lista_oficinas = lista_oficinas;
	}
	
	public ArrayList<Vehiculo> getLista_vehiculos() {
		return lista_vehiculos;
	}

	public void setLista_vehiculos(ArrayList<Vehiculo> lista_vehiculos) {
		this.lista_vehiculos = lista_vehiculos;
	}

	public void anade_vehiculo(Vehiculo v) {
		lista_vehiculos.add(v);
	}
	
	public void anade_cliente(Cliente c) {
		lista_clientes.add(c);
	}
	
	public void anade_empleado(Empleado emple) {
		plantilla_emple.add(emple);
	}
	
	public void anade_oficina(Oficina o) {
		lista_oficinas.add(o);
	}
	
	public static Empresa leer_crear_empresa(boolean primera_vez) {
		if (!primera_vez) {
			Empresa nueva_empresa = programa.crear_empresa();
			try {
		         FileOutputStream fileOut =
		         new FileOutputStream("empresa.ser");
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		         out.writeObject(nueva_empresa);
		         out.close();
		         fileOut.close();
		      } catch (IOException i) {
		         i.printStackTrace();
		      }
			return nueva_empresa;
		} else {
			try {
		         FileInputStream fileIn = new FileInputStream("empresa.ser");
		         ObjectInputStream in = new ObjectInputStream(fileIn);
		         Empresa nueva_empresa = (Empresa) in.readObject();
		         in.close();
		         fileIn.close();
		         programa.volcado_de_datos(nueva_empresa);
				 return nueva_empresa;
		      } catch (IOException i) {
		         i.printStackTrace();
		         return null;
		      } catch (ClassNotFoundException c) {
		         System.out.println("CLASE EMPRESA NO CREADA");
		         c.printStackTrace();
		         return null;
		      }
		}
	}
	
	private static Empresa crear_empresa() {
		String nom_empresa = interfaz.pedir_empresa();
		Empresa emp = new Empresa(nom_empresa);
		return emp;
	}
	
	public static void grabarEmpresa(Empresa emp) {
	      try {
	         FileOutputStream fileOut =
	         new FileOutputStream("empresa.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(emp);
	         out.close();
	         fileOut.close();
	         System.out.printf("DATOS GUARDADOS EN empresa.ser");
	         System.out.println("");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	}
	
}
