package com;

public class StringCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//M�todos de la clase String
		/*
		 * Aunque String es un tipo de dato estructurado, es una clase
		 * la cual contiene m�todos espec�ficos que nos ayudan a recorrer 
		 * caracteres, longitud, o compararlo contra otro String o incluso un objeto.
		 */
		
//		String cadena = "Hoy es 22 de marzo de 2023";
//		
//		//.length() - Nos devuelve el valor num�rico del tama�o de nuestra cadena de texto
//		System.out.println(cadena.length());
//		
//		/*charAt() - Nos devuelve el caracter que se encuentra en �ndice especificado
//		 *y comienza por el �ndice 0.
//		 */
//		
//		System.out.print(cadena.charAt(0));
//		System.out.print(cadena.charAt(1));
//		System.out.print(cadena.charAt(2));
//		System.out.println();
//		
//		//substring() -  Nos devuelve una subcadena que va a comenzar a partir del �ndice especificado.
//		
//		System.out.println(cadena.substring(5));
//		System.out.println(cadena.substring(5,10));
//		
//		//toLowerCase - Convierte la cadena de texto min�sculas.
//		System.out.println(cadena.toLowerCase());
//		
//		//toUpperCase - Convierte la cadena de texto a may�sculas.
//		System.out.println(cadena.toUpperCase());
//		
//		//equals () Compara el String contra un objeto o contra otro String y nos devuelve un valor True o False.
//		System.out.println(cadena.equals("Hoy es 22 de marzo de 2023"));
//		
//		//equalsIgnoreCase - Los compara ignorando el uso de may�sculas y min�sculas.
//		System.out.println(cadena.equalsIgnoreCase("hoy es 22 de marzo de 2023"));
//		
//		//CICLOS o tambi�n llamados BUCLES son estructuras que nos van a permitir repetir sentencias o procesos.
//		
//		//while (Mientras - se cumpla una determinada condici�n)
//		//Generalmente nos apoyamos en una variable que nos permita tener un indicador o control.
//		int x = 1;
//		
//		while (x<4) { // Mientras - condicion - x sea menor a 4,realiza lo siguiente.
//			System.out.println("Hola mundo");
//			// Despues de que realice el proceso de salida en consola para controlarlo puedo indicar un incremento en x.
//			x++;
//		}
//		
//		//do - while (Ejecuta 1 vez, mientras...)
//		int x = 1;
//		
//		do { /*Pedirle que haga lo siguiente al menos una vez y despu�s se complementa con el while para verificar si debe seguir ejecutando esta acci�n.
//			  *En caso de no cumplirse la condici�n nos aseguramos que el programa se ejecutar� por lo menos 1 vez.
//			  */
//			
//			System.out.println("Hola Mundo");
//			x++;
//			
//		}while(x<6);
		
		//FOR (Para las siguientes condiciones realiza la siguiente acci�n)
		
		for(int i=5; i<10; i++) {
			System.out.println("Hola mundo" + i);
		}
			
	}

}
