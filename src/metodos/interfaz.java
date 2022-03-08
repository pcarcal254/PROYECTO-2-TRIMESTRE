package metodos;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Cliente;
import clases.Empresa;
import clases.Oficina;
import clases.Persona;
import clases.Vehiculo;
import main.main;
import menus.*;

public class interfaz {
	
	static Scanner leer = new Scanner(System.in);
	
	public static void bienvenida() {
		String bienvenida = "BIENVENIDO AL PROGRAMA DE ALQUILER DE VEHICULOS";
		System.out.println(bienvenida);
		subrayaTexto(bienvenida.length(),"*");
	}

	public static void subrayaTexto(int cantidad,String simbolo) {
		for (int i=0; i<cantidad; i++) {
			System.out.print(simbolo);
		}
		System.out.println();
	}
	
	public static void error_usuario() {
		System.out.println("LO SENTIMOS NO TIENE ACCESO A ESTA OPCION");
	}
	
	public static void continuarPregunta() {
		System.out.println("¿QUIERES REALIZAR OTRA ACCION DEL MENU PRINCIPAL?");
		menu_sino.construirMenuSiNo();
	}
	
	public static void finalPrograma() {
		System.out.println("¡GRACIAS POR USAR NUESTRO PROGRAMA!");
	}

	public static void vehiculo_creado() {
		String texto = "VEHICULO CREADO CON EXITO";
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}

	public static String pedir_empresa() {
		System.out.println("INTRODUCE EL NOMBRE DE LA EMPRESA");
		String nom = leer.nextLine();
		return nom;
	}

	public static void muestra_titulo_vehiculos_anadidos(int num_total) {
		String texto = "BUSCANDO EN UN TOTAL DE "+num_total+" DE VEHICULOS";
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}

	public static String muestra_pedir_matricula_vehiculo() {		
		System.out.println("INTRODUCE LA MÁTRICULA DEL COCHE A MODIFICAR");
		String matricula_a_buscar;
		matricula_a_buscar = leer.nextLine();
		return matricula_a_buscar;
	}

	public static void mostrar_clase_vehiculo(String clase, String matricula) {
		String texto = "VAS MODIFICAR UN/A "+clase+" CON MATRICULA "+matricula;
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}
	
	public static int mostrar_elimina_vehiculo(String clase, String matricula) {
		String texto = "VAS A ELIMINAR UN/A "+clase+" CON MATRICULA "+matricula;
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
		System.out.println("¿ESTÁ SEGURO?");
		System.out.println("1 -> SI || 2 -> NO");
		int pregunta = leer.nextInt();
		leer.nextLine();
		return pregunta;
	}
	
	public static void mostrar_no_eliminado_vehiculo(String clase, String matricula) {
		String texto = "EL VEHICULO DE TIPO "+clase+" CON MATRICULA "+matricula+" NO HA SIDO ELIMINADO";
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}
	
	public static void error_encontrar_vehiculo(String matricula) {
		System.out.println("EL VEHICULO CON MATRICULA "+matricula+" NO HA SIDO ENCONTRADO EN LA BASE DE DATOS");
	}

	public static void mostrar_lista_vehiculos() {
		for (Vehiculo v : main.nuestra_empresa.getLista_vehiculos()) {
			v.fichaVehiculo();
		}
	}

	public static String muestra_pedir_dni_persona() {
		System.out.println("INTRODUCE EL DNI DE LA PERSONA A MODIFICAR");
		String dni = leer.nextLine();
		return dni;
	}
	
	public static void muestra_titulo_clientes_anadidos(int num_total) {
		String texto = "BUSCANDO EN UN TOTAL DE "+num_total+" DE CLIENTES";
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}

	public static void cliente_creado() {
		String texto = "CLIENTE AÑADIDO CON EXITO";
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}
	
	public static void mostrar_cliente_a_modificar(String dni) {
		String texto = "VAS MODIFICAR UN CLIENTE CON DNI "+dni;
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}
	
	public static int mostrar_elimina_persona(String clase, String dni) {
		String texto = "VAS A ELIMINAR UN/A "+clase+" CON DNI "+dni;
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
		System.out.println("¿ESTÁ SEGURO?");
		System.out.println("1-> SI || 2-> NO");
		int pregunta = leer.nextInt();
		leer.nextLine();
		return pregunta;
	}
	
	public static void mostrar_no_eliminado_persona(String clase, String dni) {
		String texto = "LA PERSONA "+clase+" CON DNI "+dni+" NO HA SIDO ELIMINADO";
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}
	
	public static void error_encontrar_persona(String dni) {
		System.out.println("LA PERSONA CON DNI "+dni+" NO HA SIDO ENCONTRADA EN LA BASE DE DATOS");
	}

	public static void muestra_titulo_empleados_anadidos(int num_total_empleados) {
		String texto = "BUSCANDO EN UN TOTAL DE "+num_total_empleados+" DE EMPLEADOS";
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}

	public static void empleado_creado() {
		String texto = "EMPLEADO AÑADIDO CON EXITO";
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}
	
	public static void mostrar_empleado_a_modificar(String dni) {
		String texto = "VAS MODIFICAR UN EMPLEADO CON DNI "+dni;
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}

	public static void mostrar_lista_clientes() {
		for (Persona p : main.nuestra_empresa.getLista_clientes()){
			p.fichaPersona();
		}
	}
	
	public static void mostrar_lista_empleado() {
		for (Persona p : main.nuestra_empresa.getPlantilla_emple()){
			p.fichaPersona();
		}
	}

	public static void muestra_titulo_oficinas_anadidas(int num_total) {
		String texto = "BUSCANDO EN UN TOTAL DE "+num_total+" DE OFICINAS";
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}
	
	public static void oficina_creado() {
		String texto = "OFICINA AÑADIDA CON EXITO";
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}

	public static String muestra_pedir_cod_ofi() {
		System.out.println("INTRODUCE EL CODIGO DE LA OFICINA A MODIFICAR");
		String cod = leer.nextLine();
		return cod;
	}

	public static void mostrar_oficina_a_modificar(String cod) {
		String texto = "VAS MODIFICAR UNA OFICINA CON CODIGO "+cod;
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}

	public static int mostrar_elimina_oficina(String cod) {
		String texto = "VAS A ELIMINAR UNA OFICINA CON CODIGO "+cod;
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
		System.out.println("¿ESTÁ SEGURO?");
		System.out.println("1-> SI || 2-> NO");
		int pregunta = leer.nextInt();
		leer.nextLine();
		return pregunta;
	}
	
	public static void mostrar_no_eliminado_oficina(String cod) {
		String texto = "LA OFICINA CON CODIGO "+cod+" NO HA SIDO ELIMINADA";
		System.out.println(texto);
		subrayaTexto(texto.length(),"*");
	}
	
	public static void error_encontrar_oficina(String cod) {
		System.out.println("LA OFICINA CON CODIGO "+cod+" NO HA SIDO ENCONTRADA EN LA BASE DE DATOS");
	}

	public static void mostrar_lista_oficina() {
		for (Oficina o : main.nuestra_empresa.getLista_oficinas()){
			o.fichaOficina();
		}
	}

	public static void pinta_raya() {
		for (int i=0; i<100; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
