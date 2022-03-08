package validadores;

public class generales {
	
	public static boolean valida_cod_categoria(String opcion) {
		String cadena = "ABCD";
		boolean validado;
		if (opcion.equalsIgnoreCase("a") ||
			opcion.equalsIgnoreCase("b") ||
			opcion.equalsIgnoreCase("c") ||
			opcion.equalsIgnoreCase("d")) {
			validado = true;
		} else {
			validado = false;
		}
		return validado;
	}
	
	public static boolean valida_desc_categoria(String opcion) {
		boolean validado;
		if (opcion.equalsIgnoreCase("ECONOMICO") ||
				opcion.equalsIgnoreCase("MEDIO") ||
				opcion.equalsIgnoreCase("PREMIUM")) {
			validado = true;
		} else {
			validado = false;
		}
		return validado;
	}
	
	public static boolean valida_emisiones(String opcion) {
		String cadena = "ABC";
		boolean validado;
		if (opcion.indexOf(cadena) > 0) {
			validado = true;
		} else {
			validado = false;
		}
		return validado;
	}

	public static boolean valida_carnet(String opcion) {
		String cadena = "ABC";
		boolean validado;
		if (opcion.indexOf(cadena) > 0) {
			validado = true;
		} else {
			validado = false;
		}
		return validado;
	}
	
	public static boolean valida_carnet_req2(String opcion) {
		boolean validado;
		if (opcion.equalsIgnoreCase("AM") ||
				opcion.equalsIgnoreCase("A1") ||
				opcion.equalsIgnoreCase("A2")) {
			validado = true;
		} else {
			validado = false;
		}
		return validado;
	}

	public static boolean valida_tipo_coche(String opcion) {
		boolean validado;
		if (opcion.equalsIgnoreCase("DEPORTIVO") ||
				opcion.equalsIgnoreCase("FAMILIAR") ||
				opcion.equalsIgnoreCase("4x4")) {
			validado = true;
		} else {
			validado = false;
		}
		return validado;
	}

}
