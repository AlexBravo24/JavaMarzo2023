package com;

public class StringCiclos {

	public static void main(String[] args) {
		
		// Métodos de la clase String 
		//Aunque String es un tipo de dato estructurado, es una clase la cual contiene métodos
		//específicos que nos ayudan a recorrer caracteres, longitud o compararlo
		//contra otro String o incluso un objeto. 
		
//		String cadena = "Hoy es 22 de Marzo de 2023";
	
//		//.length() - Nos devuelve el valor numérico del tamaño de nuestra cadena de texto
//		System.out.println(cadena.length()); 
//		
//		//charAt() - Nos devuelve el caracter que se encuentra en el índice especificado 
//		//y comienza por el índice 0
//		
//		System.out.print(cadena.charAt(0));
//		System.out.print(cadena.charAt(1)); // si le quitas ln se escribe en una línea
//		System.out.print(cadena.charAt(2));
//		System.out.println();
//		//substring - Nos devuelve una subcadena que va a comenzar a partir del ínidice 
//		//especificado. 
//	
//		System.out.println(cadena.substring(5));
//		System.out.println(cadena.substring(5,10));
		
//		//toLower case - convierte la cadena de texto a minúsculas
//		System.out.println(cadena.toLowerCase());
//		//toUpper case - convierte la cadena de texto a mayusculas
//		System.out.println(cadena.toUpperCase());
		
		//equals () (Compara el String contra otro objeto o contra otro String y nos devuelve
		//un valor TRUE Y FALSE 
//		System.out.println(cadena.equals("Hoy es 22 de Marzo de 2023")); //recuerda que java es
		//sensible a Mayúsuclas y Minúsculas
		
		//equalsIgnoreCase - Los compara ignorando el uso de mayúsculas y minúsculas
//		System.out.println(cadena.equalsIgnoreCase("Hoy es 22 de marzo de 2023"));
		
	//CICLOS o también llamados BUCLES
	// Son estructuras que nos van a permitir repetir sentencias o procesos 
	
	//WHILE (mientras se cumpla un determinada condición) 
		// generalmente nos apoyamos de en una variable que nos permita tener un indicador o control
	
//		int x = 1;
//		
//		while (x<4) { //mientras -condicion- x- sea menor a 4, realiza lo siguiente
//		System.out.println("Hola Mundo");
//		//Después que realice el proceso de salida en consola, para contolarlo puedo indicar un
//		//incrementi en x.
//		x++; 
//		}
		
   // DO WHILE - (Ejecuta una vez mientras ...) 
		
		int x = 1;
			
			do {//Pedirle que haga lo siguiente al menoz una vez y después se complementa 
				//con el while para verificar si debe seguir ejecutando esta acción
				//en caso de no cumplirse esta condición nos aseguramos que el programa
				//se ejecutará por lo menos una vez
		System.out.println("Hola mundo");
		x++;
		}while (x<6);
		
	//FOR (Para las siguientes condiciones realiza la siguiente acción)
		
			for (int i=5; i<10; i++) {
				System.out.println("Hola mundo " + i);
			}
		
	
		
		
		
		
		
		
		
		
		
		
	}//CIERRE DEL MAIN

}//CIERRDE DE LA CLASE
