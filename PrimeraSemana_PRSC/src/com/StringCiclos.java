package com;

public class StringCiclos {

	public static void main(String[] args) {
		
		//Métodos de la clase String
		
		//Aunque String es un tipo de dato estructurado es una clase
		//la cual contiene métodos específicos
		//que nos ayudan a recorrer caracteres longitud o
		//compararlo contra otro String o un objeto
		
		String cadena = "Hoy es 22 de Marzo de 2023";

//		//.length() - Nos devuelve el valor númerico del tamaño de nuestra
//		// cadena de texto
//		System.out.println(cadena.length());
//		
//		//charAt() - Nos devuelve el caracter que se encuentra en
//		// el índice específicado y comienza por el índice 0
//		System.out.print(cadena.charAt(0));
//		System.out.print(cadena.charAt(1));
//		System.out.println(cadena.charAt(2));
//		
//		//substring() - Nos devuelve una subcadena que va a comenzar
//		//a partir del índice específicado
//		System.out.println(cadena.substring(5));
//		System.out.println(cadena.substring(5,10));
//		
		
//		//toLowerCase - Convierte la cadena de texto a minúsculas
//		System.out.println(cadena.toLowerCase());
//		
//		//toUpperCase - Convierte la cadena de texto a mayúsculas
//		System.out.println(cadena.toUpperCase());
		
		
		//equals () compara el String contra un objeto o
		//contra otro String y nos devuelve un valor True o False
		//System.out.println(cadena.equals("hoy es 22 de Marzo de 2023"));
		
		
		//equalsIgnoreCase - Los compara ignorando el uso de
		// mayúsculas y minúsculas
		
		//System.out.println(cadena.equalsIgnoreCase("hoy es 22 de marzo de 2023"));
		
		
		//CICLOS o también llamados BUCLES
		//Son estructuras que nos van a permitir repetir sentencias
		//o procesos
		
		//while (Mientras - se cumpla una determinada condición)
		
		//Generalmente nos apoyamos en una variable que nos permita
		//tener un indicador o control
		
//		int x = 1;
//		
//		while (x<4) { //Mientras - condición - x sea menor a 4, reliza determinada acción
//			System.out.println("Hola mundo");
//			//Después de que realice el proceso de salida en consola
//			//para controlarlo puedo indicar un incremento en x
//			x++;
//		}
		
		//do - while (Ejecuta una vez, mientras...)
		
//		int x = 1;
//		
//		do { //Pedrile que haga lo siguiente al menos una vez y después
//			// se complementa con el while para verificar si debe
//			//seguir ejecutando esta acción
//			//en caso de no cumplirse la condición
//			// nos aseguramos que el programa se ejecutará por lo menos una vez
//			System.out.println("Hola mundo");
//			x++;
//		}while (x<6);
		
		//FOR (Para - las siguientes condiciones realiza la siguiente acción
		
		for (int i=5; i<10; i++ ) {
			System.out.println("Hola mundo " + i);
		}
	}

}
