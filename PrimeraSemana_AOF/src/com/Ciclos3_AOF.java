package com;

public class Ciclos3_AOF {

	

	public static void main(String [] args) {
		// TODO Auto-generated method stub

		// Realiza un programa para determinar si un String es pal�ndromo.
		
		
	
	
		String[] cadenas = { "Ava", "Tarro", "Oso", "AL�"};
		for (String cadena : cadenas) {
			System.out.println("La palabra " + cadena + " es pal�ndromo ? " + esPalindromo(cadena));
		}
	}

	public static boolean esPalindromo(String cadena) {
		// Convertir a min�scula y quitar espacios puntos  y comas 
		cadena = cadena.toLowerCase().replace("�", "a").replace("�", "e").replace("�", "i").replace("�", "o")
				.replace("�", "u").replace(" ", "").replace(".", "").replace(",", "");
//		// Invertir la cadena, 
//		// son pal�ndromos
		
		String invertida = new StringBuilder(cadena).reverse().toString();
				return invertida.equals(cadena);
	}
}

	//CIERRA
