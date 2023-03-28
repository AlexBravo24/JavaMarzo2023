package com; //linea corresponde al nombre del paquete

public class TiposDeDatos { // nombre de la clase
	
@SuppressWarnings("unused")
public static void main(String[] args) { //llave de apertura de main
	// para ejecutar el codigo se ocupa un metodo principal nos permita darle entrada o salida a nuestros datos

	//dos diagonales comentan y no interfieren en el código
	
	/*
	 * *lineas multiples al comentar
	 * 
	 */
	
	/*TIPOS DE DATOS PRIMITIVOS
	 * NUMERICOS ENTEROS
	 */
	
	//podemos tener variables declaradas pero no iniciadas es decir no tiene valor asignado
	
	byte b;
	short s;
	int i;
	long l;
	
	 b=70;
	 
	 //variable declaradas e iniciadas
	 byte by = -128; //podemos asignarle valor de -128 a 127, emplea 8 bits 1  byte en memoria
	 short sh = -32768; //admitevalores de -32769 a 32767 emplea 2 bytes
	 int x=-2147483648; //emplea 4 bytes valores de -2,147,483,648  
	 long l2=2147483648l; //admite valores muy grandes pero despues de rebasar se necesita
	 // indicar elvalor sufijo "l" (no es doce lleva l al inicio)
	 

	
	//regularmente la variable "comodin"a utilizar es int
	 
	 /*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN punto o comaflotante es decir valores num con decimales
		 */
		
	float f=300.1478f; //ocupa una memoria 4 bytes y para decimales cita de sufijo "f"
	double d=89999000.12276767263;  
	
	 //la variable mas utilizada es double;
	
	/*TIPOS DE DATOS PRIMITIVOS
	 * BOOLEANOS
	 * CARACTER
	 */ 
	
	boolean boo = false; // adminten valores de verdaderoo falso
	//facilitan el trabajo al momento de evaluar expresiones o condiciones
	
	char caracter = 'a'; //solo admiten un caracter y ocupan una memoria de 2 bytes, asiganmos el vaklor abriendo comilla simple
	
	String cadena = "Esto es un ejemplo de cadena de texto";
	String nombre;
	nombre = "Ariana";  //
	
	//atajo syso + ctl + espacio 
	//Para poder darle salida a los datos en consula utilizamos la instrucción con system
	 //System.out.println(cadena);
	 
	 
	 //se pueden concatenar mensajes o valores para mostrar
	 System.out.println("Mi nombre es " + nombre);
	 
	 /*TIPOS DE DATOS ESTRUCTURADOS U OBJETO
	  * TIPO WRAPER O ENVOLTORIO
	  * SON CLASES QUE AÑADEN OTRAS PROPIEDADES O METODO A NUESTRA VARIABLE O DATOS
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
	
	
}// llave de cierre de main
	
	
} // cierra clase
