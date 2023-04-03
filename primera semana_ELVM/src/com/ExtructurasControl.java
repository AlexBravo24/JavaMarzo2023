package com;

public class ExtructurasControl {

	public static void main(String[] args) {
		
//		//Estruccturas Control
//		//Estructuras de decisión IF - Valores booleanos
//		
//		int x=11;
//		
//		if (x<10) {
//			System.out.println("es menor que 10");
//		}else {
//			System.out.println("es mayor que 10");
//		}
//		
//		String nombre="alejandro";
//		System.out.println(nombre.length());//metodo length devuelve el valor de la longitud del string
		
//		if(nombre.length()<10) {
//			System.out.println("si es menor");
//		}else {
//			System.out.println("no es menor");
//		}
		//System.out.println(nombre.length()+x);
		//puedo sumar el valor devuelto por el metodo length con---
		//otro valor numerico.
		
//-----------------------------------------------------------------------------------
		//condiciones compluestas
		//con operadores logicos con AND, OR,NOT, DIFERENTES DE, IGUALDAD
			
		//AND  --&&-- devuelve un valor true cuando se cumple todas las condiciones
//		if(nombre.length()<15 && nombre.length()>9) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
//		//OR --||--devuelve un valor cuando se cumpla almenos una condiccion
//		if(nombre.length()<15 || nombre.length()>9) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
//		
//		//NOT --! --Niega la condiccion/cambia el valor de true a false y viseversa
//		if(!(nombre.length()<15)) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
//		
//		//IGUALDAD O COMPARACIÓN --==-- COMPARAR EL VALOR, SI ES IGUAL, MANDA TRUE, SINO, DEVULVE FALSE
//		//UN SOLO IGUAL SIGNIFICA ASIGNACION
//		if(x==11) {
//			System.out.println("ES IGUAL");
//		}else {
//			System.out.println("NO ES IGUAL");
//		}
//		
//		//diferente de -- != --- compara el valor y si es diferente devuelve true
//		if(x!=10) {
//			System.out.println("es diferente");
//		}else {
//			System.out.println("no es diferente");
//		}
//		
		//estructura if-else concatenado o if-else anidado
//		int dia=4;
//		if (dia==1) {
//			System.out.println("lunes");
//		}else if(dia==2) {
//			System.out.println("martes");
//		}else if(dia==3) {
//			System.out.println("miércoles");
//		}else {
//			System.out.println("desconocido");
//		}
//		
		//Estructura de Decision SWITCH-CASE
		int dia =7;
		switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		default:
			System.out.println("desconocido");
		}
	}

}
