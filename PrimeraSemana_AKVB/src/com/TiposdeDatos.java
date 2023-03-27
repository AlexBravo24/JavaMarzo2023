package com;

public class TiposdeDatos {//nombre de la clase

	@SuppressWarnings("unused")
	public static void main(String[] args){
		
		//Declaring main() because it's needed.
		//this is a comment
		//this is another  comment
		//Ctrl + for font size
		
		/*
		 * These are a lot of lines, maybe over 9000 lines
		 * These are a lot of lines, maybe over 9000 lines
		 * 
		 * To save changes use  ctrl + s
		 * 
		*/

		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS ENTEROS
		 */
		
		//Variables declaradas sin inicializar.
		
		byte b;
		short s;
		int i;
		long l;
		
		b = 70;
		
		//La más usada es int
		
		//Variables declaradas e inicializadas.
		
		byte by = 127;	//byte acepta valores entre -128 y 127 (8 bits o 1 byte)
		short sh = -32768;	//short acepta entre -32768 y 32767 (2 bytes)
		int x = -2147483648;	//int acepta entre -2,147,483,648 y 2,147,483,647(4 bytes)
		long l2 = 2147483648l;	//admite valores mayores a 2147483647 (int), siempre que se le indique con el sufijo "l"
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS EN PUNTO O COMA FLOTANTE
		 * */
		
		float f = 300.1478f;	//Memoria de 4 bytes y para decimales usa sufijo "f"
		double d = 89999000.21276767263;	//datos muy grandes y decimales sin sufijo
		
		//La más usada es double
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean boo = false;	//Valores verdadero y falso
		//Facilitan evaluar expresiones o condiciones
		
		
		char caracter = 'a';	//Memoria de 2 bytes y admiten caracter
		
		
		/*TIPOS DE DATOS OBJETO
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * 
		 */
		
		String cadena = "This is the Way";
		String nombre;
		String world = "Hello world!";
		nombre = "Ángel Kevin Velázquez Barraza";
		
		//Salida de datos
		
		//Atajo para println "syso" + Ctrl + Space
		System.out.println(world);
		System.out.println(nombre);
		System.out.println("Regresamos 11:30 am.");
		//Concatenar mensajes usando el símbolo +
		System.out.println("double: " + d);
		
		/*TIPOS DE DATOS ESTRUCTURADOS U OBJETO
		 *  TIPO WRAPPER (ENVOLTORIO)
		 *  Añaden otras propiedades o métodos a nuestras variables o datos. 
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
	}//main() ends.
	
}	//class ends.
