package com;

public class StringCiclos {

	public static void main(String[] args) {
		// METODOS DE LA CLASE STRING (Algunos)
		
		/* Aunque String es un tipo de dato estructurado, es una clase la cual contiene métodos
		 * específicos que nos ayudan a recorrer caracteres, longitud o comprararlo contra otro
		 * String o incluso un objeto
		 */
		String cadena = "Hoy es 22 de marzo de 2023";
		
//		// .lnegth() - Nos devuleve el valor numérico del tamaño de nuestra cadena de texto
//		
//		System.out.println(cadena.length());
//		
//		// charAt() - Nos devuleve el caracter que se encuentra en el índice especificado. Empieza
//		// por el indice 0 , en caso de la oración H sería el o
//		
//		System.out.print(cadena.charAt(0));
//		System.out.print(cadena.charAt(1));
//		System.out.print(cadena.charAt(2));
//		
//		//substring() - Nos devuelve una sub cadena que comienza a partir del indice específicado
//		
//		System.out.println("\n" +cadena.substring(5));//aquí solo se le da un inicio
//		System.out.println("\n" +cadena.substring(5,10)); // aquí se le pone un inicio y un fin
//		
//		//toLowercase - Convierte la cadena de texto en minúsculas
//		
//		System.out.println(cadena.toLowerCase());
//		
//		//toUpperCase - Nos convierte todas a mayúsculas
//		 
//		System.out.println(cadena.toUpperCase());
		
		//equals () - Compara el String contra un objeto o contra otro string y nos devulve un
		// valor True o False
		
		//System.out.println(cadena.equals("hoy es 22 de marzo de 2023")); //es sensible a min o may
		
		//equalsIgnoreCase - Los compara ignorando el uso de mayúsculas y minúsculas
		
		//System.out.println(cadena.equalsIgnoreCase("hoy es 22 de marzo de 2023"));
		
		/*¡¡¡¡¡¡CICLOS O BUCLES!!!!!!
		 * Son estructuras que nos permiten repetir sentencias o procesos
		 * dependiendo de las necesidades algunos serán mas comodos que otros
		 */
		
		//while- Mientras se cumpla una determinada condición
		//generalmente nos apoyamos en una variable que nos permita tener un indicador o control
		
//		int x=1;
//		
//		while (x<4) { // miesntras x sea menor a 4 realiza lo siguiente
//			System.out.println("Hola mundo"); // después de que realice el proceso de salida en
//			// consola puedo indicar un incremento a x
//			x++;
//			
//		}
//		
//		// do - while  :Ejecuta una vez mientras
//		 int x=1;
//		  
//		 do { // pedirle que haga lo sig.al menos una vez y después se complementa con el while para
//			 // verificar si debe seguir ejecutando esta acción
//			 //en caso de no cumplirse la condicion nos aseguramos que el programa se ejecutara 1vez
//			 System.out.println("Hola mundo"); 
//			 x++;
//		 } while (x<6);
//		 
		 
		 /* FOR -Para las sigueintes condiciones realiza la sigueinte acción 
		  * 
		  */
		  for (int i=0; i<cadena.length() ; i ++) {
			  System.out.print(cadena.charAt(i));
		  }

		
	}

}
