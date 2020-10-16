package cl.ulagos.aplication;

public class Identificador {
	
	//ingresa palabra
	public boolean validarIdentificador(String s) {

		char achar;
		boolean idValido = false;
		//primer indice debe ser letra
		
		if(s != null && s.length()>0) {		
		achar = s.charAt(0);
		idValido = sValido(achar);
		
		//largo palabra
		if ((s.length() > 1))
		{
			//segundo indice
			achar = s.charAt(1);
			int i = 1;
			//repite todos los indices
			while (i < s.length() -1) {
				achar = s.charAt(i);
				if (!fValido(achar)) 
					idValido = false;
				i++;

			}
		}
		}
		// si validacion de caracteres y largo
		if (idValido && (s.length() >=1) && (s.length() < 6))
			return true;
		else
			return false;
	}
	
	// indice 0 valida estos caracteres
	public boolean sValido(char ch) {

		if (((ch>= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z')))
			return true;
		else
			return false;
	}
	
	//indice > 0 valida estos caracteres
	public boolean fValido(char ch) {
		
		if (((ch>= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z')) || ((ch >='0') && (ch <= '9')))
			return true;
		else
			return false;
	}

}
