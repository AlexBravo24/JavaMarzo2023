package com;

public class StringCiclos {

	public static void main(String[] args) {
		
		
		//Metodos de la clase string
		
		
		
		//Aunque String es un tipo de datos estructurado, es una clasee
		//la cual contiene metodos especificos
		// que nos ayudan a recorrer caracteres,logitud,o
		//comprarlo contra otro string o incluso un objeto
		
		String cadena ="Hoy es 22 de marzo del 2023";
		//.length() nos devuelve el valor numerico del tamaño de nuestra cadena de texto
		System.out.println(cadena.length());
		
		//metodo charAt() nos devuelve el caracter que se encuentrqa en 
		//el indice especificado y comienza por el indice 0
		
//		ESTO ES MIO DE UN CICLO FOR
//		System.out.println(cadena.charAt(0));
//		for(int i = 0; i <= 27; i = i + 1)
//		{
//			System.out.println(cadena.charAt(i));
//		}
//		
		//substring()-nos devulve una subcadena que va a comenzar
		//a partir del indice especificado
		System.out.println(cadena.substring(5));
		System.out.println(cadena.substring(5,10));
		
		
		//MWTODO toLowerCase -- convierte la cadena de texrto a minusculas
		System.out.println(cadena.toLowerCase());
		//MWTODO toUpperCase -- convierte la cadena de texrto a mayusculas
		System.out.println(cadena.toUpperCase());
		
		
		//Metodo Equals () (compara el String contra un objeto o 
		// contra otro string y nos de vuelve un valor true o false
		System.out.println(cadena.equals("Hoy es 22 de marzo del 2023"));
		
		//equalsIgnoreCase- los compara ignorando el uso de mayusculas y minusculas
		System.out.println(cadena.equalsIgnoreCase("hoy es 22 de marzo del 2023"));
		
		//SICLOS o blucles
		//son estructuras que nos van a permitir pedir sentencias 
		//o procesos
		
		//while --(mientras- se cumpla una determinada condicion)
		
		//generalmente nos apoyamosen una variable que nos permita
		//tener un indicador o control
		
//		int x=1;
//		
//		while(x<4) {//mientras -condicion-x-sea menor a 4 realiza lo siguiente
//			System.out.println("hola mundo");
//			//despues de que realice el proceso de salida en consola
//			//para controlarlo puedo indicar un incremente en x
//			x++;
//			
//		}
		
//		int x=1;
//		//do-while  (ejecuta 1 vez...mientras...)
//		do {//pedir que hago lo siguiente al menos una vez
//			//despues se complementa con el while para verificar si debe seguir ejecutando
//			//en caso de que no cumplira la condicion
//			//nos aseguramos que el programa se ejecutará por lo menos 1 vez
//			System.out.println("hola mundoos");
//			x++;
//		}while(x<6);
//		
		
		//Siclo FOR.. para las siguientes condiciones realiza la siguiente accion
		
		for(int i=5; i<10;i++) {
			System.out.println("hola mundito"+ i);
		}
		
		
	}

}
