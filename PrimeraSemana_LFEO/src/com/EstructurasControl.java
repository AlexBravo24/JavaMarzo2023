package com;

public class EstructurasControl {

	public static void main(String[] args) {
		//Estructuras Control
		//Estructuras de decision IF- Valores Booleanos
		
	int x = 11;
//		
//		if(x<10) { //Abro mi condicion la cual esta entre parentesis, y despues abro una llave para indicar qu se va a ejecutar o realizar
//			System.out.println(x+ "ES MENOR" );
//			
//		}else {
//			System.out.println("ES MAYOR A:"+x);
//		}
		
//		String nombre = "Fabian";
//		System.out.println(nombre.length()); //El metodo length devuelve el valor numerico de la longitud del String
//		
//		if(nombre.length()<10) {
//			System.out.println("Si es menor");
//		}else {
//			System.out.println("No es menor");
//		}
		
		//System.out.println(nombre.length()+x);
		//Puedo sumar el valor devuelto por el metodo length con otro valor numerico
		
		//Condiciones compuestas con operadores logicos, AND, OR, NOT, DIFERENTE DE IGUALDAD
		
		//AND - && DEVEULVE UN VALOR TRUE CUANDO SE CUMPLEN TODAS LAS CONDICIONES
		
//		if(nombre.length()<15 && nombre.length()>6) {
//			System.out.println("SI");
//		}else {
//			System.out.println("No");
//		}
//		
//		// OR - || DEVUELVE UN VALOR TRUE CUANDO SE CUMPLA AL MENOS UNA CONDICION
//		
//		if(nombre.length()<15 || nombre.length()>6) {
//			System.out.println("SI");
//		}else {
//			System.out.println("No");
//		}
//		
//		//NOT -! - NIEGA UNA CONDICION/ CAMBIA EL VALOR DE TRUE A FALSE O VICEVERSA
//		if(!(nombre.length()<15)) {
//			System.out.println("SI");
//		}else {
//			System.out.println("No");
//		}
//		
//		//IGUALDAD o COMPARACION - = - COMPARA EL VALOR, SI ES IGUAL MANDA TRUE, SI NO, DEVUELVE FALSE
//		//UN SOLO IGUAL SIGNIFICA ASIGNACION
//		
//		if(x==10) {
//			System.out.println("SI ES IGUAL");
//		}else {
//			System.out.println("NO ES IGUAL");
//			
//		}
//		
//		//DIFERENTE DE -!=- COMPARA EL VALOR Y SI ES DIFERENTE MANDA TRUE
//		
//		if(x!=10) {
//			System.out.println("SI ES DIFERENTE");
//		}else {
//			System.out.println("NO ES DIFERENTE");
//		}
		
		//ESTRUCTURA if-else concatenado o if-else anidado
	
//	int dia = 3;
//	
//	if (dia==1) {
//		System.out.println("Lunes");
//	}else if(dia==2) {
//		System.out.println("Martes");
//	}else if(dia==3) {
//		System.out.println("Miercoles");
//	}else {
//		System.out.println("Desconocido");
//	}
	
	//ESTRUCTURA DE DECISION SWITCH-CASE
	
	int dia = 7;
	
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
		break;
	}
	

	}

}
