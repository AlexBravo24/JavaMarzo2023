package com;

public class EstructurasControl {

	public static void main (String[] args) {
		
		//Estructuras Control
		//Estructura de decisi�n IF - Valores Booleanos
		//ESTRUCTURA If-else concatenado o if- else anidado 
		
////		int X = 11;
////		
////		if (X<10) { //Abro mi condici�n, la cual estar� entre parentesis y posteriormente abro una 
////			//llave para indicar que se va a ejecutar o realizar
////			System.out.println("Es menor");
////		}else {
////			System.out.println("Es Mayor");		
////		}
////		
//		String nombre = "Alejandro";
////		System.out.println(nombre.length()); // El m�todo length me devuelve el valor num�rico
////		//de la longitud del String
////		
////		if(nombre.length()<10) {
////			System.out.println("Si es menor");
////		}else {
////			System.out.println("No es menor");
////		}
////		
////		System.out.println(nombre.length()+x);
////		//Puedo sumar el valor devuelto por el m�todo length con otro valor num�rico
//		
//		//Condiciones compuestas
//		//Con operadores l�gicos,AND, OR, NOT, DIFERENTE DE, IGUALDAD
//		
//		//AND - && - Devuelve un valor TRUE cuando cumplen todas las condiciones
//		
//		if (nombre.length()<15 && nombre.length()>-9) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//OR - || -Devuelven un valor TRUE cuando se cumpla al menos una condicion
//		
//		if (nombre.length()<15 || nombre.length()>9) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//NOT - ! - Niega una condici�n/Cambia el valor de TRUE a FALSE y viceversa
//		if (!(nombre.length()<15)) {
//		System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//IGUALDAD O COMPARACI�N - == - Comparar el valor, si es igual, manda un solo igual significa asignaci�n
//		if (x==11) {
//			System.out.println("Si no es igual");
//		}else {
//			System.out.println("No es igual");
//			}
//	
//		//DIFERENTE DE - != - Compara el valor y si es diferente manda TRUE
//		
//		if (x!=11) {
//			System.out.println("Si es diferente");
//		}else {
//			System.out.println("No es diferente");
//		}
//		
//		//Estructura if-else concatenado o if-else anidado
//		int dia = 3; 
//		if (dia==1) {
//			System.out.println("Lunes");
//		}else if (dia==2) {
//			System.out.println("Martes");
//		}else if (dia==3) {
//			System.out.println("Mi�rcoles");
//		}else {
//			System.out.println("Desconocido");
//		}
		 
		//Estructura de decisi�n SWITCH-CASE
		
		int dia = 4;
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break; 
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Mi�rcoles");
			break;
		case 4:
			System.out.println("Jueves");
			default:
				System.out.println("Desconocido");
		}
		
	
		
}//Cierre del main

}//Cierre de clase 
