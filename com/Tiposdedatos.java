package com;//primera linea responde al nombre del paquete

public class Tiposdedatos {//nombre de la clase y llave de apertura

	public static void main(String[] args) {//llave de apertura de main
		
		
		//Dos diagonales para escribir una linea de comentarios
		//Los comentarios no interfiere en la ejecucuion del codigo
		//tecla ctrl y simbolo + para aumentar tamaño de fuente
		
		/*comentarios de multiples lineas 
		 * inicia con diagonal y asterisco (/*)
		 * 
		 * para guardar los cambios en la clase con ctrl mas s (ctrl+s)
		 * 
		 */
		
		/*Tipos de datos primitivos
		 * Numericos enteros
		 */
		
		//podemos tener variables declaradas pero no iniciadas
		//es decir, no tiene un valor asignado
		
		byte b;
		short s;
		int i; 
		long l;
		
		b=70; 
		
		//Variables declaradas e iniciadas
		byte by=-128;  //Solo se le puede asignar un valor de -128 a 127; emplea 1 byte
		Short sh= -32768; //Solo se le puede asignar un valor de -32768 a 32767; emplea 2 byte
		int x=2147483647; //emplea 4 byte y admite valores desde -2,147,483,648 a 2,147,483,647
		long l2=21474836478l;//admite valores muy grandes pero despues de rebasar el valor de los "int"
		//se necesita agregar un sufijo de letra ele "l"
		
		//Regularmente la variable comodin a utilizar es "int"
		
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTOS O COMA FLOTANTE
		 * Es decir, son valores numericos con decimales 
		 */
		
		float f=300.1478f; //Ocupa una memoria de 4 bytes y para el uso de decimales 
		//necesita el sufijo "f"
		double d=300.154618948494;
		
		//La variable mas utilizada es la "double"
		
		/*Tipos de datos primitivos
		 * Booleanos
		 * Caracter
		 */
		
		boolean boo=true; //solo admiten valores de verdadero y falso
		//facilitan el trabajo al momento de evaluar expresiones o condiciones
		
		char caracter='a'; //Solo admiten un caracter y ocupan una memoria de 2 bytes
		//asignamos el valor abriendo comilla simple 
		
		/*Tipos de dato objeto
		 * Tipos de datos estructurados
		 */
		
		String cadena="Esto es un ejemplo de cadena de texto";
		String nombre;
		nombre="Luis";
		
		//Para poder darle salida a los datos en consola utilizamos una 
		//instruccion con System
		
		System.out.println(nombre);
		System.out.println(); 
		System.out.println(d);
		//Para escribir esta sentencia utilizamos el atajo
		//syso mas Ctrl mas espacio
		
		//Se pueden concatenar mensajes o valores para mostrar.
		System.out.println("Mi nombre es: " + nombre);
		
		/*TIPOS DE DATOS ESTRUCTURADOS U OBJETOS
		 * Son clases que añaden otras propiedades o metodos a nuestras variables o datos
		 */
		
		Byte b1=127; 
		Integer i2;
		Short sh2;
		Long l3;
		Double d2;
		Boolean b2; 
		Character letra; 
		Float f2; 
		
		System.out.println(b1.doubleValue());
		
		
	}//llave de cierre de main
}//llave de cierre de la case
