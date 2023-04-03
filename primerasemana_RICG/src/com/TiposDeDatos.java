package com; //primera linea corresponde al nombre del paquete

public class TiposDeDatos { //Nombre de la clase y su llave de apertura
	
	public static void main(String [] args) { //permite ejecutar código metodo principal para dar entrada y salida a nuestros datos
	

		//Dos diagonales para escribir una linea de comentario
		//los comentarios no interfieren enla ejecución del código

		/*comentarios de multiples lineas
		 * iniciando con una diagonal y asterisco(/*)
		 * Guardar cambios en la clase con ctrl + s
		 */
		
		/*TIPOS DE DATOS PRIMITIVOS 
		 * NUMERICOS ENTEROS 
		 */
		//podemos tener variables declaradas pero no iniciadas.
		//Es decir, no tienen un valor asignado.
		
		byte b;
		short a;
		int i;
		long l;
		
		b=70;
		
		//variables declaradas e iniciadas
		byte by= 127; //Podemos asignarle -128 a 127, emplea 8 bits o un byte
		short sh= -32768; //admite valos de -32768 a 32767, emplea dos bytes
		int x=2147403640; //emplea 4 bytes y admite valores  
		long lz = 2147403640l; //admite valores muy grandes, pero desoues de revasar el limite de los "int" se necesita indicarle el valor con un sufijo de letra 
		
		//Regularmente la variable comodin a utlizar es la variable de tipo "int"
		
		/*TIPOS DE DATOS PRIMITIVOS 
		 * NUMERICOS DE PUNTO O COMA FLOTANTE 
		 * Es decir, son valores numericos con decimales
		 */
		
		float f = 300.1478f; //ocupa una memoria de 4 bytes y para el uso de decimales 
		//necesita del sufijo "f"
		double d = 89999000.21276767263;
		//la variable mas utilizada es la double 
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOLEANOS
		 * CARACTER
		 */
		
		boolean boo= false; //solo admiten valores de verdadero y falso
		//facilitan el trabajo al momento de evaluar expresiones o condiciones 
		
		char caracter = 'a'; //solo admiten yuna caracter y ocupan una memoria de 2 bytes, asignamos el valor abriendo una comilla simple
		
		/*TIPOS DE DATOS OBJETOS 
		 * TIPOS DE DATOS ESTRUCTURADOS
		 */
		
		String cadena = "Esto es un ejemplo de cadena de texto";
		
		String nombre;
		
		nombre = "Rosario Ivett";
		
		//para poder darle salida a los datos en consola utilizaremos una instruccion con System
		
		System.out.println();//para escribir esta sentencia se escribe el atajo (syso + ctrl + espacio)
		System.out.println(nombre);
		
		System.out.println(d);
		
		//se pueden concatenar mensajes o valores para mostrar
		
		System.out.println("Mi nombre es " + nombre);
		
		/*TIPOS DE DATOS ESTRUCTURADOS U OBJETO
		 * TIPO WRAPPER
		 * son clases 
		 */
		
		Byte b1 =127;
		Integer i1;
		Short s1;
		Long l3;
		Double d4;
		Boolean bu;
		Character letra;
		Float f2;
		
		System.out.println(b1.doubleValue());
		
		
	}// llave de cierre de main
	
	
	
	
}//llave de cierre de la clase 
