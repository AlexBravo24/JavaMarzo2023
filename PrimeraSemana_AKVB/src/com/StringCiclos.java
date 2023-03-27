package com;

public class StringCiclos {
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//M�TODOS DE LA CLASE STRING
		
		/*String contiene m�todos que ayudan a recorrer caracteres, 
		 * longitud o comparar con otro String o incluso objetos.
		 */
		
		String cadena = "Hoy es 22 de Marzo de 2023";
		/* .length() - Nos devuelve el valor num�rico del tama�o
		 * de la cadena.
		 */
		
		System.out.println("Cadena: " + cadena);
		System.out.println("El largo de cadena es: " + cadena.length());
		
		/* .charAt() - Nos devuelve el caracter que se encuentra en
		 * el �ndice espec�ficado, comenzando desde 0.
		 * [ARRAYS START AT 0 FTW]
		 */
		System.out.println("charAt(): ");
		System.out.println(cadena.charAt(0));
		System.out.println(cadena.charAt(1));
		System.out.println(cadena.charAt(2));
		
		/* .substring - Devuelve una subcadena comenzando 
		 * a partir del �ndice especificado.
		 */
		System.out.println("Substring: ");
		System.out.println(cadena.substring(7));
		System.out.println("Substring 7 - 18:");
		System.out.println(cadena.substring(7,18));
		
		//.toLowerCase - Convierte la cadena de texto a min�sculas.
		System.out.println("toLowerCase():");
		System.out.println(cadena.toLowerCase());
		
		//.toUpperCase - Convierte la cadena de texto a may�sculas.
		System.out.println("toUpperCase():");
		System.out.println(cadena.toUpperCase());
		
		/* .equals() - Compara el Strinf con un Objeto o String y devuelve
		 * un valor TRUE o FALSE dependiendo si son iguales.
		 */
		
		System.out.println(cadena.equals("Hoy es 21 de Marzo de 2023"));
		System.out.println(cadena.equals("hoy es 22 de marzo de 2023"));
		
		/* .equalsIgnoreCase() - Compara ignorando el uso
		 * de MAY�SCULAS y min�sculas.
		 */
		System.out.println(cadena.equalsIgnoreCase("hoy es 22 de marzo de 2023"));

		/* CICLOS
		 * Son estructuras que nos permiten repetir sentencias o procesos.
		 */
		
		/*WHILE(condicion){accion}
		 * Generalmente nos apoyamos en una variable que permite
		 * tener un indicador o control.
		 */
		
		int x = 1;
		
		while (x<4) {
			System.out.println("Hello World!");
			x++;
		}
		/* DO WHILE
		 * Ejecuta m�nimo una vez, incluso si la condici�n no se cumple.
		 */
		int y = 5;
		do {
			System.out.println("Hello World! (do while)");
		}while(y<1);
		
		/* FOR
		 * 	Indica una condici�n para finalizar y realiza incrementos
		 * a la variable de control.
		 */
		System.out.println("\nFOR");
		for(int i = 5; i<10; i++)
		{
			System.out.println("Hello world("+ i +")!");
		}
	}

}
