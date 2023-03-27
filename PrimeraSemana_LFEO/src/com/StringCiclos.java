package com;

public class StringCiclos {

	public static void main(String[] args) {
		// Metodos de la clase String
		
		//Aunque String es un tipo de dato estructurado, es una clase
		//la cual tiene metodos especificos
		//que nos ayuda a recorrer caracteres, longitud, o
		//compararlo con otro String o incluso un objeto
		
		String cadena = "Hoy es 22 de Marzo de 2023";
		
		//.length()- nos devuelve el valor numerico del tamaño de nuestra cadena de texto
		
		//System.out.println(cadena.length());
		
		//charAt() - nos devuelve el caracter que se encuentra en el indice especificado
		// y comienza por el indice 0
		//System.out.print(cadena.charAt(0));
		//System.out.print(cadena.charAt(1));
		//System.out.print(cadena.charAt(2));
		//System.out.println();
		
		
		//substring()- Nos devuelve una subcadena que va a comenzar a partir del indice especificado
		//System.out.println(cadena.substring(5));
		//System.out.println(cadena.substring(5, 10));
		
		
		//toLowerCase - convierte la cadena de texto en minusculas
		//System.out.println(cadena.toLowerCase());
		
		//toUpperCase - convierte la cadena de texto en Mayusculas
		//System.out.println(cadena.toUpperCase());
		
		//equals() compara el string contra un objeto o contra otro string y nos devuelve el valor true o false
		
		//System.out.println(cadena.equals("hoy es 22 de marzo de 2023"));
		
		//equalsIsIgnoreCase - los compara ignorando el uso de mayusculas y minusculas
		
		//System.out.println(cadena.equalsIgnoreCase("hoy es 22 de marzo de 2023"));
		
		
		//CICLOS o tambien llamados BUCLES
		//SOn estructuras que nos van a permitir repetir sentencias o procesos
		
		//while (mientras - se cumpla una determinada condicion)
		//Generalmente nos apoyamos en una variable que nos permita tener un indicador o control
		
//		int x =1;
//		
//		while(x<4) { //mienttras - condicion x sea menor a 4 realiza lo siguiente
//			System.out.println("HOLA MUNDO");
//			//DESPUES DE QUE REALICE EL PROCESO DE SALIDA EN CONSOLA PARA CONTROLARLO PUEDO INFICAR UN INCREMENTO EN X
//			x++;
//		}
		
		//do - while (Ejecuta una vez, mientras...)
		
        //CICLO FOR (Para las siguientes condiciones realiza la siguiente accion)
		
		for(int i=5; i<10; i++) {
			System.out.println("HOLA MUNDO"+i);
			
		}
		

	}

}
