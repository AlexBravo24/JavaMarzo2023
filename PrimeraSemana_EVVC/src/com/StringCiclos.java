package com;

public class StringCiclos {

	public static void main(String[] args) {
		// METODOS DE LA CLASE STRING (Algunos)
		
		/* Aunque String es un tipo de dato estructurado, es una clase la cual contiene m�todos
		 * espec�ficos que nos ayudan a recorrer caracteres, longitud o comprararlo contra otro
		 * String o incluso un objeto
		 */
		String cadena = "Hoy es 22 de marzo de 2023";
		
//		// .lnegth() - Nos devuleve el valor num�rico del tama�o de nuestra cadena de texto
//		
//		System.out.println(cadena.length());
//		
//		// charAt() - Nos devuleve el caracter que se encuentra en el �ndice especificado. Empieza
//		// por el indice 0 , en caso de la oraci�n H ser�a el o
//		
//		System.out.print(cadena.charAt(0));
//		System.out.print(cadena.charAt(1));
//		System.out.print(cadena.charAt(2));
//		
//		//substring() - Nos devuelve una sub cadena que comienza a partir del indice espec�ficado
//		
//		System.out.println("\n" +cadena.substring(5));//aqu� solo se le da un inicio
//		System.out.println("\n" +cadena.substring(5,10)); // aqu� se le pone un inicio y un fin
//		
//		//toLowercase - Convierte la cadena de texto en min�sculas
//		
//		System.out.println(cadena.toLowerCase());
//		
//		//toUpperCase - Nos convierte todas a may�sculas
//		 
//		System.out.println(cadena.toUpperCase());
		
		//equals () - Compara el String contra un objeto o contra otro string y nos devulve un
		// valor True o False
		
		//System.out.println(cadena.equals("hoy es 22 de marzo de 2023")); //es sensible a min o may
		
		//equalsIgnoreCase - Los compara ignorando el uso de may�sculas y min�sculas
		
		//System.out.println(cadena.equalsIgnoreCase("hoy es 22 de marzo de 2023"));
		
		/*������CICLOS O BUCLES!!!!!!
		 * Son estructuras que nos permiten repetir sentencias o procesos
		 * dependiendo de las necesidades algunos ser�n mas comodos que otros
		 */
		
		//while- Mientras se cumpla una determinada condici�n
		//generalmente nos apoyamos en una variable que nos permita tener un indicador o control
		
//		int x=1;
//		
//		while (x<4) { // miesntras x sea menor a 4 realiza lo siguiente
//			System.out.println("Hola mundo"); // despu�s de que realice el proceso de salida en
//			// consola puedo indicar un incremento a x
//			x++;
//			
//		}
//		
//		// do - while  :Ejecuta una vez mientras
//		 int x=1;
//		  
//		 do { // pedirle que haga lo sig.al menos una vez y despu�s se complementa con el while para
//			 // verificar si debe seguir ejecutando esta acci�n
//			 //en caso de no cumplirse la condicion nos aseguramos que el programa se ejecutara 1vez
//			 System.out.println("Hola mundo"); 
//			 x++;
//		 } while (x<6);
//		 
		 
		 /* FOR -Para las sigueintes condiciones realiza la sigueinte acci�n 
		  * 
		  */
		  for (int i=0; i<cadena.length() ; i ++) {
			  System.out.print(cadena.charAt(i));
		  }

		
	}

}
