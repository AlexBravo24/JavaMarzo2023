package com;

public class EstructurasControl {

	public static void main(String[] args) {
		// Se puede generar automaticamente el metodo main seleccionandolo cuando se crea la clase
		//main+ctrl+espacio+enter y se contruye en caso de olvidarlo
		
//		//ESTRUCTURAS CONTROL
//		//Estructuras de decisi�n IF -Valores booleanos
//		
		//int x = 11; 
//		
//		if (x<10) { //abro mi condici�n, la que estar� entre parentesis
//			// y posteriormente abro la llave para indicar que se va a ejecutar o realizar
//			
//			System.out.println("Es menor");
//			
//		} else {
//			System.out.println("es mayor");
//		}

//		String nombre= "Viridiana";
//		
//				System.out.println(nombre.length());
//				//Metodo length me devuelve elvalor num�rico de la longitud del string
//				
//				if (nombre.length()<10) {
//					System.out.println("Si es menor");
//					
//				} else {
//					System.out.println("No es menor");
//				}
				//System.out.println(nombre.length()+x);
				//Puedo sumar el valor devuelto por el metido length con otro valor numerico
				
//	// CONDICIONES COMPUESTAS
//				//Con operadores l�gicos AND, OR, NOT, DIFERENTE DE, IGUALDAD
//				
//				//AND- Se escribe && Devuelve un valor true cuando se cumplen todas las condiciones
//				if (nombre.length()<15 && nombre.length()>9) {
//					System.out.println("Efectivamente");
//				}else {
//					System.out.println("�a�ais");
//				}
//			//Operador OR - Se indican con ||- Devulven un valor true cuando se cumpla al menos una condici�n 
//				if (nombre.length()<15 || nombre.length()>9) {
//					System.out.println("Efectivamente");
//				}else {
//					System.out.println("�a�ais");
//				}
//			//Operador NOT - Se indica con !- Niega una condici�n o cambie al valor de true a false y viceversa
//				if (!(nombre.length()<15)) {
//					System.out.println("Efectivamente");
//				}else {
//					System.out.println("�a�ais");
//				}
//			
//			//Operaror IGUALDAD o COMPARACI�N  - Se escribe == - Compara el valor, si es igual, mandra true, si no es igual manda false
//			// Un solo igual significa asignaci�n 
//				
//			if (x==11)	 {
//				System.out.println("Si, es igual");
//				
//			}else {
//				System.out.println("No es igual");
//			}
//			
//			//Operador diferente de - Se escribe != - Compara el valor y si es diferente manda true
//			 if (x!=11) {
//				 System.out.println("Si es diferente");
//			 } else {
//				 System.out.println("No es diferente");
//			 }
			// Estructura if-else concatenado o if-else anidado
			 
//		int dia=4; 
//		
//		if (dia==1) {
//			System.out.println("Lunes");
//		}else if (dia==2) {
//			System.out.println("Martes");
//		}else if (dia==3) {
//			System.out.println("Mi�rcoles");
//		}else {
//			System.out.println("Desconocido");
//		}
//		
		//Estructura de decisi�n SWITCH-CASE
		
		int dia = 7;
		
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
			break;
		default:
			System.out.println("Desconocido");
		}
		
	}
}
