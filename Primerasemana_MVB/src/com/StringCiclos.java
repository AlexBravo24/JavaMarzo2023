package com;

public class StringCiclos {

	public static void main(String[] args) {
		
		// M�todos de la clase String 
		//Aunque String es un tipo de dato estructurado, es una clase la cual contiene m�todos
		//espec�ficos que nos ayudan a recorrer caracteres, longitud o compararlo
		//contra otro String o incluso un objeto. 
		
//		String cadena = "Hoy es 22 de Marzo de 2023";
	
//		//.length() - Nos devuelve el valor num�rico del tama�o de nuestra cadena de texto
//		System.out.println(cadena.length()); 
//		
//		//charAt() - Nos devuelve el caracter que se encuentra en el �ndice especificado 
//		//y comienza por el �ndice 0
//		
//		System.out.print(cadena.charAt(0));
//		System.out.print(cadena.charAt(1)); // si le quitas ln se escribe en una l�nea
//		System.out.print(cadena.charAt(2));
//		System.out.println();
//		//substring - Nos devuelve una subcadena que va a comenzar a partir del �nidice 
//		//especificado. 
//	
//		System.out.println(cadena.substring(5));
//		System.out.println(cadena.substring(5,10));
		
//		//toLower case - convierte la cadena de texto a min�sculas
//		System.out.println(cadena.toLowerCase());
//		//toUpper case - convierte la cadena de texto a mayusculas
//		System.out.println(cadena.toUpperCase());
		
		//equals () (Compara el String contra otro objeto o contra otro String y nos devuelve
		//un valor TRUE Y FALSE 
//		System.out.println(cadena.equals("Hoy es 22 de Marzo de 2023")); //recuerda que java es
		//sensible a May�suclas y Min�sculas
		
		//equalsIgnoreCase - Los compara ignorando el uso de may�sculas y min�sculas
//		System.out.println(cadena.equalsIgnoreCase("Hoy es 22 de marzo de 2023"));
		
	//CICLOS o tambi�n llamados BUCLES
	// Son estructuras que nos van a permitir repetir sentencias o procesos 
	
	//WHILE (mientras se cumpla un determinada condici�n) 
		// generalmente nos apoyamos de en una variable que nos permita tener un indicador o control
	
//		int x = 1;
//		
//		while (x<4) { //mientras -condicion- x- sea menor a 4, realiza lo siguiente
//		System.out.println("Hola Mundo");
//		//Despu�s que realice el proceso de salida en consola, para contolarlo puedo indicar un
//		//incrementi en x.
//		x++; 
//		}
		
   // DO WHILE - (Ejecuta una vez mientras ...) 
		
		int x = 1;
			
			do {//Pedirle que haga lo siguiente al menoz una vez y despu�s se complementa 
				//con el while para verificar si debe seguir ejecutando esta acci�n
				//en caso de no cumplirse esta condici�n nos aseguramos que el programa
				//se ejecutar� por lo menos una vez
		System.out.println("Hola mundo");
		x++;
		}while (x<6);
		
	//FOR (Para las siguientes condiciones realiza la siguiente acci�n)
		
			for (int i=5; i<10; i++) {
				System.out.println("Hola mundo " + i);
			}
		
	
		
		
		
		
		
		
		
		
		
		
	}//CIERRE DEL MAIN

}//CIERRDE DE LA CLASE
