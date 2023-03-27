package com;

public class EstructurasControl {

	public static void main (String[] args) {
		
		//Estructuras Control
		//Estructura de decisión IF - Valores Booleanos
		//ESTRUCTURA If-else concatenado o if- else anidado 
		
////		int X = 11;
////		
////		if (X<10) { //Abro mi condición, la cual estará entre parentesis y posteriormente abro una 
////			//llave para indicar que se va a ejecutar o realizar
////			System.out.println("Es menor");
////		}else {
////			System.out.println("Es Mayor");		
////		}
////		
//		String nombre = "Alejandro";
////		System.out.println(nombre.length()); // El método length me devuelve el valor numérico
////		//de la longitud del String
////		
////		if(nombre.length()<10) {
////			System.out.println("Si es menor");
////		}else {
////			System.out.println("No es menor");
////		}
////		
////		System.out.println(nombre.length()+x);
////		//Puedo sumar el valor devuelto por el método length con otro valor numérico
//		
//		//Condiciones compuestas
//		//Con operadores lógicos,AND, OR, NOT, DIFERENTE DE, IGUALDAD
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
//		//NOT - ! - Niega una condición/Cambia el valor de TRUE a FALSE y viceversa
//		if (!(nombre.length()<15)) {
//		System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//IGUALDAD O COMPARACIÓN - == - Comparar el valor, si es igual, manda un solo igual significa asignación
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
//			System.out.println("Miércoles");
//		}else {
//			System.out.println("Desconocido");
//		}
		 
		//Estructura de decisión SWITCH-CASE
		
		int dia = 4;
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break; 
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			default:
				System.out.println("Desconocido");
		}
		
	
		
}//Cierre del main

}//Cierre de clase 
