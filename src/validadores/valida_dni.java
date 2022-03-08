package validadores;

public class valida_dni {

	public static boolean validarDNI(String dni) {
			
			boolean validado = false;
			
			String num;
			int apoyonum;
			double resto;
			int tope;
			
			String letradni;
			String letrasegun = "";
			//String[] letras = {"T","R"};
			
			tope = dni.length();
			
			num = dni.substring(0, tope-1);
			apoyonum = Integer.parseInt(num);
			
			letradni = dni.substring(tope-1, tope);
			
			resto = apoyonum%23;
			
			//int a = (int)Math.floor(3.5);
			
			if ((int)Math.floor(resto)==0) {
				letrasegun = "T";
			} else if ((int)Math.floor(resto)==1) {
				letrasegun = "R";
			} else if ((int)Math.floor(resto)==2) {
				letrasegun = "w";
			} else if ((int)Math.floor(resto)==3) {
				letrasegun = "A";
			} else if ((int)Math.floor(resto)==4) {
				letrasegun = "G";
			} else if ((int)Math.floor(resto)==5) {
				letrasegun = "M";
			} else if ((int)Math.floor(resto)==6) {
				letrasegun = "Y";
			} else if ((int)Math.floor(resto)==7) {
				letrasegun = "F";
			} else if ((int)Math.floor(resto)==8) {
				letrasegun = "P";
			} else if ((int)Math.floor(resto)==9) {
				letrasegun = "D";
			} else if ((int)Math.floor(resto)==10) {
				letrasegun = "X";
			} else if ((int)Math.floor(resto)==11) {
				letrasegun = "B";
			} else if ((int)Math.floor(resto)==12) {
				letrasegun = "N";
			} else if ((int)Math.floor(resto)==13) {
				letrasegun = "J";
			} else if ((int)Math.floor(resto)==14) {
				letrasegun = "Z";
			} else if ((int)Math.floor(resto)==15) {
				letrasegun = "S";
			} else if ((int)Math.floor(resto)==16) {
				letrasegun = "Q";
			} else if ((int)Math.floor(resto)==17) {
				letrasegun = "V";
			} else if ((int)Math.floor(resto)==18) {
				letrasegun = "H";
			} else if ((int)Math.floor(resto)==19) {
				letrasegun = "L";
			} else if ((int)Math.floor(resto)==20) {
				letrasegun = "C";
			} else if ((int)Math.floor(resto)==21) {
				letrasegun = "K";
			} else if ((int)Math.floor(resto)==22) {
				letrasegun = "E";
			}
			
			if (letradni.equalsIgnoreCase(letrasegun)) {
				validado = true;
			}
			
			return validado;	
		}
	
}
