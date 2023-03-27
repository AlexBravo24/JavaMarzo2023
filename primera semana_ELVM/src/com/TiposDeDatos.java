package com;//corresponde al nombre del paquete 

public class TiposDeDatos {//nombre de la clase y su llave de apertura
	
	public static void main(String[] args) {//para ejecutar el codigo necesitamos un metodo principal que nos permita darle entrada o salida a nuesstros datos
	//dos diagonales para escribir una linea de comentario
	//los comentarios no interfieren en la ejecución del código
	//tecla ctrl y simbolo +,- para el cambio de tamaño de la fuente
	
	
	/*comentarios de multiples lineas
	 * 
	 * guardar cambios en la clase con ctrl + S
	 * 
	 * 
	 */
	
	/*TIPOS DE DATOS PRIMITIVOAS
	 * NUMEROS ENTEROS
	 */
	
	// podemos tener variables declaradas
		
		byte b;
		short s;
		int i;
		long l;
		
		b=70;
		//variables declaras e iniciadas
		
		byte by =-128;//podemos asignarle valor de -128 a 127, emplea 8 bits
		short sh = -32768;//podemos asignarle valor de -32768 a 32767 emplea 2 byte
		int x=-2147483648;//emplea 4 byte y admite valores de -2147483648 a 2147483647
		long l2 = 2147483648l;//admite valores muy grandes, pero despues de rebasar el limite de el rango de los int, entonces se le tiene que poner la letra "l"
		
		//regular mente la variable comodin a utilizar es la de tipo int
		
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTO O COMA FLTANTE
		 * es decir, sn valores numéricos con decimales
		 * 
		 */
		float f= 300.1478f;// ocupa una memoria de 4 byte y para el uso de decimales necesita del sufijo"f"
		double d = 99899899898.12223244545;
		
		//la variable mas utilizada es la double
		
		/*TIPOSB DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 * 
		 */
		
		boolean boo =false;//solo admiten valores de verdader y falso "true y false"
		//facilitan el trabajo al momento de evaluar expresiones o condiciones
		
		char caracter ='e';//solo admite un caracter y ocupan una memoria de 2 bytes
		//asignamos el valor abriendo comillas simple
		
		/*TIPOPS DE DATOS OBJETOS
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * 
		 */
		
		String cadena ="Estro es un ejemplo de cadena de texto";
		
		
		String nombre;
		nombre ="erick luis";
		
		
		//para poder darle salida a los datos en consola
		//utilizamos una instruccion con System
		
		System.out.println(nombre);
		System.out.println(d);
		//syso+ctrl + spacio
		//System.out.println();
		//sepuede concatenar mensajes
		System.out.println("mi nombre es " + nombre);
		/*TIPO DE DATOS ESTRUCTURADOS
		 * TIPO WRAPPER (ENVOLTORIO)
		 * SON CLASES QUE AÑADEN OTRAS PROPIEDADES O METODOS A NUESTRAS VARIABLES
		 * 
		 */
		Byte b1=127;
		Integer i1;
		Short sh1;
		Long l3;
		Double d4;
		Boolean bu;
		Character letra;
		Float f2;
		System.out.println(b1.doubleValue());
		
	}//llave de cierre del main
		
}//llave de cierre de la clase
