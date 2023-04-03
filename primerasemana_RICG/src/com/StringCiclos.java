package com;

public class StringCiclos {

	public static void main(String[] args) {
		//Metodos de la clase String
		
		//Aunque String es un tipo de dato estructurado, pero a su vez es una clase la cual contiene metodos especificos
		//Que nos ayudan a recorrer carateres, longitus o comparalo con otro String o incluso un objeto.
		

		String cadena = "Hoy es 22 de Marzo de 2023";
		//.length - Nos devuelve el  valor numerico del tamaño de nuestra cadena de texto
		//System.out.println(cadena.length());
		
		//charAL() - Nos devuelve el caracter que se encuentra en el indice especificado
		//y comienzan por el indicice 0
	
		//System.out.print(cadena.charAt(0));//decuelve la letra que se encuentra en la posicion
		//System.out.print(cadena.charAt(1));
		//System.out.print(cadena.charAt(2));
		//System.out.println();
		//substring()- Nos devuelve una subcadena que va a comenzar apartir del indice especificado
		//System.out.println(cadena.substring(5));
		//System.out.println(cadena.substring(5,10));//Indica donde comienza y donde termina
		
		//tolowerCase - Convierte la cadena de texto a minusculas
		//System.out.println(cadena.toLowerCase());
		
		//toUpperCase - Convierte todas a mayusculas
		//System.out.println(cadena.toUpperCase());
		
		//equals () Compara el String contra otro objeto o contra otro String
		//y nos devuelve un valor true o false
		//

		
		//equalsIgnoreCase - Los compara ignorando el uso de mayusculas y el uso de minusculas 
		//System.out.println(cadena.equalsIgnoreCase("hoy es 22 de marzo de 2023"));
		
		//CICLOS O TAMBIEN LLAMADOS BUCLES 
		//Son estructuras que nos van a permitir cumplir sentencias o procesos 
		
		//ciclo while - Mientras se cumpla una determinada condicion 
		//generalmente nos apoyamos en una variable que nos permita tener un indicador o control
		
//		int x=1;
//		
//		while (x<4) {//Mientras x sea menor a 4, realiza lo siguiente
//			System.out.println("Hola mundo");
//			//Despues de que realice el proceso de salida en consola
//			//para controlarlo puedo indicar un incremento en x
//			x++;
//		}
		
		// do while - Se ejucuta una vez, mientras...}
		/*
		 *  //int x = 5;
		 *  do {//pedirle que haga lo siguiente al menos una vez y despues se acompletas con el while para 
		 *  //seguir ejecutando esta acción
		 *  //se ejecuta aunque la condicion no sea adecuada
		 *  //System.out.println("Hola mundo");
			
		//}while(x<1);
		*/
		
		//FOR Para - las siguientes condiciones realiza la siguiente accion
		
		for(int i=5; i<10; i++) {
			System.out.println("Hola mundo" + i);
		}
		
	}
	
	

}

