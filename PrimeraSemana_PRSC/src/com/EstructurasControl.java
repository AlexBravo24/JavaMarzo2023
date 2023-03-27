package com;

public class EstructurasControl {

	public static void main(String[] args) {
	
//		//Estructuras Control
//		//Estructuras de decisión IF - Valores Booleanos
//		
//		int x = 11;
////		
////		if (x<10) { //Abro mi condición, la cual estará entre parentesis
////			//y posteriormente abro una llave para indicar que se va
////			//a ejecutar o realizar
////			System.out.println("Es menor");
////		}else {
////			System.out.println("Es mayor");
////		}
//		
//		String nombre = "Pedro";
//		System.out.println(nombre.length()); //El método length
//		//me devuelve el valor numérico de la longitud del String
//		
////		if (nombre.length()<10) {
////			System.out.println("Si es menor");
////		} else {
////			System.out.println("No es menor");
////		}
//		
//	//	System.out.println(nombre.length()+x);
//		//Puedo sumar el valor devuelto por el método length
//		//otro valor numérico
//		
//		//Condiciones compuestas
//		//con operadores lógicos AND, OR, NOT, DIFERENTE DE, IGUALDAD
//		
//		//AND  - && - Devuelve un valor true cuando se cumplen
//		//las condiciones
//		
//		if (nombre.length()<15 && nombre.length()>9) {
//			System.out.println("si");
//		} else { 
//			System.out.println("No");
//		}
//		
//		//OR - || - Devuelven un valor True cuando se cumpla al menos una condición
//		
//		if (nombre.length()<15 && nombre.length()>4) {
//			System.out.println("si");
//		} else {
//			System.out.println("No");
//		}
//		
//	//NOT - ! Niega una condición/Cambia el valor de True a False y viceversa
//		
//		if (!(nombre.length()<15)) {
//			System.out.println("si");
//		} else {
//			System.out.println("No");
//		}
//		
//		//IGUALDAD o COMPARACIÓN - == - Comparar el valor, si es igual manda True, si no, devuelve False
//		//Un sólo igual significa asignación
//		
//		if (x==11) {
//			System.out.println("Si es igual");
//		}else { 
//			System.out.println("No es igual");
//		}
//		
//		//DIFERENTE DE - != - Compara el valor y si es diferente manda el valor True
//		
//		if (x!=10) {
//			System.out.println("Si es diferente");
//		}else {
//			System.out.println("No es diferente");
//		}
		
		//Estructura if-else concatenado o if-else anidado
		
//		int dia = 4;
//		
//		if (dia==1) {
//			System.out.println("Lunes");
//		}else if (dia==2) {
//			System.out.println("Martes");
//		}else if (dia==3) {
//			System.out.println("Miercoles");
//		}else {
//			System.out.println("Desconocido");
//		}
		
		//Estructura de decisión SWITCH-CASE
		
		int dia = 8;
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("MArtes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
			default:
				System.out.println("Desconocido");		
		}
	}	
}
