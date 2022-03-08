package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import metodos.*;
import clases.Empresa;
import clases.Vehiculo;
import metodos.interfaz;
import metodos.programa;
import menus.menu_principal;

public class main {
	
	public static Empresa nuestra_empresa;
	
	public static void main(String[] args) {
		//INICIO DE PROGRAMA OBLIGATORIO
		//GUARDADO O DESCIFRADO DE FICHERO DE EMPRESA
		boolean primera_vez = programa.comprobacion_fichero();
		interfaz.bienvenida();
		//programa.recuperacion_empresa(primera_vez);
		nuestra_empresa = Empresa.leer_crear_empresa(primera_vez);
		//PROGRAMA PRINCIPAL
		menu_principal.construirMenuPrincipal();
	}
}
