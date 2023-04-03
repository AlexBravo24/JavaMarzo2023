package com;

public class Ciclos3_AOF {

	

	public static void main(String [] args) {
		// TODO Auto-generated method stub

		// Realiza un programa para determinar si un String es palíndromo.
		
		
	
	
		String[] cadenas = { "Ava", "Tarro", "Oso", "ALÁ"};
		for (String cadena : cadenas) {
			System.out.println("La palabra " + cadena + " es palíndromo ? " + esPalindromo(cadena));
		}
	}

	public static boolean esPalindromo(String cadena) {
		// Convertir a minúscula y quitar espacios puntos  y comas 
		cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
//		// Invertir la cadena, 
//		// son palíndromos
		
		String invertida = new StringBuilder(cadena).reverse().toString();
				return invertida.equals(cadena);
	}
}

	//CIERRA
