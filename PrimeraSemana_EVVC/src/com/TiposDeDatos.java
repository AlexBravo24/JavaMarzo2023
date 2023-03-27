package com;//La primera línea corresponde al nombre del paquete

public class TiposDeDatos {//Nombre de la clase y su llave de apertura
	public static void main (String[] args) {
		//Dos diagonales para escribir una linea de comentario
		//Los comentarios no interfieren en la ejecución del código
		//Tecla Ctrl y simbolo + para aumentar tamanos de fuente 
			
			/* Comentarios de multiples líneas
			 * Si das enter te manda a la linea de abajo
			 * a diferencia del de una línea 
			 * Se inicia con diagonal y asterisco, enter
			 * Para guardar cambios en la clase ctrl+s
			 * 
			 */
			/*TIPOS DE DATOS PRIMITIVOS
			 * NUMÉRICOS ENTEROS
			 */
		// Podemos tener varibles declaradas pero no iniciadas
			// es decir, no tienen un valor asignado
		byte b; 
		short s;
		int i; 
		long l;
		
		b=70; 
		
		//Variables declaradas e iniciadas
	
		byte by = 127; // Podemos asignarle valor de -128 a 127 emplea 1 byte
		short sh = -3769; //Admite valores de -32768 a 32767 emplea 2 bytes
		int x=10; // Emplea 4 bytes y admite valores de - 2, 147, 483 648 a 2 147 483 647 
		long l2 = 2147483649l; //admite valores muy grandes pero después de revasar el límite
		// del rango de los int se necesita indicar el valor con un sufijo letra "l" L miniscula 
		// Regularmente la variable comodin a utilizar es la variable int
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS EN PUNTO O COMO FLOTANTE
		 * Es decir, son valores con decimales
		 */
		
		float f= 300.11478f; //Para aceptar los decimales necesita un sufijo de letra f
		// Ocupa una memoria de 4 bytes
		double d= 899999000.224851824851; // Es la variable mas utilizada
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * Booleanos
		 * Caracter
		 */
		boolean boo= false; //Solo admiten valores de verdadero y falso
		//Facilitan el trabajo al momento de evaluar expresiones o condiciones 
		
		char caracter = 'a'; //Solo admiten un caracter y ocupan una memoria de 2 bytes
		//Asignamos el valor abriendo comilla simple
		
		/* TIPOS DE DATOS OBJETO
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * Tienen mas funciones y metodos propios
		 */
		
		String cadena = "Esto es un ejemplo de cadena de texto";
		// Para asignarle un valor se abren comillas dobles
		
		String nombre; 
	
		String numero ="5";
		System.out.println(numero);
		
		nombre = "Eva Viridiana";
		
		// Para poder darle salida a los datos en consola 
		//Utilizamos una instruccion con System
		
		System.out.println("Hola");
		
		//utilizar syso +Ctrl+ espacio 
		System.out.println(nombre);
		
		//Se pueden concatenar mensajes o valores para mostrar 
		System.out.println("Mi nombre es " + nombre);
		
		/* TIPOS DE DATOS ESTRUCTURADOS U OBJETO
		 * TIPO WRAPPER (ENVOLTORIO)
		 * Son clases que añaden otras propiedades o metodos 
		 * a nuestras variables o datos
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
		
		
			
	}  
	
	
	
	
	
}//Llave de cierre de la clase
