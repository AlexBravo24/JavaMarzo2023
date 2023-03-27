package com;

public class EstructurasControl {

	public static void main(String[] args) {
		// Se puede generar automaticamente el metodo main seleccionandolo cuando se crea la clase
		//main+ctrl+espacio+enter y se contruye en caso de olvidarlo
		
//		//ESTRUCTURAS CONTROL
//		//Estructuras de decisión IF -Valores booleanos
//		
		//int x = 11; 
//		
//		if (x<10) { //abro mi condición, la que estará entre parentesis
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
//				//Metodo length me devuelve elvalor numérico de la longitud del string
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
//				//Con operadores lógicos AND, OR, NOT, DIFERENTE DE, IGUALDAD
//				
//				//AND- Se escribe && Devuelve un valor true cuando se cumplen todas las condiciones
//				if (nombre.length()<15 && nombre.length()>9) {
//					System.out.println("Efectivamente");
//				}else {
//					System.out.println("ñañais");
//				}
//			//Operador OR - Se indican con ||- Devulven un valor true cuando se cumpla al menos una condición 
//				if (nombre.length()<15 || nombre.length()>9) {
//					System.out.println("Efectivamente");
//				}else {
//					System.out.println("ñañais");
//				}
//			//Operador NOT - Se indica con !- Niega una condición o cambie al valor de true a false y viceversa
//				if (!(nombre.length()<15)) {
//					System.out.println("Efectivamente");
//				}else {
//					System.out.println("ñañais");
//				}
//			
//			//Operaror IGUALDAD o COMPARACIÓN  - Se escribe == - Compara el valor, si es igual, mandra true, si no es igual manda false
//			// Un solo igual significa asignación 
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
//			System.out.println("Miércoles");
//		}else {
//			System.out.println("Desconocido");
//		}
//		
		//Estructura de decisión SWITCH-CASE
		
		int dia = 7;
		
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
			break;
		default:
			System.out.println("Desconocido");
		}
		
	}
}
