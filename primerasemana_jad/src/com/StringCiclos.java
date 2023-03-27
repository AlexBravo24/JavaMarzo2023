package com;

public class StringCiclos {

	public static void main(String[] args) {
		// metodos de la clase string
		//aunque string es un tipo de dato estructurado, es una clase la cual contiene metodos
		//especificos, que nos ayuda a recorrer caracteres, longitud o compararalo con 
		//otro string o incluso un objeto
		String cadena ="hoy es 22 de marzo de 2023";
		//.length no devuelve el valor numerico de la cadena de datos
		System.out.println(cadena.length());
		//charAt(); nos devualve el caracter que se encuentra en el indice especificado
		//y comienza desde el 0
		System.out.println(cadena.charAt(1));
		
		// substring()- nos devuelve una subcadena que va a comenzar a partir del indice especificado
		System.out.println(cadena.substring(5));
		
		System.out.println(cadena.substring(5,10));//donde inicia y donde termina el string
		
		//toLowerCase - convierte la cadena de texto en minusculas
		System.out.println(cadena.toLowerCase());
		
		//toUpperCase - nos conviere todas en mayusculas
		System.out.println(cadena.toUpperCase());
		
		// equals()- compara el string contra un objeto o contra otro string y nos devuelve
		// true o false
		System.out.println(cadena.equals("Hoy es 22 de marzo de 2023"));
		
		//equalsIgnoreCase - los compara ignorando el uso de mayusculas y minusculas
		System.out.println(cadena.equalsIgnoreCase("HOY ES 21 DE MARZO DE 2023"));
	
		

	}

}
