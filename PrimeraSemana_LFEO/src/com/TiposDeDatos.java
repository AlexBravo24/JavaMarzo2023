package com; //primera linea crorresponde al nombre del paquete

public class TiposDeDatos { //nombre de la clase
	
	public static void main(String[] args) {
		//para ejecutar el codigo necesitamos de un metodo principaal
		
		//tecla Ctrl y simbolo + para aumentar tamaño de fuente
		//guardar cambios en la clase con Ctrl + s
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS ENTEROS
		 */
		
		//podemos tener variables declaradas pero no iniciadas, es decir no tienen un valor asignado
		
		byte b;
		short s;
		int i;
		long l;
		
		b = 70;
		
		//variables declaradas e iniciadas
		
		byte by = 127;  //podemos asignar valor de -128 a 127, emplea 8 bits o 1 byte en memoria
		short sh =-32768; //admite valores de -32768 a 32767 emplea 2 byte
		int x = 10; //admite valores de -2,147,483, 648 hasta 2, 147, 483, 647 emplea 4 bytes
		long l2 = 2147483649l; //admite valores mas grandes pero despues de rebasar el limite de los "int" se necesita indicar el valor
		//con un sufijo de letra "l"
		
		//Regularmente la variable comodin a utilizar es la de tipo int
		
		/*TIPOS DE DATOS PRIITIVOS
		 * NUUMERICOS EN PUNTO O COMA FLOTANTE
		 * Es decir, son valores numericos con decimales
		 * */
		float f = 300.1478f; //ocupa una memoria de 4 bytes y para el uso de decimales 
		//necesita del sufijo "f"
		double d = 89999000.21276767263;
		
		//la variable mas utilizable es la "double"
		
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 * */
		boolean boo = false; //solo admiten valores de verdadero o falso
		//facilitan el trabajo al momento de evaluar expresiones o condiciones
		char caracter = 'a'; // solo admiten un caracter y ocupan una memoria de 2 bytes
		//asignamos el valor abriendo comillas simples
		
		
		/*TIPOS DE DATO OBJETO
		 * TIPOS DE DATOS ESTRUCTURADOS
	     */
		String cadena = "ESTO ES UN EJEMPLO DE CADENA DE TEXTO";
		
		String nombre;
		
		nombre = "LUCIO FABIAN ESCOBAR OVANDO";
		
		//para poder darle salida a los datos en consola
		//utilizamos una instruccion con System
		
		System.out.println(nombre);
		System.out.println(d);
		
		//se puede concatenar mensajes o valores a mostrar
		System.out.println("Mi nombre es :"+nombre);
		
		/*TIPO DE DATOS ESTRUCTURADOS U OBJETO
		 * TIPO WRAPPER (ENVOLTORIO)
		 * Son clases que añaden otras propiedades o metodos a nuestras
		 * variables o datos
		 * */
		
		Byte b1 = 127;
		Integer i1;
		Short sh1;
		Long l3;
		Double d4;
		Boolean bu;
		Character letra;
		Float f2;
		
		System.out.println(b1.doubleValue());
	}//lave de cierre del main
	
	

}// llave de cierrede la clase
