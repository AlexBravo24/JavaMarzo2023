package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		//Estructuras control
		//Estructuras de decicion IF - Valores booleanos
		
//		int x = 9;
//		
//		if (x<10) { //abro mi condicion la cual estara en parentesis
//			//y posteriormente abor una llave para indicar que se va
//			//a ejecutar o realizar
//			System.out.println("Es menor");
//		}else {
//			System.out.println("Es mayor");
//		} 
//		String nombre="Luis";
//		System.out.println(nombre.length());//El metodo length me 
//		//devuelve el valor numerico de la longitud de string
//		
//		if (nombre.length()<10); {
//			System.out.println("Si es menor");
//		} else {
//		System.out.println("No es menor");	
//		}
//		System.out.println(nombre.length()+x);
		//Puedo sumar el valor devuelto por el metodo lenght con
		//otros valores numericos
		
		//Condiciones compuestas
		//Con operadores logicos AND, OR, NOT DIFERENTE DE, IGUALDAD
		
		//AND - && - Devuelve un valor true cuendo se cumplen todas 
		//las condiciones
		
//		if (nombre.length()<15 && nombre.length()>=9) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		//OR - || - Devuelve un valor True cuando al menos se cumpla una condicion
//		if (nombre.length()<15 || nombre.length()>=9) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//NOT - ! - Niega una condicion o cambia el valor de True a False o viceversa
//		if (!(nombre.length()<15)) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		//IGUALDAD O COMPARACION - == - COMPARA LOS VALORES, SI ES IGUAL MANDA TRUE
//		//SI ES FALSO MANDA NEGACION
//		//un solo igual significa asignacion
//		
//		if (x==9) {
//			System.out.println("Si es igual");
//			}else {
//				System.out.println("no es igual");
//			}
//		
//		//DIFERENTE DE - != - Compara el valor y si es diferente manda True
//		
//		if (x!=9) {
//			System.out.println("Es diferente");
//		}else {
//			System.out.println("No es diferente");
//		}
		
		//Estructura if-else concatenado o if-else anidado
		
//		int dia=5;
//		
//		if (dia==1) {
//			System.out.println("Es lunes");
//		}else if (dia==2) {
//			System.out.println("Es martes");
//		}else if (dia==3) {
//			System.out.println("Es miercoles");
//		}else { 
//			System.out.println("Desconocido");
//		}
		
		//Estructura de programacion SWITCH-CASE
		int dia = 3;
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
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
