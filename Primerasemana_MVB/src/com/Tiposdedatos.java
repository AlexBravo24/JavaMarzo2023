package com; //Primera l�nea corresponde al nombre del paquete

public class Tiposdedatos { //Nombre de la clase y su llave de apertura
	
	public static void main(String[] args) { //Llave de arpertua del main
		//Para ejecutar el c�digo necesitamos de un m�todo principal
		// que nos permita darle entrada o salida a los datos

	
	//Dos diagonales para escribir una l�nea de comentario
	//Los comentarios no interfieren en la ejecuci�n del c�digo
	//Tecla Ctrl y s�mbolo + para aumentar tama�o de fuente
	
	/*Comentarios de m�ltiples l�neas
	 * iniciando con diagonal  y asterisco (/*)
	 * 
	 * Guardar cambios en la clase con Ctrl + s
	 * 
	 */
	/*TIPOS DE DATOS PRIMITIVOS
	 * NUM�RICOS ENTEROS
	 */
	//Podemos tener variables declaradas pero no iniciadas.
	// Es decir, no tienen un valor asignado
		
		byte b;
		short s;
		int i;
		long l;
	
		b=70;
		
		//Variables declaradas e iniciadas
		
		byte by = 127; // Podemos asignarle valor de -128 a 127, emplea 8 bits o 1 byte de memoria
		short sh = -32678;//Admite valores de -32678 a 326767 emplea 2 bytes de memoria
		int x= -2147483648; //emplea 4 bytes y admite valores de -2,147,483
		long l2 = 2147483649l;//admite valores muy grandes, pero despu�s de rebasar el l�mite del rango de los "int"
		//se necesita indicarle el valor con un sufijo de letra "l"
		
		//Regurlarmente la variable comodin a usar es la de tipo int.
		
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUM�RICOS EN PUNTO O COMA FLOTANTE
		 * Es decir, son valores num�ricos con decimales
		 */
		
		float f = 300.1478f; //Ocupa una memoria de 4 bytes y para el uso de decimales
		// necesita del sufijo "f"
		double d = 89999000.21276767263;
		
		//La variable m�s utilizada es la double
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean boo = true; //Solo admiten valores de verdadero y falso
		//Facilitan el trabajo al momento de evaluar expresiones o condiciones 
		
		
		char caracter = 'a'; //Solo admiten un caracter y ocupan una memoria de 2 bytes
		//Asignamos el valor abriendo comilla simple
		
		/*TIPOS DE DATOS OBJETO
		 * TIPOS DE DATOS ESTRUCTURADOS
		 */
		
		String cadena = "Esto es un ejemplo de cadena de texto"; 
		
		String nombre;
		
		String numero = "5";
		
		System.out.println(numero);
		
		nombre = "MONSERRAT"; 
		
		//Para poder darle salida a los datos en consola 
		//utilizamos una instrucci�n con Systmen
		
		System.out.println(); //para escribir esta sentencia utilizamos el atajo
		//syso + Ctrl + espacio
		System.out.println(nombre); 
		System.out.println(d);
		
		//Se puede concatenar mensajes o valores para mostrar 
		System.out.println("Mi nombre es " + nombre);
		
		/*TIPOS DE DATOS ESTRUCTURADOS U OBJETO
		 * TIPO WRAPPER (ENVOLTORIO)
		 * Son clases que a�ade otras propiedades o m�todos a nuestras variables o datos
		 */
		
		Byte b1 = 127;
		Integer i1;
		Short sh1;
		Long l3;
		Double d4;
		Boolean bu;
		Character letra;
		Float f2;
		
		System.out.println(b1.doubleValue());
		
		
		
		
} // Llave de cierre del main
} // Llave de cierre de la clase 
