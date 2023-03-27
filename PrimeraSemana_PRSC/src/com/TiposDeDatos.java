package com; //Primera línea responde al nombre del paquete

public class TiposDeDatos { //Nombre de la clase y su llave apertura

public static void main(String[] args) { //Llave de apertura del main
	// Para ejecutar el código necesitamos un método principal
	// que nos permita dar entrada o salida a los datos
	
	//Dos diagonales para escribir una línea de comentario
		//Los comentarios no interfieren en la ejecucuón del código
		//Tecla Ctrl y símbolo + para aumentar el tamaño de la fuente
		
		
		/* Comentario de múltiples líneas
		 * iniciando con diagonal y asterisco (/*)
		 * 
		 * Guardar cambios en la clase con Ctrl + s
		 */
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS ENTEROS
		 */
	
	//Podemos tener variables declaradas pero no iniciadas
	// Es decir, no tienen un valor asignado
	
	byte b;
	short s;
	int i;
	long l;
	
	b=70;
	
	//Variables declaradas e iniciadas
	
	byte by = -127; //Podemos asignarle valor de -128 a 127, emplea 8bits o 1 byte en memoria
	short sh= -32768; //Admite valores de -32768 a 32767 emplea 2 bytes
	int x=-2117403647; //emplea 4 bytes y admite valores de -2,147,403,648 hasta 2,147,403,647
	long l2= 2147403648l; //admite valores muy grandes, pero después de
	//rebasar el límite del rango de los "int" se necesita indicarle el valor
	//con un sufijo de letra "l"
	
	//Regularmente la variable comodín a utilizar es la de tipo int
	
	
	/*TIPOS DE DATOS PRIMITIVOS
	 * NÚMERICOS EN PUNTO O COMA FLOTANTE
	 * Es decir, son valores numéricos con decimales
	 */
	
	float f = 300.1478f; //Ocupa una memoria de 4 bytes y para el uso  de decimales
	//nececita el sufijo "f"
	double d = 89999000.21276767263;
	
	//La variable más utilizada es la double
	
	/*TIPOS DE DATOS PRIMITIVOS
	 * BOOLEANOS
	 * CARACTER
	 */
	
	boolean boo = false; //Solo admiten valores de verdadero o falso
	//Facilitan el trabajo al momento de evaluar expresiones o condiciones
	
	
	char caracter = 'a'; //Solo admite un caracter y ocupan una memoria de 2 bytes
	//asignamos el valor poniendo comilla simple
	
	/*TIPOS DE DATOS OBJETO
	 * TIPOS DE DATOS ESTRUCTURADOS
	 */
	
	String cadena = "Esto es un ejemplo de cadena de texto";
	
	String nombre;
	
	String numero = "5";
	
	System.out.println(numero);
	
	nombre = "Pedro Rafael";
	
	//para poder darle salida a los datos en consola
	//utilizamos una función System
	
	System.out.println(); //para escribir esta sentencia utilizamos el atajo
	//syso + ctrl + espacio
	System.out.println(nombre);
	System.out.println(d);
	
	//se pueden concatenar mensajes o valores para mostrar
	System.out.println("Mi nombre es " + nombre);
	
	
	/*TIPOS DE DATOS ESTRUCTURADOS
	 * TIPO WRAPPER (ENVOLTORIO)
	 * Son clases que añaden otras propiedades o métodos a nuestras
	 * variables o datos
	 */
	
	Byte bl = 127;
	Integer il;
	Short shl;
	Long l3;
	Double d4;
	Boolean bu;
	Character letra;
	Float f2;
	
	System.out.println(bl.doubleValue());
	
	
	} //Llave de cierre del main
	} //Llave de cierre de la clase
