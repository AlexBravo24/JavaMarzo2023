package com; //Primera línea corresponde al nombre del paquete.

public class TiposDeDatos { //Nombre de la clase y su llave de apertura.
	
	//Dos diagonales para escribir una línea de comentario.
		//Los comentarios no interfieren en la ejecución del código.
		//Tecla Ctrl y simbolo + para aumentar tamaño de fuente.
		
		/*Comentarios de multiples líneas
		 * iniciando con diagonal y asterisco(/*)
		 * Guardar cambios en la clse con Ctrl + s.
		 */
	
	//main + Ctrl y barra de espacio
	@SuppressWarnings("unused")
	public static void main(String[] args) { //Llave de apertura del main
		/*Para ejecutar el código necesitamos de un método principal 
		 * que nos permita darle entrada o salida a los datos.
		 */
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS ENTEROS
		 */
		
		/*Podemos tener variables declaradas pero no iniciadas, 
		 * es decir, no tienen un valor asignado.
		 */
		
		byte b;
		short s;
		int i;
		long l;
		
		b = 70;
		
		//Variables declaradas e iniciadas
		
		byte by = 127; //Podemos asignarle valor de -128 a 127.Emplea 8 bits o 1 byte en memoria.
		short sh = -32768;//Adminte valores de -32768 a 32767. Emplea 2 bytes en memoria.
		int x = -2147483648;//Emplea 4 bytes y admite valores de -2,147,483,648 a 2,147,483,647.
		long l2 = 2147483648l;//Admite valores muy grandes, pero despues de rebasar el límite de el rango de los "int" se necesita indicar el valor con un sufijo de la letra "l".
		
		//Regularmente la variable comodín a utilizar es la de tipo "int".
		
		/*TIPOS DE DATOS PIMITIVOS
		 * NUMÉRICOS EN PUNTO O COMA FLOTANTE
		 * Es decir, son valores numéricos con decimales
		 */
		
		float f = 300.1478f;//Ocupa una memoria de 4 bytes y para el uso de decimales necesita del sufijo "f".
		double d = 8999990000.21276767263;
		
		//La variable más utilizada es la "double".
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * Booleanos
		 * Caracter
		 */
		
		boolean boo = true;//Solo admiten de tipo verdadero y falso. Facilitan el trabajo al momento de evaluar expresiones o condiciones.
		char caracter = 'a';//Solo admite un caracter y ocupan una memoria de 2 bytes. Asignamos el valor abriendo comilla simple.
			
		/*TIPOS DE DATOS OBJETO
		 * TIPOS DE DATOS ESTRUCTURADOS
		 */
		
		String cadena = "Esto es un ejemplo de cadena de texto";
		
		String nombre;
		
		nombre = "Erika Hernández";
		
		//Para poder darle salida a los datos en consola utilizamos la instrucción con System.
		
		//System.out.println("Hola Mundo");
		System.out.println(nombre);//Para escribir esta sentencia utilizamos el atajo syso + Ctrl + espacio. 
		System.out.println(d);
		
		//Se pueden concatenar mensajes o valores para mostrar.
		System.out.println("Mi nombre es:" + nombre);
		
		/*TIPOS DE DATOS ESTRUCTURADOS U OBJETO
		 * TIPO WRAPPER (ENVOLTORIO)
		 * Son clases que añaden otras propiedades o métodos a nuestras variables o datos.
		 */
				
		Byte b1 = 127;
		Integer i1;
		Short sh1;
		Long l1;
		Double d4;
		Boolean bu;
		Character letra;
		Float f1;
		
		System.out.println(b1.doubleValue());
		
	}//Llave de cierre del main
	
} //Llave de cierre de la clase.
